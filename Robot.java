package ru.geekbrains.part2.lesson1;

public class Robot implements Action {
    private int length;
    private int heights;

    public Robot (int length, int heights) {
        this.length = length;
        this.heights = heights;
    }

    public Robot () {this (5000,1);}

    @Override
    public boolean run(int dist) {
        if (dist <= length) {
            System.out.println("Робот пробежал " + length);
            return true;
        } else {
            System.out.println("Робот не пробежал " + length);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= heights) {
            System.out.println("Робот прыгул " + heights);
            return true;
        } else {
            System.out.println("Робот не прыгнул " + heights);
            return false;
        }
    }
}
