package domen;

public class Counter {
    /**
     * Количество попыток угадать число
     */
    private int numberOfBets = 0;
    /**
     * Счетчик количества попыток
     */
    public void numberOfBets(){
        numberOfBets++;
    }
    /**
     * Геттер количества попыток
     * @return количество попыток угадать число
     */
    public int getNumberOfBets() {
        return numberOfBets;
    }
}
