/*12345
* 1234
* 123
* 12
* 1*/
//public class patterns {
//    public static void main(String[] args) {
//        int a=1;
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print(j);
//                a++;
//            }
//            a=1;
//            System.out.println();
//        }
//    }
//}
/*1
* 01
* 101*/
//public class patterns {
//    public static void main(String[] args) {
//        int a=0;
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j <i; j++) {
//                if ((i+j)%2==0){
//                    System.out.print(0+" ");
//                }
//                else {
//                    System.out.print(1+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
/*Butterfly*/
//public class patterns {
//    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j <i; j++) {
//                System.out.print('*'+" ");
//            }
//            for (int j = 0; j < 2*(6-i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print('*'+" ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j <6-i; j++) {
//                System.out.print('*'+" ");
//            }
//            for (int j =0; j<2*i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < 6-i; j++) {
//                System.out.print('*'+" ");
//            }
//            System.out.println();
//        }
//    }
//}