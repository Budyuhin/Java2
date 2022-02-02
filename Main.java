package ru.geekbrains.part2.lesson1;

public class Main {
    public static void main(String[] args) {
        Action [] actions = {
                new Cat (),
                new Robot (),
                new Human()
        };

        Obstecle [] obstecles = {
                new runCross (1000),
                new Wall(1)
        };

        for ( Action a: actions){
            for (Obstecle o: obstecles) {
                if (!o.doSomething(a)) {
                break;
                }
            }
        }

    }
}
