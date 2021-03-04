package utils;

import org.junit.jupiter.api.Test;
import racingcar.Car;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarManagerTest {
    CarManager cm = new CarManager();
    GameManager gm = new GameManager();

    @Test
    public void testRace(){
        Map<Car,Integer> map = new HashMap<>();
        map.put(new Car("carA"),0);
        map.put(new Car("carB"),0);
        map.put(new Car("carC"),0);

        gm.rData.setProgress(map);
        cm.race();
        Map<Car,Integer> result = gm.rData.getProgress();
        assertTrue(map.size()==3);

    }

}