package utils;

import racingcar.Car;
import view.InputView;
import view.OutputView;

import java.util.*;
import java.util.stream.Collectors;

//controller -> domain을 조합해서 사용하는 거야
// domain이 car 하나잖아 (객체들을 조합하는 역할)

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    public GameManager() {
    }

    public void startGame() {
        final CarManager carManager = new CarManager(inputCars(), inputRepetition());

        while(!carManager.isRaceOver()){
            carManager.race();
            OutputView.printRaceResult(carManager.getCars());
        }

        OutputView.printFinalResult(carManager.getWinner());
    }

    private String[] inputCars(){
        OutputView.msgInputCars();
        return InputView.inputCars(scanner.next());
    }

    private int inputRepetition(){
        OutputView.msgInputNums();
        return InputView.inputRepetition();
    }
}
