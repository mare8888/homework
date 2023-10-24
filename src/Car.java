public class Car {
    private String fari;
    private String stekla;

    public Car(String fari, String stekla) {
        this.fari = fari;
        this.stekla = stekla;
    }

    public String getFari() {
        return fari;
    }

    public void setFari(String fari) {
        this.fari = fari;
    }

    public String getStekla() {
        return stekla;
    }

    public void setStekla(String stekla) {
        this.stekla = stekla;
    }

//    public boolean equals(Object cars) {
//        if (this == cars) return true;
//        if (cars == null) return false;
//        if (!(cars instanceof Car)) return false;
//        Car car = (Car) cars;
//        return fari.equals(car.fari) &&
//                stekla.equals((car.stekla));
//    }

    public boolean equals(Object cars2) {
        if (this == cars2) return true;
        if (cars2 == null) return false;
        if (!(cars2 instanceof Car)) return false;
        Car car = (Car) cars2;
        return fari.equals(car.fari) ||
                stekla.equals((car.stekla));
    }

    @Override
    public String toString() {
        return "Car{" +
                "fari='" + fari + '\'' +
                ", stekla='" + stekla + '\'' +
                '}';
    }
}