package lesson6;

public class MainApp {
    public static void main(String[] args) {
        createAnimals();
        totalCounter();
    }

    private static void totalCounter() {
        System.out.println();
        System.out.println("Собак: " + Dog.getCount());
        System.out.println("Котов: " + Cat.count); //попробовал без геттера сделать паблик счетчик

    }


    private static void createAnimals() {


        Dog dog1 = new Dog("Бобик");

        dog1.run(100);
        dog1.swim(59);
        System.out.println();

        Cat cat1 = new Cat("Барсик");
        cat1.run(30);
        System.out.println();

        Cat cat2 = new Cat();
        cat2.run(35);
        System.out.println();


        // попробовал что будет если создать объект без занесения его в массив и тут же применить метода его класса. все работает.
        new Dog("Кусака").swim(121);

        //еще одна собака
        new Dog("Тузик").run(11);
    }


}
