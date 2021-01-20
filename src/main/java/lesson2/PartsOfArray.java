package lesson2;/*Написать метод, в который передается не пустой одномерный целочисленный массив,
 метод должен вернуть true, если в массиве есть место, 
 в котором сумма левой и правой части массива равны. 
 Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, 
граница показана символами ||, эти символы в массив не входят.*/



public class PartsOfArray {
    public static void main(String[] args) {

      int [] originalArr = {  2, 2, 2, 1, 2, 2,  10, 1 };
     // int [] originalArr = {  1, 1, 1, 2, 1 };
      //int [] originalArr = {  1, 3, 8,  2, 100 };
        System.out.println(checkBalance (originalArr));


    }


    public static boolean checkBalance (int [] originalArr){
        int sumOfLeft = 0;
        int sumOfRight = 0;
        int indexBalance;

        for (int i = 0; i < originalArr.length; i++) {
            for (int j = 0; j < i; j++) {
                sumOfLeft = sumOfLeft + originalArr[j];
            }
            for (int j = i; j < originalArr.length; j++) {
                sumOfRight = sumOfRight + originalArr[j];
            }

            if ((sumOfLeft == sumOfRight ) && (sumOfLeft+sumOfRight>0)) {
                indexBalance = i;
                printArr(originalArr, indexBalance);
                return true;
                //break;
            }
            sumOfLeft = 0;
            sumOfRight = 0;
        }

        return false;
    }

    public static void printArr (int [] arr, int indexBalnce){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if (i==indexBalnce-1) {
                System.out.print("|| ");
            }
        }
    }

}
