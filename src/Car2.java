

public class Car2 {
    private String engine;
    private String color;
    private Integer wheel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != "black"){
            throw new RuntimeException("Цвет авто у вас не черный");
        }
        this.color = color;
    }

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        if (wheel < 5 || wheel > 15){
            throw new RuntimeException("У вас колес меньше 5 или больше 15");
        }
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "engine='" + engine + '\'' +
                ", transmision='" + color + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}