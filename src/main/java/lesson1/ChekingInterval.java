package lesson1;

public class ChekingInterval {
  public static void main(String[] args) {

    System.out.println(checkInterval(5,15));
  }
  public static boolean checkInterval (int a, int b) {
    return ((a + b) >= 10) && ((a + b) <= 20);
  }

}