////public class Arraypractice {
////    public static void main(String[] args) {
////        /*float [] myArray={19.8f,2.66f,3.78f,4.9f,5.0f};
////        float sum=0;
////        for (int i=0;i<myArray.length-1;i++)
////        {
////            sum=sum+myArray[i];
////        }
////        System.out.println(sum);*/
////        float [] myArray={19.8f,2.66f,3.78f,4.9f,5.0f};
////        float num=198f;
////        boolean isinarray=false;
////        for (int i=0;i<myArray.length-1;i++)
////        {if (num==myArray[i]){
////           isinarray=true;
////        }
////
////
////        }
////        System.out.println(isinarray);}}
//public class Arraypractice {
//    public static void reversearray(int array[]){
//        for (int i = array.length-1; i>=0; i--) {
//            System.out.print(array[i]+" ");
//        }
//
//    }
//    public static void main(String[] args) {
//        int [] myarray={1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i <10; i++) {
//            System.out.print(myarray[i] + " ");
//        }
//        System.out.println();
//        reversearray(myarray);
//    }
//}
import java.util.Scanner;
public class Arraypractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        System.out.println("Enter the elements of array :-");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element on "+ i +" position : ");
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
    }
}