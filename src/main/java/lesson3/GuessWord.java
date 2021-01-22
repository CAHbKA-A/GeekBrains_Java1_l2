package lesson3;

import java.util.Random;
import java.util.Scanner;

/*Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple";
        char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово.
        Используем только маленькие буквы*/
public class GuessWord {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        boolean geesFlag = false;
        String usersWord;
        String randomWord = words[random.nextInt(words.length)];
        //System.out.println(randomWord);
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадай слово");

        do {
            usersWord = sc.nextLine().toLowerCase();
            int sizeRandomWord = randomWord.length();
            int sizeUserWord = usersWord.length();
            int minLenght = sizeRandomWord;
            if (minLenght > sizeUserWord) {
                minLenght = sizeUserWord;
            }

            if (!usersWord.equals(randomWord)) {
                System.out.println("Не угадал. Давай еще раз:");
                for (int i = 0; i < minLenght; i++) {
                    char a = usersWord.charAt(i);
                    char b = randomWord.charAt(i);
                    if (a == b) {
                        System.out.print(a);
                    } else System.out.print("#");
                }
                for (int i = 0; i < random.nextInt(20) + 2; i++) {
                    System.out.print("#");
                }

            } else {
                System.out.println("Угадал");
                geesFlag = true;
            }
            System.out.println();

        } while (!geesFlag);
    }
}
