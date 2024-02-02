package domen;

import java.util.Scanner;

public class Player {
    /**
     * Число игрока
     */
    private int numPlayer;
    /**
     * Количество попыток угадать число
     */
    private int numberOfBets = 0;
    /**
     * Метод ввода в консоль числа игроком
     * @return Число которое ввел игрок
     */
    public int enteringANumber(){
        PrintText printText = new PrintText();
        try {
            setNumPlayer(new Scanner(System.in).nextInt());
        }catch (Exception e){
            printText.exepchonScanner();
            enteringANumber();
        }
        return numPlayer;
    }
    /**
     * Сеттер числа игрока
     * @param numPlayer число игрока
     */
    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }
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
