package domen;

import java.util.Scanner;

public class Player {
    /**
     * Число игрока
     */
    private int numPlayer;

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
}
