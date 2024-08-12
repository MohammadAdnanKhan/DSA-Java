//public class SortingAlgorithms {
//public static void insertionsort(int [] arrays){
//    for (int i = 0; i <arrays.length; i++) {
//        int current=arrays[i];
//        int prev=i-1;
//        while (prev>=0 && arrays[prev]>current){
//            arrays[prev+1]=arrays[prev];
//            prev--;}
//    arrays[prev+1]=current;}
//}
//public static void main(String[] args) {
//       int [] arrays={8,7,6,5,4,5,3,2,1};
//       insertionsort(arrays);
//    for (int i = 0; i < 9; i++) {
//        System.out.print(arrays[i]+"_");
//    }
//    System.out.print("\b");
//    }}

import java.util.Arrays;
public class SortingAlgorithms {
    public static void main(String[] args) {
        int [] array={3,4,2,1,6,7,0,8};
        Arrays.sort(array);
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i]+"_");
        }
        System.out.print("\b");}}