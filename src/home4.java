
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;
public class home4 {
    public static void main(String[] args) {

        /*  ЗАДАНИЕ 1 для запуска раскоментировать */
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter array length: ");
//                int s = input.nextInt();
//                int array[] = new int[s];
//                System.out.println("Insert array elements:");
//
//                for (int i = 0; i < s; i++) {
//                    array[i] = input.nextInt();
//                    System.out.print ("Inserted array elements:" + array[i]);
//                }
//    }


            /*   ЗАДАНИЕ 2 для запуска раскоментировать */
//             for (int j = 9; j > 0; j--){
//               for (int i = 0; i < 10; i++){
//                   System.out.println(i + " * " + j + " = " + i*j);
//                            }
//                          System.out.println();
//              }



        /*     ЗАДАНИЕ 3 для запуска раскоментировать */
//           Scanner scanner = new Scanner(System.in);
//               System.out.println("Введите число: " );
//               int a = scanner.nextInt();
//
//               while(a >= 0){
//                   System.out.println("Ваше число равно = " + a);
//                   break;
//                }


         /*   ЗАДАНИЕ 3.1 для запуска раскоментировать */
//           Scanner scanner = new Scanner(System.in);
//
//           do {
//              System.out.println("Какая сегодня была температура ? Введите число: ");
//                } while(scanner.nextInt() == 5);


        /* Задание 4*/
//              int[][] array = new int[4][8];
//
//              for (int i = 0; i < 4; i++) {
//                   for (int j = 0; j < 8; j++) {
//                   array[i][j] = i + j;
//                   System.out.print(array[i][j] + " ");
//                        }
//                        System.out.println();
//                    }


        /* -----------------------------DOP------------------------------------*/

//       int[] array = new int[]{2, 4, 6, 8, 10, 12};
//       int min = Integer.MAX_VALUE;
//
//          for (int i = 0; i < array.length; i++){
//                if (min > array[i]) {
//                    min = array[i];
//                }
//            }
//            System.out.println(min);
//            }
//        }


        /* Я бы выбрал метод сортировки пузырьком так как, он наиболее понятен для меня и я смог бы
        им воспользоваться */

//    int [] mass = {1,2,5,9,2,0};
////    for (int i = 0; i < mass.length; i++){
////        mass[i] = (int) (Math.random() * 8);
////    }
//        System.out.println("Не отсортированный массив " + Arrays.toString(mass));
//
//    int tmp;
//    boolean kon = false;
//
//    while (!kon){
//        kon = true;
//        for (int i=0; i <mass.length - 1; i++){
//            if (mass[i]>mass[i+1]) {
//                tmp = mass[i];
//                mass[i] = mass[i+1];
//                mass[i+1] = tmp;
//                kon = false;
//            }
//        }
//
//    }
//    System.out.println("Отсортированный массив " + Arrays.toString(mass));
//
//
    }
}
