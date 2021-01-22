package lesson1;

public class HighYear {
  public static void main(String[] args) {
    for (int i = 1760; i <2200 ; i++) {
      checkHighYear(i);
    }
    checkHighYear(2000);
  }
  public static void checkHighYear(int year) {
    if (year % 4 == 0) {
      if (year % 100 != 0) {System.out.println(year + " Високосный");}
      else {
        if (year % 400 == 0) {
          System.out.println(year + " Високосный");
        } else {
          System.out.println(year + " не високосный");
        }
      }
    }
    else {System.out.println(year +" не високосный");}

  }

}