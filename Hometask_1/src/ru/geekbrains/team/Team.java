package ru.geekbrains.team;

import ru.geekbrains.person.Person;
import ru.geekbrains.person.Sportable;
import ru.geekbrains.person.Sportsman;

public class Team {


    private String name;
    private Sportsman[] teammates;

    public Sportsman[] getTeammates() {
        return teammates;
    }

    public Team(String name) {
        this.name = name;
        this.teammates = new Sportsman[]{
                new Sportsman(22, "Mark", 1000, 1, 200),
                new Sportsman(23, "James", 2000, 2, 300),
                new Sportsman(15, "Mike", 500, 0, 100),
                new Sportsman(10, "Andrew", 100, 0, 10)
        };

    }

    public void showResult() {
        System.out.println("=====================================================");
        System.out.println(" The list of Sportsman, who has successfully finished the Course:");
        for (Sportable teammate : teammates) {
            if ((teammate instanceof Sportsman) && ((Sportsman) teammate).getResult()) {
                System.out.println(teammate);
            }
        }
    }



    public void printinfo() {
        System.out.println("-------------------------------------------");
        System.out.println(String.format("Team name: %s", this.name));
        for (Sportable teammate : teammates) {
            System.out.println(teammate);
        }
        System.out.println("---------------------------------------------");
    }

}
