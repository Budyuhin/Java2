package ru.geekbrains.part2.lesson1;

public class Wall implements Obstecle {
    private int height;

    public Wall (int height) {
        this.height = height;
    }

    @Override
    public boolean doSomething(Action a) {
        return a.jump (height);
    }
}
