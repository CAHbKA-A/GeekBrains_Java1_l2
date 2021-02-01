package lesson6;

public abstract class Animal {


    protected String name;
    public static int count;


    public Animal() {
        this.name = "без имени";
    }


    public Animal(String name) {
        this.name = name;

    }



    public void run(int distance) {
        System.out.println("Животное " + name + " пробежало " + distance + " км.");

    }


    public void swim  (int distance){}

}


