package lesson1;

public class PositivNum {

  public static void main(String[] args) {

    isPositiv(6);
  }
  public static void isPositiv (int a){
    if (a >= 0) {System.out.println("Число "+ a + " положительное");}
    else   {System.out.println("Число "+ a + " отрицательное");}
  }

}