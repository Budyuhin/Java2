package ru.geekbrains.java3.lesson1;

import fruits.Apple;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"ptk", "rhf", "cby"};
        ArrayList <String> al = arrayToList (arr);
        System.out.println(al);

        BoxWithFruits <Apple> box1 = new BoxWithFruits<> ();
        box1.add (new Apple());
    }

    public static <T> ArrayList <T> arrayToList (T[] arr) {return new ArrayList<>(Arrays.asList(arr));}

    public static  <T> void swap1 (T[] arr, int index1, int index2) {
        T obj = arr [index1];
        arr[index1] = arr [index2];
        arr[index1] = obj;

    }

}
