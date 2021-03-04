package Model;

import racingcar.Car;

import java.util.HashMap;
import java.util.Map;

public class RacingData {
    int trial;
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

}
