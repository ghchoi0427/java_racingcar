package Model;

import racingcar.Car;

import java.util.LinkedHashMap;
import java.util.Map;

public class RacingData {
    int trial;
    LinkedHashMap<Car,Integer> progress = new LinkedHashMap<>();

    public LinkedHashMap<Car, Integer> getProgress() {
        return progress;
    }

    public void setProgress(LinkedHashMap<Car, Integer> progress) {
        this.progress = progress;
    }

    public int getTrial() {
        return trial;
    }

    public void setTrial(int trial) {
        this.trial = trial;
    }

}
