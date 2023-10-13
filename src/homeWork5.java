public class homeWork5 {
    public static void main(String[] args) {


        System.out.println(getSum(1));
        System.out.println(getSum(2.2, 3.2));
        System.out.println(getSum("3", "4"));
        System.out.println(getSum(true, true));
        System.out.println(getSum(1, 4, 5));
        System.out.println(getSum('\u03A6'));

        System.out.println(calc(3, 4));
        System.out.println(calc(4, 6, 7));
        System.out.println(calc(100, 2, 2, 5));
        System.out.println(calc(100, 2, 2, 5, 8));

        System.out.println(cube(3));

        uefi();
        }
        // Задание 1
        public static int getSum ( int a){
            return a;
        }

        public static double getSum(double a, double b){
        return a + b;
        }

        public static String getSum(String a, String b){
        return a + b;
        }

        public static boolean getSum(boolean a, boolean b){
        return a || b;
        }

        public static int getSum(int a, int b, int c){
        return a + b + c;
        }

        public static char getSum(char a){
        return a ;
        }

        // Задание 2

        public static char[] uefi() {
        char[] arr = {'\u2461', '\u2463', '\u2468'};
        for (char arran : arr){
            System.out.println(arran);
        }
        return arr;
        }

          // Задание 3

        public static int cube(int a){
        return a*a*a;
        }
//
//        // Задание 4
//

        public static int calc( int a, int b){
        return a*b;
        }
        public static int calc( int a, int b, int c){
        return a+b+c;
        }
        public static int calc( int a, int b, int c, int d){
        return a/b/c/d;
        }
        public static int calc( int a, int b, int c, int d, int e){
        return a-b-c-d-e;
        }
    }




