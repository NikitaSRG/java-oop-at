package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.obstacles.Obstacles;
import ru.geekbrains.java.oop.at.obstacles.Treadmill;
import ru.geekbrains.java.oop.at.obstacles.Wall;
import ru.geekbrains.java.oop.at.participants.Cat;
import ru.geekbrains.java.oop.at.participants.Human;
import ru.geekbrains.java.oop.at.participants.Robot;
import ru.geekbrains.java.oop.at.participants.Runner;

public class Start {
    public static void main(String[] args) {
        Runner catBarsik = new Cat("Barsik", 12, 7);
        Runner catPushok = new Cat("Pushok", 9, 5);
        Runner catVaska = new Cat("Vaska", 18, 10);

        Runner humanPoly = new Human("Poly", 17, 3);
        Runner humanJon = new Human("Jon", 11, 4);
        Runner humanRise = new Human("Rise", 20, 9);

        Runner robotRaf = new Robot("Raf", 17, 4);
        Runner robotJasika = new Robot("Jasika", 12, 1);
        Runner robotKiki = new Robot("Kiki", 21, 30);

        Runner[] runners = {catBarsik, catPushok, catVaska, humanPoly, humanJon, humanRise, robotRaf, robotJasika, robotKiki};


        Obstacles wall = new Wall(10);
        Obstacles wall1 = new Wall(11);
        Obstacles wall2 = new Wall(8);

        Obstacles treadmill = new Treadmill(15);
        Obstacles treadmill1 = new Treadmill(13);
        Obstacles treadmill2 = new Treadmill(17);

        Obstacles[] obstacles = {wall, wall1, wall2, treadmill, treadmill1, treadmill2};


        System.out.println("Погнали!");
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            for (Runner runner : runners) {
                if (runner.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }

            }
        }
    }
}
