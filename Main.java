package ru.geekbrains.java2.lesson2;

public class Main {

    static int SIZE = 4;

    public static void main(String[] args) {
        String [][] ABC = {
                {"1", "2", "5", "6", "9"},
                {"3", "4", "7", "8"},
                {"1", "2", "5", "6"},
                {"3", "4", "7", "8"},
        };
        try {
            System.out.print(sum (ABC));
        } catch (MyArraySizeException m) {
            m.printStackTrace();
        } catch (MyArrayDataException m) {
            m.printStackTrace();
            System.out.println(m.getRow () + " " + m.getCol ());
            System.out.println( ABC [m.getRow ()] [m.getCol ()]);
        }
    }

    static int sum (String [][] ABC) throws  MyArrayDataException, MyArraySizeException {
        if (ABC.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < ABC.length; i++) {
            if (ABC[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < ABC.length; i++) {
            for (int j = 0; j < ABC.length; j++) {
                try {
                    sum += Integer.parseInt (ABC [i][j]);
                } catch (NumberFormatException m) {
                    throw new MyArrayDataException ("format" + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }

}
