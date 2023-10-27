// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задание 3
        Car2 car2 = new Car2();
        car2.setEngine("v12");
        car2.setColor("black");
        car2.setWheel(14);
        System.out.println(car2);
        //Задание 2
        Sobaka sobaka = new Sobaka();
        sobaka.ediat();
        Koti koti = new Koti();
        koti.perdiat();
        Miwi miwi = new Miwi();
        miwi.pischat();
        //Задание 1
        Cab cab = new Cab();
        cab.kurit();
        cab.poet();

        //Дополнительно
        Bill johnAccount = new Bill(10000);
        Person john = new Person("John", johnAccount);
        payment(john, 2000);
        popolnenie(john, 3000);
        multiplication(john, 3);


    }
    public static void payment(Person john, int amount){
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount - amount);
        System.out.println(john.getAccount().getAmount());
    }
    public static void popolnenie(Person john, int amount){
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount + amount);
        System.out.println(john.getAccount().getAmount());
    }
    public static void multiplication(Person john, int amount){
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount * amount);
        System.out.println(john.getAccount().getAmount());
    }
}