package view;

import domen.Num;
import domen.Player;
import domen.PrintText;

public class ViewGame {
    /**
     * Экземпляр класса в котором хранится загаданное число
     */
    private final Num num = new Num();
    /**
     * Экземпляр класса, отвечающего за ввод числа в консоль
     */
    private final Player player = new Player();
    /**
     * Экземпляр класса, отвечающего за вывод сообщений в консоль (общение с игроком)
     */
    private final PrintText printText = new PrintText();

    /**
     * Реализация игры
     */
    public void startGame(){
        System.out.println("Подсказочка :) " + num.getTheHiddenNumber());
        int flag = 2;
        int numberOfBets = 0;
        while (flag != 0) {
            printText.helloBet();
            flag = Integer.compare(num.getTheHiddenNumber(), player.enteringANumber());
            numberOfBets++;
            if (flag == -1){
                printText.theNumberIsLess();
            } else if (flag == 1) {
                printText.theNumberIsGreater();
            }
        }
        if ( numberOfBets != 1)printText.numberOfBets(numberOfBets);
        else printText.coolVictory();
        printText.numVictory(num.getTheHiddenNumber());
    }
}
