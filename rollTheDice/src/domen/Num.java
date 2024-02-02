package domen;

import java.util.Random;

public class Num {
    /**
     * Число, которое нужно будет угадать
     */
    private final int theHiddenNumber = new Random().nextInt(1,101);
    /**
     * Геттер угадываемого числа
     * @return число
     */
    public int getTheHiddenNumber() {
        return theHiddenNumber;
    }
}
