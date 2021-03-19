package utils;

import org.junit.jupiter.api.Test;
import racingcar.Car;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarManagerTest {
    //GameManager gm = new GameManager();


    @Test
    public void testRace(){
        LinkedHashMap<Car,Integer> map = new LinkedHashMap<>();
        map.put(new Car("carA"),0);
        map.put(new Car("carB"),0);
        map.put(new Car("carC"),0);


    }

}