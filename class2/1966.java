package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static LinkedList<Integer> queue = new LinkedList<>();
    public static LinkedList<Integer> target = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringTokenizer important = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < n; j++) {
                queue.offer(Integer.parseInt(important.nextToken()));
                target.offer(j);
            }

            func(n, m);
        }
    }

    public static void func(int n, int m) {
        int count = 0;

        for(int i = 0; i < n; i++) {
            int max = Collections.max(queue);
            for(int j = 0; j < queue.size() - 1; j++) {
                if(queue.get(0) < queue.get(1) || !(queue.peek() == max)) {
                    queue.offer(queue.poll());
                    target.offer(target.poll());
                } else {
                    break;
                }
            }
            if(target.peek() == m) {
                System.out.println(++count);
                queue.clear();
                target.clear();
                break;
            }
            queue.poll();
            target.poll();
            count++;
        }
    }
}
