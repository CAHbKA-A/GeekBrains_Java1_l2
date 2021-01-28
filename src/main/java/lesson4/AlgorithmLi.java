package lesson4;

import java.util.Random;

public class AlgorithmLi {
    private static int [][] fieldMap;
    private static final int SIZE_OF_FIELD = 7;
    private static int startI;
    private static int startJ;



    public static void main(String[] args) {


        fillField();
        Random random = new Random();
        startI = random.nextInt(SIZE_OF_FIELD);
        startJ = random.nextInt(SIZE_OF_FIELD);
        fieldMap [startI][startJ] = 0;
        printField();

        for (int i = 0; i < SIZE_OF_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_FIELD; j++) {
                fieldMap [i][j] = SIZE_OF_FIELD ;
            }
        }




    }

    private static void printField() {
        for (int i = 0; i < SIZE_OF_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_FIELD; j++) {
                System.out.print(fieldMap [i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void fillField() {
        fieldMap =  new int [SIZE_OF_FIELD][SIZE_OF_FIELD];
        for (int i = 0; i < SIZE_OF_FIELD; i++) {
            for (int j = 0; j < SIZE_OF_FIELD; j++) {
                fieldMap [i][j] = 1;
            }
        }
    }
}
