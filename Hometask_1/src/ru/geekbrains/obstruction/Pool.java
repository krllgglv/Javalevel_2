package ru.geekbrains.obstruction;

public class Pool extends SportObstruction {
    private int swimDistance;

    public Pool(String title, int swimDistance) {
        super(title);
        this.swimDistance = swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    @Override
    public float provideAnObstacle() {
        return swimDistance;
    }

}
