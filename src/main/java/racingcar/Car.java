package racingcar;

public class Car {

    private final String name;
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveOn() {
        position += 1;
    }
}
