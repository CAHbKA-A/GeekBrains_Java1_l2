package lesson2;/*Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

public class ReplaceInArray {
    public static void main(String[] args) {
        byte [] originalArr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for ( int i = 0; i < originalArr.length; i++)
            {
             if (originalArr[i] == 0)
                {
                 originalArr[i] = 1;
                }
                else {
                originalArr[i] = 0;
                }
            }

        for (byte a:originalArr)
              {
               System.out.print(a + " ");
              }
    }

}
