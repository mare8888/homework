abstract class Animal {
   abstract void perdiat();
   abstract void ediat();
   abstract  void pischat();


}

interface Norki {
    void norki();
}
class Sobaka extends Animal {
    @Override
    void perdiat() {
        System.out.println("Пердят как паровозы");
    }

    @Override
    void ediat() {
        System.out.println("Едят все подряд");
    }

    @Override
    void pischat() {
        System.out.println("Иногда песчат");
    }
}

    class Koti extends Animal {
        @Override
        void perdiat() {
            System.out.println("Редко пердят");
        }

        @Override
        void ediat() {
            System.out.println("Едят только избранное");
        }

        @Override
        void pischat() {
            System.out.println("Никогда не писчат");
        }
    }
class Miwi extends Animal implements Norki{
    @Override
    void perdiat() {
        System.out.println("Иногда пердят");
    }

    @Override
    void ediat() {
        System.out.println("Едят еду");
    }

    @Override
    void pischat() {
        System.out.println("This animal писчат");
    }

    @Override
    public void norki() {
        System.out.println("Роют норы");
    }

}
