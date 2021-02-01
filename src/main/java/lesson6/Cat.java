package lesson6;

public class Cat extends Animal {


    public static int count;

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    {
        ++this.count;
    }


    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот " + this.name + " пробежал " + distance + " м.");
        } else System.out.println("Кот " + this.name + " отказался бежать, оценив дистанцию");

    }

}
