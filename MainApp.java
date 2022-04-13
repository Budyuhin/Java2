package ru.geekbrains.java3.lesson6;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
//    private static final Logger logger = Logger.getLogger(MainApp.class.getName());
//    public static void main(String[] args) {
//
//        logger.log(Level.INFO, "java core");
//    }

    public static void main(String[] args) {

    }
    public static int[] arrayAfter4 (int[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i +1, arr.length);
            }
        }
        throw new RuntimeException("Отсутствует 4");
    }
    public static boolean arrayContains (int[] arr) {
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1){
                has1 = true;
            }
            if (arr[i] == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }
}
