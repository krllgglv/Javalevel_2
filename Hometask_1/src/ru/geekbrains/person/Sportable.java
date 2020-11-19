package ru.geekbrains.person;

import ru.geekbrains.obstruction.Preventable;

public interface Sportable {
    boolean run(Preventable p);
    boolean jump(Preventable p);
    boolean swim(Preventable p);
}
