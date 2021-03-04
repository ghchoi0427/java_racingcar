package View;

import utils.CarManager;
import utils.InputValidator;

public class InputView {
    CarManager carManager = new CarManager();
    InputValidator inputValidator = new InputValidator();

    public void inputCars(String cars){
        inputValidator.carNameInputVal(cars);
        String[] carNames = cars.split(",");
        carManager.createCars(carNames);
    }
}
