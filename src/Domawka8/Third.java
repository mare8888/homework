package Domawka8;

public class Third {

    enum Operations {
        SUM {
            @Override
            public int action(int a, int b) {
                return a + b;
            }
        },
        MINUS {
            @Override
            public int action(int a, int b) {
                return a - b;
            }
        },
        UMNOJIT {
            @Override
            public int action(int a, int b) {
                return a * b;
            }
        },
        STEPEN {
            @Override
            public int action(int a, int b) {
                return a*a;
            }
        };
        public abstract int action(int a, int b);
    }
}


