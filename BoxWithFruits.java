package ru.geekbrains.java3.lesson1;

import fruits.Fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits <T extends Fruits> {
    private List<T> container;

    public BoxWithFruits () {
        this.container = new ArrayList<>();
    }

    public BoxWithFruits (T... Fruits) {this.container = new ArrayList(Arrays.asList(Fruits)); }

    public int getWeights () {
        int w = 0;
        for (T Fruits: container) {
            w += Fruits.getWeight();
        }
        return w;
    }

    public boolean sameAvg (BoxWithFruits <?> another) {
        return Math.abs(this.getWeights() - another.getWeights())< 0;
    }

    public void transfer (BoxWithFruits <T> another) {
        if (another == this) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T apple) {
    }
}
