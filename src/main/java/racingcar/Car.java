package racingcar;

import utils.RandomUtils;

import java.util.stream.DoubleStream;

public class Car {
    private static final int MINIMUM_MOVE_CONDITION = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void moveOn() {
        position += 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isOnPosition(int maxRecord) {
        return this.position == maxRecord;
    }

    public boolean isMovable() {
        return RandomUtils.nextInt(0, 9) >= MINIMUM_MOVE_CONDITION;
    }
}
