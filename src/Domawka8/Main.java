package Domawka8;

import static Domawka8.Bill.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        First.A.B moe = new First.A.B();
        System.out.println(moe);

        // Задание 2
        Moj m1 = new Moj("Restourant", Type.BREAKFAST, 18);

        if (m1.TimeToBreakfast == Type.BREAKFAST) {
            System.out.println("Type Breakfast");
        } else if (m1.TimeToBreakfast == Type.DINNER) {
            System.out.println("Type Dinner");
        } else if (m1.TimeToBreakfast == Type.LANCH) {
            System.out.println("Type Lanch");
        }

        // Задание 3
        System.out.println(Third.Operations.SUM.action(10, 5));
        System.out.println(Third.Operations.MINUS.action(10, 5));
        System.out.println(Third.Operations.UMNOJIT.action(10, 5));
        System.out.println(Third.Operations.STEPEN.action(10, 5));

        //Задание 4
        Bill johnAccount = new Bill(10000);
        Person john = new Person("John", johnAccount);
        Bill bobAccount = new Bill(15000);
        Person bob = new Person("Bob", bobAccount);
        Bill paymentAccount = new Bill(20);
        Person payment = new Person("Payment", paymentAccount);


        DepositService(john, 2000);
        TransfertPayment(bob, johnAccount.getAmount());
        PaymentService (payment, bobAccount.getAmount());

    }

}