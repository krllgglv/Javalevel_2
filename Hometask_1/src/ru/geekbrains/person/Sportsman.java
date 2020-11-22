package ru.geekbrains.person;

import ru.geekbrains.obstruction.Preventable;

public class Sportsman extends Person implements Sportable {
    private float runLimit;
    private float jumpLimit;
    private float swimLimit;
    private boolean result;

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean getResult() {
        return result;
    }

    public float getRunLimit() {
        return runLimit;
    }

    public float getJumpLimit() {
        return jumpLimit;
    }

    public float getSwimLimit() {
        return swimLimit;
    }

    public Sportsman(int age, String name, int runLimit, float jumpLimit, int swimLimit) {
        super(age, name);
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public boolean run(Preventable p) {
        System.out.println(String.format("%s is running ...",this.name));
        return runLimit>=p.provideAnObstacle();
    }

    @Override
    public boolean jump(Preventable p) {
        System.out.println(String.format("%s is jumping ...",this.name));
        return jumpLimit>=p.provideAnObstacle();
    }

    @Override
    public boolean swim(Preventable p) {
        System.out.println(String.format("%s is swimming ...",this.name));
        return swimLimit>=p.provideAnObstacle();
    }

    @Override
    public String toString() {
        return
                 name +
                ", age= " + age +
                ",runLimit= " + runLimit +
                ", jumpLimit= " + jumpLimit +
                ", swimLimit= " + swimLimit ;

    }
}
