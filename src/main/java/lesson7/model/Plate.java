package lesson7.model;

import java.util.Random;

public class Plate {


    private int filling;
    private int volume;
    private boolean isFull;


    public Plate() {
        this.filling = 0;
        this.volume = 70;
        this.isFull = false;
    }

    public Plate(int filling, int volume) {
        this.filling = filling;
        this.volume = volume;
        this.isFull = filling >= volume;

    }

    public boolean isFull() {
        return isFull;
    }

    public int getFilling() {
        return filling;
    }

    public void setFilling(int filling) {

        this.filling = filling;
        if (filling == 0) this.isFull = false;
        if (filling > this.volume) this.isFull = true;

    }

    public void fillingPlate() {
        Random random = new Random();
        this.filling = this.filling + random.nextInt(40);
        if (filling < volume) {
            System.out.println("Чашка не полная, сыпани еще! " + filling + " из " + volume);
            //isEmpty = false;
            isFull = false;
        }
        if (filling == volume) {
            System.out.println("Тарелка полная");
            isFull = true;
        }
        if (filling > volume) {
            System.out.println("Корм посыпался через край! " + volume + " в миске. Еще " + (filling - volume) + " на полу (коты с пола не едят. Выкидываем)");
            filling = volume;
            isFull = true;
        }

        System.out.println();


    }
}
