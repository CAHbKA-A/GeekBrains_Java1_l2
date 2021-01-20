package lesson2;

/*
2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
public class FillArray {
    public static void main(String[] args) {

        int [] arrayFilling = new int[8];

        for (int i = 0; i < arrayFilling.length; i++) {
            arrayFilling[i] = i * 3;
            System.out.print( arrayFilling[i] + " ");
        }
    }

}
