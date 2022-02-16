package ru.geekbrains.java2.lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        fillArr (arr);
        formula1 (arr);

        fillArr (arr);
        formula2 (arr);
    }

    public static void fillArr (float[] arr) {
        Arrays.fill(arr, 1);
    }

    public static void formula1(float[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void formula2 (float[] arr) {
        long startTime = System.currentTimeMillis();
        float [] a1 = new float[h];
        float [] a2 = new float[h];

        System.arraycopy(arr,0, a1,0,h);
        System.arraycopy(arr, h, a2,0,h);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) ((float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5)) * Math.cos(0.4f + i / 2));
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr,0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
