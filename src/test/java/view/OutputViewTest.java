package view;

import org.junit.jupiter.api.Test;
import racingcar.Car;
import utils.GameManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class OutputViewTest {
    GameManager gmTest = new GameManager();
    //OutputView outputView = new OutputView(gmTest);

    @Test
    public void printRaceResultTest(){
        Map<Car,Integer> map = new HashMap<>();
        map.put(new Car("pobi"),3);
        map.put(new Car("woni"),4);
        map.put(new Car("jun"),5);
        Set<Car> set = map.keySet();

        for(Car c : set){
            System.out.println(c);
        }

    }

}