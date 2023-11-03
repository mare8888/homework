package Domawka8;

class Moj {
    String name;
    Type TimeToBreakfast;
    Integer age;

    public Moj(String name, Type timeToBreakfast, Integer age) {
        this.name = name;
        TimeToBreakfast = timeToBreakfast;
        this.age = age;
    }
}
enum Type {
    BREAKFAST ,
    LANCH ,
    DINNER
}
