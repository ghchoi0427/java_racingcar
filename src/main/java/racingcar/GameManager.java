package racingcar;

import view.InputView;
import view.OutputView;

import java.util.*;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    public GameManager() {
    }

    public void startGame() {
        final CarManager carManager = new CarManager(inputCars(), inputRepetition());

        while (!carManager.isRaceOver()) {
            carManager.race();
            OutputView.printRaceResult(carManager.getCars());
        }

        OutputView.printFinalResult(carManager.getWinner());
    }

    private String[] inputCars() {
        OutputView.msgInputCars();
        return InputView.inputCars(scanner.next());
    }

    private int inputRepetition() {
        OutputView.msgInputNums();
        return InputView.inputRepetition();
    }
}
