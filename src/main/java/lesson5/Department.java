package lesson5;

public class Department {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        //persArray[0] = new Employee();
        persArray[0] = new Employee("Петренко Федор Петрович", "Специалист", "fdfgfdd@mrgrr.ru", "+79746756", 1233.23, 55);
        persArray[1] = new Employee("Иванов Сергей Иванович", "Страший специалист", "hjjd@mrtrygr.ru", "+790645145456", 123.23, 30);
        persArray[2] = new Employee("Карпенко Михаил Петрович", "Штатный дворник", "fiouioisd@mrgr.ru", "+456456", 1423.23, 35);
        persArray[3] = new Employee("Першин Федор Александрович", "Залсанный агент", "floi;sd@mtyrgr.ru", "+79546545456", 2323.23, 55);
        persArray[4] = new Employee("СИдоров Сигизмунд Петрович", "Специалист", "ffghd@mtryrgr.ru", "+7901445654656", 1423.23, 75);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
                //persArray[i].printInfo();
            }

        }
    }


}
