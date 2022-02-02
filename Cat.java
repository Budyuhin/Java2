package ru.geekbrains.part2.lesson1;

public class Cat implements Action {
    private int length;
    private int heights;

    public Cat (int length, int heights) {
        this.length = length;
        this.heights = heights;
    }

    public Cat () {this (200,2);}

    @Override
    public boolean run(int dist) {
        if (dist <= length) {
            System.out.println("Кот пробежал " + length);
            return true;
        } else {
            System.out.println("Кот не пробежал " + length);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= heights) {
            System.out.println("Кот пругнул " + heights);
            return true;
        } else {
            System.out.println("Кот не прыгнул " + heights);
            return false;
        }
    }
}
