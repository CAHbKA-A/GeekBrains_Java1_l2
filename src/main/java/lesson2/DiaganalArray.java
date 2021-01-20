package lesson2;/*4. Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое)
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

public class DiaganalArray {
    public static void main(String[] args) {
        int size = 5;
        int [][] array = new int[size][size];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++){
                if ((i == j) || (i == array.length - j - 1))
                    {
                     array [i][j] = 1;
                    }

            }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
