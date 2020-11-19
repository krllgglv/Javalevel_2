package ru.geekbrains.obstruction;

public class Wall  extends SportObstruction{
    private int jumpLimit;

    public Wall(String title, int jumpLimit) {
        super(title);
        this.jumpLimit = jumpLimit;
    }

    @Override
    public float provideAnObstacle() {
        return jumpLimit;
    }
}
