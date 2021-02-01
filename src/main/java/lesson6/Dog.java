package lesson6;

public class Dog extends Animal {


    private static int count;



    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    {
        ++this.count;

    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака " + this.name + " пробежала " + distance + " м.");
        } else System.out.println("Собака" + this.name + " отказался бежать");

    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака " + this.name + " проплыла " + distance + " м.");
        } else System.out.println("Собака " + this.name + " столько не плавает");
    }


}
