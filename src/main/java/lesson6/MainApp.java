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

        Dog[] dogsArr = new Dog[2];
        Cat[] catsArr = new Cat[3];

        System.out.println();


        dogsArr[0] = new Dog("Бобик");
        doing(dogsArr[0], 100, 2);
        System.out.println();

        catsArr[0] = new Cat("Барсик");
        doing(catsArr[0], 5,22);
        System.out.println();

        catsArr[1] = new Cat();
        doing(catsArr[1], 1,11);
        System.out.println();



        // попробовал что будет если применить метод на только что созданный объект без занесения его в массив.  Посчитался, но в  дельнейшем его использовать нельзя будет
        doing(new Dog("Гуляка"), 11,12);
        System.out.println();

        // попробовал что будет если создать объект без занесения его в массив и тут же применить метода его класса. все работает.
        new Dog("Кусака").swim(121);

        // пришел к выводу, что для этого  домашнего задания можно было массивы и не создавать"!!!!


    }

    //в метод можем закинуть и собаку и кота .
    //Это и есть полиморфизм?
    public static void doing(Animal a, int runDist, int swimDist) {
        a.run(runDist);
        a.swim(swimDist);

    }

}
