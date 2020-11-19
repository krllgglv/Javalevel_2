package ru.geekbrains.course;

import ru.geekbrains.obstruction.*;
import ru.geekbrains.person.Sportsman;
import ru.geekbrains.team.Team;

public class Course {
    private String title;
    private Preventable[] obstructions;

    public Course(String title) {
        this.title = title;
        obstructions = new Preventable[]{
                new Track("track_1", 200),
                new Wall("wall_1", 1),
                new Pool("pool_1", 50)
        };
    }


    public void dolt(Team team) {
        for (Sportsman teammate : team.getTeammates()) {
            boolean bool = false;
            for (Preventable preventable : obstructions) {
                if (preventable instanceof Track) {
                    bool ^= teammate.run(preventable);
                    System.out.println(String.format("Provided distance is %s, his maximum is %s",preventable.provideAnObstacle(),teammate.getRunLimit()));
                } else if (preventable instanceof Wall) {
                    bool ^= teammate.jump(preventable);
                    System.out.println(String.format("Provided height is %s, his maximum is %s",preventable.provideAnObstacle(),teammate.getJumpLimit()));
                } else {
                    bool ^= teammate.swim(preventable);
                    System.out.println(String.format("Provided distance is %s, his maximum is %s",preventable.provideAnObstacle(),teammate.getSwimLimit()));
                }
            }
            teammate.setResult(teammate.getResult() ^ bool);
        }
    }
}

