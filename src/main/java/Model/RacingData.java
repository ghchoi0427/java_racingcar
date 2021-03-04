package Model;

import racingcar.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingData {
    int trial;
    int carCount;
    List<Car> cars = new ArrayList<>();
    Map<Car,Integer> progress = new HashMap<>();

    public Map<Car, Integer> getProgress() {
        return progress;
    }

    public void setProgress(Map<Car, Integer> progress) {
        this.progress = progress;
    }

    public int getTrial() {
        return trial;
    }

    public void setTrial(int trial) {
        this.trial = trial;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
