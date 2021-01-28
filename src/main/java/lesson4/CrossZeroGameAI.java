package lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossZeroGameAI {
    private static char[][] fieldMap;
    private static int[] arrayForAI;
    private static final int FIELD_SIZE = 4;
    private static final int SCORE_TO_WIM = 4;
    private static final char EMPTY_CHAR = '*';
    private static final char X_CHAR = 'X';
    private static final char O_CHAR = '0';
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;


    public static void main(String[] args) {

        newFieldMap();
        printFieldMap();
        play();

    }

    private static void play() {
        do {
            humanImput();
            printFieldMap();
            //   if (count > 4) {
            if (checkWin(X_CHAR)) {
                System.out.println("Вы выиграли");
                break;
            }
            //   }
            if (count >= FIELD_SIZE * FIELD_SIZE) {
                System.out.println("Ничья!");
                break;
            }
            //  computerInput();
            computerInputAI(arrayForAI);
            printFieldMap();
            if (count > 4) {
                if (checkWin(O_CHAR)) {
                    System.out.println("Вы проиграли!");
                    break;
                }
            }
            if (count >= FIELD_SIZE * FIELD_SIZE) {
                System.out.println("Ничья!");
                break;
            }
            //  System.out.println("зацикливание 2");
        }
        while (count < FIELD_SIZE * FIELD_SIZE);
    }


    private static boolean checkWin(char symbol) {
        int countInLine = 1;
        int countInRow = 1;


// проверяем строки и столбцы
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                //проверяем строки
                if (fieldMap[i][j] == symbol) {
                    countInLine++;

                    //для ИИ
                    if (fieldMap[i][j] == X_CHAR) {
                        fillArrForAI(i, j, 1, countInLine);
                    }

                    if (countInLine >= SCORE_TO_WIM) {
                        // System.out.println("строка" + i + " " + j);
                        return true;
                    }
                } else {
                    countInLine = 0;
                }
                //проверяем Столбцы
                if (fieldMap[j][i] == symbol) {
                    countInRow++;
                    //для ИИ
                    if (fieldMap[i][j] == X_CHAR) {
                        fillArrForAI(i, j, 2, countInRow);
                    }
                    if (countInRow >= SCORE_TO_WIM) {
                        // System.out.println("столбец" + i + " " + j);
                        return true;
                    }
                } else {
                    countInRow = 0;
                }
            }
            countInRow = 0;
            countInLine = 0;
        }

