package lesson5;

public class Employee {

    private String nameFio;
    private String position;
    private String eMail;
    private String phoneNumber;
    private double payment;
    private int age;

    public int getAge() {

        return age;
    }

    protected Employee(){
        this.nameFio = "Не здали";
        this.position = "Соискатель";
        this.eMail = "нет";
        this.phoneNumber = "00";
        this.payment = 0;
        this.age = 0;

    }


    protected Employee(String nameFio, String position, String eMail, String phoneNumber, double payment, int age) {
        this.nameFio = nameFio;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        if (age > 0) {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameFio='" + nameFio + '\'' +
                ", position='" + position + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", payment=" + payment +
                ", age=" + age +
                '}';
    }

/*    public void printInfo() {

        System.out.println("ФИО: " + this.nameFio);
        System.out.println("Должность: " + this.position);
        System.out.println("E-Mail: " + this.eMail);
        System.out.println("Телефон: " + this.phoneNumber);
        System.out.println("Заработная плата: " + this.payment);
        System.out.println("Возраст: " + this.age);
        System.out.println();

    }

 */

}

