import java.util.*;
//import java.util.*;
//public class BitManipulation {
//    public static boolean OddorEven(int Binnumber){
//       if((Binnumber&1)==0){
//            return true;}
//        return false;}
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int binarynumber=sc.nextInt();
//        System.out.println(OddorEven(binarynumber));}}

//public class BitManipulation {
//public static void ithbit(int num,int i){
//if((num&(1<<i))==0){System.out.println("The ith bit is 0");}
//else{System.out.println("The ith bit is 1"); }}
//public static void main(String[] args) {
//int num=90;int i=6;
//ithbit(num,i);}}


/*CLEAR LAST I BITS*/
//public  class BitManipulation {
//    public static void clearibits(int nums,int i){
//        int finalnum=nums&(~0<<i);
//        System.out.println(finalnum);}
//    public static void main(String[] args) {
//        int number=15;
//        clearibits(number,2);
//    }
//}

/*Clear range of bits*/
//public class BitManipulation {
//    public static int clearbitsinrange(int n,int i,int j){
//        int a=(~0)<<(j+1);
//        int b=(1<<i)-1;
//        int bitmask=a|b;
//        return n&bitmask;}
//    public static void main(String[] args) {
//        System.out.println(clearbitsinrange(15,1,2));}}

/*Check if a number is in order of power of 2*/
//public class BitManipulation {
//    public static boolean ispower(int n){
//        if((n&(n-1))==0){return true;}
//        return false;}
//    public static void main(String[] args) {
//        int num=32;
//        System.out.println(ispower(num));
//    }
//}

/*Count frequency of 1 in a number*/
//public class BitManipulation {
//public static int freq(int num){
//    int count=0;
//    while(num>0){
//        if((num&1)==1){count++;}
//      num=num>>1;}
//    return count;}
//    public static void main(String[] args) {
//    System.out.println(freq(15));}}

/*FAST EXPONENTIATION*/
//public class BitManipulation {
//    public static int fastexponentiation(int n,int a){
//        int ans=1;
//        while(n>0){
//            if((n&1)!=0){
//                ans=ans*a;}
//            a=a*a;
//            n=n>>1;}
//        return ans;}
//    public static void main(String[] args) {
//        System.out.println(fastexponentiation(2,15));}}

/*UPPERCASE TO LOWERCASE USING BIT*/
//public class BitManipulation {
//    public static void main(String[] args) {
//        for (char ch='A'; ch <='Z' ; ch++) {
//            System.out.print((char)(ch|' ')+" ");
////            System.out.print(ch);
//           }}}
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
if ((n&(n-1))==0){
System.out.println("Yes! It is a power of 2");}
else{System.out.println("No! It is not a power of 2");}}}
