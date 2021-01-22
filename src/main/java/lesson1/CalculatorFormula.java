package lesson1;

public class CalculatorFormula {
  public static void main(String[] args) {

    System.out.println(calculateFormula(1,4,6,7));
  }
  public static float calculateFormula (float a, float b, float c, float d) {
    return (a * (b + (c / d)));
  }

}