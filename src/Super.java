public class Super {

         void kurit() {

         }
     }
    class Bab extends Super{
        void poet() {

        }
    }
    class Cab extends Bab{
        @Override
        public void kurit() {
            System.out.println("Кальянчик");
        }

        @Override
        void poet() {
            System.out.println("Песни");;
        }
    }


