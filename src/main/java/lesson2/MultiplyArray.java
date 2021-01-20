package lesson2;

/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
public class MultiplyArray {
    public static void main(String[] args) {

        int [] originalArr = {  1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for ( int i = 0; i < originalArr.length; i++)
        {
            if (originalArr[i] < 6)
            {
                originalArr[i] = originalArr[i] * 2;
            }
        }
        for ( int i = 0; i < originalArr.length; i++){
            System.out.print( originalArr[i] + " ");
        }
    }

}
