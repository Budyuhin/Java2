package ru.geekbrains.part2.lesson1;

public class runCross implements Obstecle {
    private int dist;

    public runCross (int dist) {
        this.dist = dist;
    }

    @Override
    public boolean doSomething(Action a) {
        return a.run(dist);
    }
}
