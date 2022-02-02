package ru.geekbrains.part2.lesson1;

public class Human implements Action {
    private int length;
    private int heights;

    public Human (int length, int heights) {
        this.length = length;
        this.heights = heights;
    }

    public Human () {this (1000,4);}

    @Override
    public boolean run(int dist) {
        if (dist <= length) {
            System.out.println("Человек пробежал " + length);
            return true;
        } else {
            System.out.println("Человек не пробежал " + length);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= heights) {
            System.out.println("Человек пругнул " + heights);
            return true;
        } else {
            System.out.println("Человек не прыгнул " + heights);
            return false;
        }
    }
}
