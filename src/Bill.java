class Bill {

    public int getAmount() {
        return amount;
    }

    public Bill(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;

}


class Person{
    private String name;
    private Bill account;

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

