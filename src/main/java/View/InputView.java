package View;

import utils.CarManager;
import utils.GameManager;
import utils.InputValidator;

public class InputView {
    CarManager cm;
    InputValidator inputValidator = new InputValidator();
    GameManager gm;

    public InputView(CarManager cm, GameManager gm) {
        this.cm = cm;
        this.gm = gm;
    }

    public void inputCars(String cars){
        inputValidator.carNameInputVal(cars);
        String[] carNames = cars.split(",");
        cm.createCars(carNames);
    }

    public void inputReps(int reps){
        gm.rData.setTrial(reps);
    }
}
