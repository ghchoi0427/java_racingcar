package View;

public class OutputView {

    final String MSG_INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    final String MSG_INPUT_REPS = "시도할 회수는 몇회인가요?";

    public void MsgInputCars() {
        System.out.println(MSG_INPUT_CAR_NAMES);
    }

    public void MsgInputNums() {
        System.out.println(MSG_INPUT_REPS);
    }

    public void printRaceResult(){

    }
}
