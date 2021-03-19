package utils;

import java.util.Arrays;

public class InputValidator {

    private static final String ERROR_ZERO_INPUT = "input number cannot be zero";
    private static final String ERROR_SHORT_CAR = "car must be 2 at least";
    private static final String ERROR_BLANK_INPUT = "car must be 2 at least";
    private static final String ERROR_OVERLAPPED_CAR = "cars should be distinguishable";

    private InputValidator() {
    }

    public static void carNameInputValidator(String names) throws IllegalArgumentException {
        if (names.split(",").length == 0) {
            throw new IllegalArgumentException(ERROR_SHORT_CAR);
        }

        if (names.isEmpty()) {
            throw new IllegalArgumentException(ERROR_BLANK_INPUT);
        }

        if (Arrays.stream(names.split(",")).distinct().count() != Arrays.stream(names.split(",")).count()) {
            throw new IllegalArgumentException(ERROR_OVERLAPPED_CAR);
        }
    }

    public static void repetitionInputValidator(int repetition) throws IllegalArgumentException {
        if (repetition <= 0) {
            throw new IllegalArgumentException(ERROR_ZERO_INPUT);
        }
    }
}
