package Lesson7;

import Lesson7.model.Cat;
import Lesson7.model.Plate;

import java.util.Random;

public class MainApp {
    private static final int totalCats = 7;
    private static Cat[] cats = new Cat[totalCats];
    private static Plate plate1 = new Plate(0, 40);
    private static int minStomachSize;


    public static void main(String[] args) {


        createCats();
        //printCat();
        //заполняем тарелку кормом
        fillingPlate(plate1);
        //кормим котов
        FeedinCats();
        printCat();

    }

    private static void FeedinCats() {
        for (int i = 0; i < totalCats; i++) {
            System.out.println("Кот " + i + " подошел к миске. Размер желудка " + cats[i].getStomachSize());
            Cat.eat(plate1, cats[i]);
            /*

            if (plate1.getFilling() == 0) {
                break; // если миска пустая
            }
            if (plate1.getFilling() < minStomachSize) {//если корма меньше самого маленького желудка
                break;
            }*/

        }
    }

    private static void printCat() {
        String hungry ;

        for (int i = 0; i < totalCats; i++) {
            hungry = (cats[i].isSatiety() ? " сытый." : " голодный.");
            System.out.println("Кот " + i + hungry);
        }
    }

    private static void fillingPlate(Plate plate) {
        do {
            System.out.println("насыпаем немного корма");
            plate.fillingPlate();
        }
        while (!plate.isFull());
    }

    private static void createCats() {
        Random random = new Random();
        cats[0] = new Cat(50); //один Жирный кот
        minStomachSize = cats[0].getStomachSize();
        for (int i = 1; i < totalCats; i++) {
            if (i < 3) cats[i] = new Cat(); // созадаем 2 стандарныйх кота
            if (i >= 3) cats[i] = new Cat(random.nextInt(20)); // созадаем случайных котов
            if (minStomachSize > cats[i].getStomachSize())
                minStomachSize = cats[i].getStomachSize();  // если  в миске останется меньше корма чем самый маленький желудок, то остальных кормить не надо.

        }
    }
}
