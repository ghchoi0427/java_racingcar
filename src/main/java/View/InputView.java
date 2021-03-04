package View;

import utils.CarManager;
import utils.GameManager;
import utils.InputValidator;

public class InputView {
    CarManager carManager = new CarManager();
    InputValidator inputValidator = new InputValidator();
    GameManager gm = new GameManager();

    public void inputCars(String cars){
        inputValidator.carNameInputVal(cars);
        String[] carNames = cars.split(",");
        carManager.createCars(carNames);
    }

    public void inputReps(int reps){
        gm.rData.setTrial(reps);
    }
}
