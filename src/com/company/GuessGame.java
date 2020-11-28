package com.company;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame () {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guesspl ;
        int guessp2 ;
        int guessp3 ;

        boolean plisRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");
        while (true) {
            System.out.println("Число, хоторое нужно угадать, — " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guesspl = p1.number;
            System.out.println("Первый игрок думает, что это " + guesspl);
            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guesspl == targetNumber) {
                plisRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (plisRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + plisRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println(" Конец игры. ");
                break; // Игра окончена так что прерываем цикл
            } else{
                // Мы должны продолжать так как никто не угадал!
                System.out.println("Игроки должны попробовать еще раз");
            }// конец if/else
        }//конец цикла
    }//конц метода
}//конец класса
