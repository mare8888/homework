package Domawka8;


class Bill {
  private int amount;

    public Bill(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void DepositService(Person john, int amount) {
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount + amount);
        System.out.println(john.getAccount().getAmount());
    }

    public static void TransfertPayment(Person bob, int amount) {
        int currentBobAmount = bob.getAccount().getAmount();
        bob.getAccount().setAmount(currentBobAmount - amount);
        System.out.println(bob.getAccount().getAmount());
    }

    public static void PaymentService(Person bob, int amount) {
        int currentBobAmount = bob.getAccount().getAmount();
        bob.getAccount().setAmount(amount - currentBobAmount);
        System.out.println(bob.getAccount().getAmount());
    }
}

class Person{
    private String name;
    private String sename;
    private String telephone;
    private Bill account;

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Person(String name, Bill account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bill getAccount() {
        return account;
    }

    public void setAccount(Bill account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}

