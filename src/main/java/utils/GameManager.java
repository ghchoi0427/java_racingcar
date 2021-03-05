package utils;

import Model.RacingData;
import racingcar.Car;

import java.util.*;

public class GameManager {
    public RacingData rData = new RacingData();

    public List<Car> getWinner() {
        Map<Car, Integer> map = rData.getProgress();
        List<Car> winners = new ArrayList<>();
        int maxRecord = getMaxRecord(map);

        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (maxRecord == entry.getValue()) {
                winners.add((Car) entry);
            }
        }
        return winners;
    }

    public int getMaxRecord(Map<Car, Integer> map) {
        int max = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        return max;
    }
}
