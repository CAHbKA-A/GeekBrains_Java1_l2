package lesson3;

import java.util.Random;
import java.util.Scanner;

/*Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 После победы или проигрыша выводится запрос –
 «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
public class GuessNumber {
    public static void main(String[] args) {
        int oneMore;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int count = 3;

        do {
            int number = random.nextInt(10);
            System.out.println("Угадай число");

            while (count >0) {
                int tryNumber = sc.nextInt();
                if (tryNumber > number) {
                    System.out.println("Число больше загаданного");
                } else {
                    if (tryNumber < number) {
                        System.out.println("Число меньше загаданного");
                    } else break;
                }
                count --;
                if (count == 0) {
                    System.out.println("Не угадал");
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
            System.out.println(count);
            oneMore = sc.nextInt();
            if ((oneMore != 0) && (oneMore != 1)) {
                System.out.println("Иди, учи цифры!");
            }
        }
        while (oneMore == 1);
    }
}
