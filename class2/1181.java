package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(str[0]).append('\n');
        for (int i = 1; i < n; i++) {
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}

// 시간 초과!! ㅠㅠㅠㅠ
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        String temp;

        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(str[i].length() > str[j].length()) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                } else if(str[i].length() == str[j].length()) {
                    char[] tempChar1 = str[i].toCharArray();
                    char[] tempChar2 = str[j].toCharArray();

                    for(int k = 0; k < str[i].length(); k++) {
                        if(tempChar1[k] > tempChar2[k]) {
                            temp = str[i];
                            str[i] = str[j];
                            str[j] = temp;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(str[0]);
        for(int i = 1; i < n; i++) {
            if(!str[i].equals(str[i - 1]))
                System.out.println(str[i]);
        }
    }
}
*/
