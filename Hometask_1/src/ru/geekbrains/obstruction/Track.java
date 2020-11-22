package ru.geekbrains.obstruction;

public class Track extends SportObstruction{
    private int distanceLimit;

    public Track(String title, int distanceLimit) {
        super(title);
        this.distanceLimit = distanceLimit;
    }

    public void setDistanceLimit(int distanceLimit) {
        this.distanceLimit = distanceLimit;
    }

    @Override
    public float provideAnObstacle() {
        return distanceLimit;
    }
}
