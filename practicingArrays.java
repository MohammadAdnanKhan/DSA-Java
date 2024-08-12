//public class practicingArrays {
//    public static void main(String[] args) {
//        int[] array={2,3,5,6,8,0,14,22};
//        for (int element:array){
//            System.out.print(element +" ");}
//int max=0;
//        //this code is not this much easy in C language. you have to follow the complete algorithm.
//        for (int element:array){
//            if(element>max){
//                max=element;
//            }
//
//        }
//        System.out.println("\n"+max);
//    }
//}
//public class practicingArrays {
//    public static int maximum(int array[]){
//        int max=0;
//        for (int i = 0; i <array.length; i++) {
//            if (array[i]>max){
//                max=array[i];}
//
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int [] myarray={1,4,2,3,12,9};
//        for (int i = 0; i <7; i++) {
//            System.out.print(myarray[i]+" ");}
//       int maximumnumber= maximum(myarray);
//        System.out.println("\nThe largest element in the array is "+ maximumnumber);
//    }
//}
/*PAIRS IN AN ARRAY*/
//public class practicingArrays {
//        public static int pairs(int array[]){
//            for (int i = 0; i < array.length-1; i++) {
//                int current=array[i];
//                for (int j = i+1; j <array.length ; j++) {
//                    System.out.print("("+current+","+array[j]+")");
//                }
//                System.out.println();}return 0;}
//            public static void main(String[] args){
//    int [] array={2,4,6,8,10};
//        pairs(array);
//}}
//public class practicingArrays {
//    public static void printsubarrays(int array[]){
//        for (int i = 0; i <array.length; i++) {
//            int start=i;
//            for (int j = i; j <array.length ; j++) {
//                int end=j;
//                {
//                    for (int k = start; k < end; k++) {
//                        System.out.print(array[k]);}
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int [] array={1,2,3,4,5,6};
//        printsubarrays(array);
//    }
//}
/*SUB ARRAYS WITH SUM*/
//public class practicingArrays {
//public static void printsubarrays(int [] array){
//    for (int i = 0; i <=array.length-1; i++) {
//int start=i;
//int sum=0;
//        for (int j = i; j <=array.length-1 ; j++) {
//            int end=j;
//          sum=0;
//            for (int k = start; k <=end ; k++) {
//                System.out.print(" "+array[k]+" ");
//                sum+=array[k];
//            }System.out.print("   The sum of this subarray is "+sum);
//            System.out.println();
//
//        }
//        System.out.println();
//    }}
//    public static void main(String[] args) {
//      int[] numbers={2,4,6,8,10};
//      printsubarrays(numbers);
//    }
//}
/*Pairs*/
//public class practicingArrays {
//    public static void pairs(int []array){
//        for (int i = 0; i < array.length; i++) {
//            int current=array[i];
//            for (int j = i+1; j <array.length ; j++) {
//                System.out.print("("+current+","+array[j]+")"+" ");
//                }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int [] array={1,2,3,4,5,6,7,8,9};
//        pairs(array);
//    }
//}
/*SUB ARRAYS*/
//public class practicingArrays {
//    public static void subarrays(int[] array){
//        for (int i = 0; i <array.length; i++) {
//            int start=i;
//            for (int j = i; j <array.length; j++) {
//                int end=j;
//                for (int k = start; k <=end ; k++) {
//                    System.out.print(array[k]);}
//                System.out.println();}
//            System.out.println();}}
//    public static void main(String[] args) {
//        int [] numbers={1,2,3,4,5};
//        subarrays(numbers);}}

/*Subarrays hi dsa 2.0 me*/
//public class practicingArrays {
//    public static void printsubarrays(int array[]){
//        for (int i = 0; i <array.length; i++) {
//            int start=i;
//            for (int j = i; j <array.length ; j++) {
//                int end=j;
//                {
//                    for (int k = start; k < end; k++) {
//                        System.out.print(array[k]);}
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int [] array={1,2,3,4,5,6};
//        printsubarrays(array);
//    }
//}























