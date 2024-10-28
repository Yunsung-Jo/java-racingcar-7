package racingcar.model;

import java.util.Objects;

public class Car {
    private final CarName name;
    private final int speed;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.speed = 1;
        this.position = 0;
    }

    public void move() {
        this.position += speed;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Car car) {
            return name.equals(car.name) && position == car.position;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
