package lesson2;

/*Задать одномерный массив и найти в нем минимальный
и максимальный элементы (без помощи интернета);*/
public class MinMaxInArray {
     public static void main(String[] args) {

         int [] originalArr = {  567, 5, 53, -278, 11, 4, 8905, 2, -4, 8, 9, 1 };
         int min = originalArr [0];
         int max = originalArr [0];

         for (int i=1; i<originalArr.length; i++)
             {
                 if (originalArr[i] < min) {
                     min = originalArr[i];
                 }
                 if (originalArr[i] > max) {
                     max = originalArr[i];
                 }
            }
         System.out.println("Min = " + min + ", Max = " + max);
     }

}
