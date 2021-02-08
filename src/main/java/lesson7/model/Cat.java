package lesson7.model;

public class Cat {
    public static void main(String[] args) {

    }
    Plate plate;
    private boolean isSatiety; // сытость
    private int stomachSize; // размер желудка

    public Cat() {// дефолтный кот
        this.isSatiety = false;
        this.stomachSize = 10;
    }

    public Cat(int stomachSize) {
        this.isSatiety = false;
        this.stomachSize = stomachSize;
    }

    public boolean isSatiety() {
        return isSatiety;
    }

    public int getStomachSize() {
        return stomachSize;
    }

    public static void eat(Plate plate, Cat cat) {

        if (cat.isSatiety()) {
            System.out.println("Кот уже сытый по горло. Пошел мимо миски");
        } else
            // хватит ли еды коту
            if (plate.getFilling() >= cat.getStomachSize()) {
                plate.setFilling(plate.getFilling() - cat.getStomachSize());
                System.out.println("поел. В миске осталось " + plate.getFilling() + " корма");
                cat.isSatiety = true;
            } else System.out.println("Еды мало. Сыпани еще.");

        System.out.println();

    }
}