// проверяем gj диаганалям

        //диаганаль \
        int diaganal1 = 0;
        //диаганаль /
        int diaganal2 = 0;

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                int k = 1;

                if (fieldMap[i][j] == symbol) {
                    diaganal1 = 1;

                    //пошли по диаганали \
                    while (((i + k) < FIELD_SIZE) && ((j + k) < FIELD_SIZE)) {

                        if (fieldMap[i + k][j + k] == symbol) {
                            diaganal1++;
                            k++;

                            //для ИИ
                            if (fieldMap[i][j] == X_CHAR) {
                                fillArrForAI(i, j, 3, diaganal1);
                            }


                            if (diaganal1 >= SCORE_TO_WIM) {

                                return true;
                            }
                        } else {
                            diaganal1 = 0;
                            break;
                        }

                    }

                    k = 1;

                    //пошли по диаганали /
                    diaganal2 = 1;
                    while (((i + k) < FIELD_SIZE) && ((j - k) >= 0)) {
                        //  if (diaganal2 ==2);
                           System.out.println("проверим диаганаль 2"+ i+" " +j+"  "+ k);
                        if (fieldMap[i + k][j - k] == symbol) {
                            System.out.println(symbol);
                            diaganal2++;
                            k++;

                            //для ИИ
                            if (fieldMap[i][j] == X_CHAR) {
                                fillArrForAI(i, j, 4, diaganal2);
                            }
                            if (diaganal2 >= SCORE_TO_WIM) {
                                     System.out.println("диаганаль 2 "+ i+" " +j+"  "+ k +" "+ diaganal2);
                                return true;
                            }
                        } else {
                            diaganal2 = 0;
                            break;
                        }

                    }

                } else {
                    diaganal1 = 0;
                    diaganal2 = 0;
                }
            }
            diaganal1 = 0;
            diaganal2 = 0;
        }
        return false;
    }

    private static void computerInput() {
        Random random = new Random();

        boolean legalInput;
        count++;
        do {
            int x = random.nextInt(FIELD_SIZE);
            int y = random.nextInt(FIELD_SIZE);
            legalInput = checkValidInput(x, y);
            if (legalInput) fieldMap[x][y] = O_CHAR;

        } while (!legalInput);


    }

    private static void computerInputAI(int[] arrayForAI) {
        Random random3 = new Random();
        int x = 1;
        int y = 1;
        int retry = 0;
        boolean legalInput = false;
// определяем куда лепить 0.   1- в строку 2- в столбец. 3 -по диаганали \ 4- по диаганали\  -либо рандом
        switch (arrayForAI[2]){

            case 1:{
                x = arrayForAI[0] ;
                for (y = 0; y < FIELD_SIZE; y++) {
                    legalInput = checkValidInput(x, y);
                    if (legalInput) {
                        fieldMap[x][y] = O_CHAR;
                        break;
                    }

                }
                if (!legalInput) {
                    computerInput();
                }
                break;

            }
            case 2:{
                y = arrayForAI[1];
                for (x = 0; x < FIELD_SIZE; x++) {
                    legalInput = checkValidInput(x, y);
                    if (legalInput) {
                        fieldMap[x][y] = O_CHAR;
                        break;
                    }

                }
                if (!legalInput) {
                    computerInput();

                }
                break;
            }

            case 3:{


                for (x = 0; x < FIELD_SIZE; x++) {
                    legalInput = checkValidInput(x, x);
                    if (legalInput) {
                        fieldMap[x][x] = O_CHAR;
                        break;
                    }

                }
                if (!legalInput) {
                    computerInput();
                }
                break;
            }
            case 4:{

                for (x = 0; x < FIELD_SIZE; x++) {
                    legalInput = checkValidInput(x, x);
                    if (legalInput) {
                        fieldMap[x][FIELD_SIZE-x] = O_CHAR;
                        break;
                    }

                }
                if (!legalInput) {
                    computerInput();
                }
                break;
            }




            default: { computerInput();}


        }






    }

    private static void humanImput() {
        int x = 0;
        int y = 0;
        count++;
        boolean legalInput;
        do {

            System.out.println("Ваш ход в формате X Y");
            if (sc.hasNextInt()) {
                x = sc.nextInt() - 1;
            }
            if (sc.hasNextInt()) {
                y = sc.nextInt() - 1;
            }
            sc.nextLine();
            legalInput = checkValidInput(x, y);
            if (legalInput) fieldMap[x][y] = X_CHAR;

        } while (!legalInput);
    }

    private static boolean checkValidInput(int x, int y) {
        if ((x < 0) || (y < 0) || (x > FIELD_SIZE - 1) || (y > FIELD_SIZE - 1)) return false;
        if (fieldMap[x][y] != EMPTY_CHAR) return false;


        return true;
    }

    private static void printFieldMap() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(fieldMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void newFieldMap() {
        fieldMap = new char[FIELD_SIZE][FIELD_SIZE];

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                fieldMap[i][j] = EMPTY_CHAR;
            }
        }
        arrayForAI = new int[4];

     /*   fieldMap[1-1][2-1] ='X';
        fieldMap[2-1][2-1] ='X';
        fieldMap[2-1][3-1] ='X';
        fieldMap[2-1][1-1] ='X';
        count = 5;

      */
    }

    private static void fillArrForAI(int i, int j, int direction, int count) {
        if (count >= arrayForAI[3]) {
            arrayForAI[0] = i;
            arrayForAI[1] = j;
            arrayForAI[2] = direction;
            arrayForAI[3] = count;
        }

    }
}
