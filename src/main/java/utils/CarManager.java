package utils;

import racingcar.Car;

public class CarManager {

    public void createCars(String[] carNames){
        Car[] cars =  new Car[carNames.length];
        for(int i=0;i< carNames.length;i++){
            cars[i]=new Car(carNames[i]);
        }
    }
}
