package View;

import utils.CarManager;
import utils.GameManager;
import utils.InputValidator;

public class InputView {
    private CarManager cm;
    private InputValidator inputValidator = new InputValidator();
    private GameManager gm;

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
