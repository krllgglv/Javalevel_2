import ru.geekbrains.course.Course;

import ru.geekbrains.team.Team;

public class Main {
    public static void main(String[] args) {
        Team t = new Team("Victory");
        t.printinfo();
        Course c = new Course("course1");
        c.dolt(t);
        t.showResult();


    }
}
