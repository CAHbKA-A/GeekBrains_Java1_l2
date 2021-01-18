/*7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.*/

public class ShiftArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        int n = -14;

        // чтоб лишние круги не делать, если сдвиг больше длины массива
        n = n%array.length;

        if (n != 0) {
            array = shiftingArray(array, n);
        }
        // выввод на экран
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }


    }
    public static int [] shiftingArray (int [] arrayForShift, int n){

        int tempLast;
        int size = arrayForShift.length;
        int count = 0;
        if (n > 0) {
            while (count < n) {
                tempLast = arrayForShift[0];
                for (int i = 1; i < arrayForShift.length; i++) {
                    arrayForShift[i - 1] = arrayForShift[i];
                }
                arrayForShift[size - 1] = tempLast;
                count++;
            }
        }
       else {

            while (count > n) {
                tempLast = arrayForShift[size-1];
                for (int i = arrayForShift.length - 1; i > 0; i--) {
                    arrayForShift[i] = arrayForShift[i-1];
                }
                arrayForShift[0] = tempLast;
                count--;
            }
        }
        return arrayForShift;
    }

}
