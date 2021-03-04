package View;

import racingcar.Car;
import utils.GameManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OutputView {

    final String MSG_INPUT_CAR_NAMES = "Please input names of cars.(names are distinguished by comma(,))";
    final String MSG_INPUT_REPS = "how many repetitions?";

    GameManager gm;

    public OutputView(GameManager gm) {
        this.gm = gm;
    }

    public void MsgInputCars() {
        System.out.println(MSG_INPUT_CAR_NAMES);
    }

    public void MsgInputNums() {
        System.out.println(MSG_INPUT_REPS);
    }

    public void printRaceResult(){
        Map<Car,Integer> progress = gm.rData.getProgress();
        Set<Car> keys = progress.keySet();

    }

    public String drawProgressBar(int distance){
        String bar = "";
        for (int i = 0; i < distance; i++) {
            bar+="-";
        }
        return bar;
    }
}
