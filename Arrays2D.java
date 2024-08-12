////import java.util.*;
////public class Arrays2D {
////    public static void main(String[] args) {
////        int [][] matrix=new int [3][3];
////        Scanner sc=new Scanner(System.in);
////        for (int i = 0; i <matrix.length ; i++) {
////            for (int j = 0; j < matrix[0].length; j++) {
//////                matrix[i][j]=sc.nextInt();}}
//////        for (int i = 0; i <matrix.length ; i++) {
//////            for (int j = 0; j < matrix[0].length; j++) {
//////                System.out.print(matrix[i][j]+" ");}
//////            System.out.println();}
//////        boolean found = false;
//////        for (int i = 0; i < matrix.length; i++) {
//////            for (int j = 0; j < matrix[0].length; j++) {
//////                if (matrix[i][j] == 8) {
//////                    found = true;
//////                    System.out.println("Found at " + i + "," + j);}}}
//////        // If value 8 is not found
//////        if (!found) {
//////            System.out.println("Not found");}}}
////
////
/*MAXIMUM AND MINIMUM IN 2D ARRAY*/
////import java.util.*;
////public class Arrays2D {
////    public static void maximum(int[][] array) {
////        int maximum = array[0][0];
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[0].length; j++) {
////                maximum = Math.max(maximum, array[i][j]);
////            }
////        }
////        System.out.println("The largest element is => " + maximum);
////    }
////
////    public static void minimum(int [][] array){
////        int minimum=array[0][0];
////        for (int i = 0; i <array.length ; i++) {
////            for (int j = 0; j < array[0].length; j++) {
////                minimum=Math.min(minimum,array[i][j]);
////            }
////        }
////        System.out.println("The smallest element is => "+ minimum);
////    }
////    public static void main(String[] args) {
////        int [][] matrix=new int [3][3];
////        Scanner sc=new Scanner(System.in);
////        for (int i = 0; i <matrix.length ; i++) {
////            for (int j = 0; j < matrix[0].length; j++) {
////                matrix[i][j]=sc.nextInt();}}
////        for (int i = 0; i <matrix.length ; i++) {
////            for (int j = 0; j < matrix[0].length; j++) {
////                System.out.print(matrix[i][j]+" ");}
////            System.out.println();}
////    maximum(matrix);
////        minimum(matrix);
////    }}
//
/*sum of diagonal*/
////public class Arrays2D {
////public static void diagonalsum(int [][] array){
////    int sum=0;
////    for (int i = 0; i <array.length; i++) {
////        for (int j = 0; j < array[0].length; j++) {
////            if(i==j||i==array.length-j-1){
////              sum +=array[i][j];
////            }
////        }
////    }
////    System.out.println("\nThe sum of the diagonal elements is "+sum);
////}
////
////    public static void main(String[] args) {
////        int[][] nums={{1,2,3,4},{5,6,7,8},{0,1,2,3},{5,6,7,8}};
////        for (int i = 0; i <nums.length; i++) {
////            for (int j = 0; j < nums[0].length; j++) {
////                System.out.print(nums[i][j]+"_");
////            }
////            System.out.print("\b");
////            System.out.println();
////        }
////        diagonalsum(nums);
////    }
////}
//
/*practice set apna college*/
//public class Arrays2D {
//public static void repeatations(int [][] array,int key){
//    int a =0;
//    for (int i = 0; i < array.length; i++) {
//        for (int j = 0; j < array[0].length; j++) {
//            if(array[i][j]==key){a++;}}}
//    System.out.print("Frequency of "+key+" ==> "+a);}
//    public static void main(String[] args) {
//        int[][] nums={{1,2,3,4},{4,3,2,1},{9,8,7,1}};
//repeatations(nums,1);}}


/*Sum of 2nd row*/
//public class Arrays2D {
//    public static void sum(int[][] array){
//        int sum=0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j <array[0].length;j++) {
//                if(j==1){
//                    sum+=array[i][j];
//                }
//            }
//        }
//        System.out.println("The sum of the elements in the second row"sum);
//    }
//    public static void main(String[] args) {
//        int [][] nums={{1,2,3},{4,5,6},{7,8,9}};
//        sum(nums);
//    }
//}


/*TRANSPOSE*/
//public class Arrays2D {
//    public static void printarray(int [][] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[0].length; j++) {
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }}
//
//    public static void main(String[] args) {
//    int [][] array={{1,2,3},{4,5,6}};
//        int[][] transpose=new int[array[0].length][array.length];
//        for (int i = 0; i <array[0].length; i++) {
//            for (int j = 0; j <array.length; j++) {
//                transpose[i][j]=array[j][i];
//            }}
//        printarray(transpose);
//    }
//}


/*SPIRAL ORDER*/
public class Arrays2D {
    public static void spiral(int [][] array){
        


    }
    public static void main(String[] args) {
        int [][] array={{1,2,3},{4,5,6},{7,8,9}};
    }
}






















