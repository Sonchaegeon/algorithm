package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        long[] arr1 = new long[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = Long.parseLong(st1.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long[] arr2 = new long[m];
        long[] result = new long[m];

        for(int i = 0; i < m; i++) {
            arr2[i] = Long.parseLong(st2.nextToken());
        }

        Arrays.sort(arr1);
        for(int i = 0; i < m; i++) {
            int start = 0;
            int end = arr1.length - 1;
            int mid = (end-start) / 2;

            while(end-start >= 0) {
                if (arr2[i] == arr1[mid]) {
                    result[i] = 1;
                    break;
                } else if(arr1[mid] <= arr2[i]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

                mid = (end+start) / 2;
            }
        }

        for(int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }
    }
}
