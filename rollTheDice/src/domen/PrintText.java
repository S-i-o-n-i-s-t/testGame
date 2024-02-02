package domen;

public class PrintText {
    //region Тексты вывода в консоль
    public void helloBet(){
        System.out.print("Введите вашу ставку: ");
    }
    public void theNumberIsGreater(){
        System.out.println("Я сам в шоке, но, загаданное число больше, брат");
    }
    public void theNumberIsLess(){
        System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
    }
    public void exepchonScanner(){
        System.out.println("Выввели не корректные данные, попробуйте еще раз");
    }
    public void numVictory(int num){
        System.out.println("да, это было число " + num);
    }
    public void coolVictory(){
        System.out.println("Ах ты читер!!! Ты угадал с первого раза...");
    }
    public void numberOfBets(int numberBets){
        System.out.println("Победа!!! Ты не здавался " + numberBets + " раз!!!");
    }
    //endregion
}
