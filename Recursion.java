//import java.util.*;
//public class Recursion {
//    public static void numdecreasing(int n){
//        if(n==1){
//            System.out.print(n);
//            return;}
//        System.out.print(n+"_");
//        numdecreasing(n-1);}
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int n=sc.nextInt();
//        System.out.println();
//        numdecreasing(n);
//    }
//}

//public class Recursion {
//    public static void numincreasing(int n) {
//    if(n==1){
//        System.out.print(n+" ");
//        return;}
//    numincreasing(n-1);
//        System.out.print(n+" ");}
//    public static void main(String[] args) {
//        numincreasing(10);}}

/*FACTORIAL BY RECURSION*/
//public class Recursion {
//    public static int factorial(int n){
//        if(n==0){
//            return 1;}
//    int answer=n*factorial(n-1);
//    factorial(n-1);
//    return answer;}
//
//    public static void main(String[] args) {
//        System.out.println(factorial(5));}}

/*SUM OF n NATURAL NOS BY RECURSION*/
//public class Recursion {
//public static int sum(int n){
//    if (n == 1) {return 1;}
//int answer=n+sum(n-1);
//    sum(n-1);
//    return answer;}
//public static void main(String[] args) {
//    System.out.println(sum(4));}}

/*FIBONACCI NOS.*/
//public class Recursion {
//public static int fib(int n){
//if(n==0||n==1){return n;}
//int fnm1=fib(n-1);
//    int fnm2=fib(n-2);
//int fn=fnm1+fnm2;
//return fn;}
//    public static void main(String[] args) {
//        System.out.println(fib(25));}}

/*ARRAY SORTED OR NOT*/
//public class Recursion {
//    public static boolean issorted(int [] arr,int i){
//        if(i== arr.length-1){return true;}
//        if(arr[i]>arr[i+1]){return false;}
//        return issorted(arr,i+1);}
//    public static void main(String[] args) {
//int [] array={5,1,2,3,4};
//        System.out.println(issorted(array,0));}}

//public class Recursion {
//    public static int fac(int n){
//     if(n==0||n==1){return 1;}
//     int fnm1=n*fac(n-1);
//        return fnm1;}
//    public static void main(String[] args) {
//        System.out.println(fac(5));}}

//public class Recursion {
//public static int fib(int n){
//    if(n==0||n==1){return n;}
//    int fnm1=fib(n-1);
//    int fnm2=fib(n-2);
//    int fn=fnm1+fnm2;
//return fn;}
//    public static void main(String[] args) {
//        System.out.print(fib(10));}}

//public class Recursion {
//public static boolean isSorted(int [] array,int i){
//    if(i==array.length-1){return true;}
//    if(array[i]>array[i+1]){return false;}
//    return isSorted(array,i+1);}
//    public static void main(String[] args) {
//        int [] arr={1,2,9,3,4,5};
//        System.out.println(isSorted(arr,0));}}

/*FIRST OCCURENCE*/
//public class Recursion {
//public static int firstoccurence(int [] arr,int key,int i){
//    if(i<arr.length){
//    if(arr[i]==key){
//        return i;}}
//    else {return -1;}
//   return firstoccurence(arr,key,i+1);}
//public static void main(String[] args) {
//        int [] arr={1,2,4,3,7,8,9,3,0,3,6};
//    System.out.println(firstoccurence(arr,3,0));}}

/*LAST OCCURENCE*/
//public class Recursion {
//    public static int lastoccurence(int [] arr,int key,int i){
//        if(i<arr.length){
//            if(arr[i]==key){
//                return i;}}
//        else {return -1;}
//        return lastoccurence(arr,key,i-1);}
//    public static void main(String[] args) {
//        int [] arr={1,2,4,3,7,8,9,3,0,3,6};
//        System.out.println(lastoccurence(arr,3, arr.length-1));}}

/*PRINT x^n*/
//public class Recursion {
//public static int exp(int x,int n){
//    if(n==0){return 1;}
//   int xnm1=x*exp(x,n-1);
//return xnm1;}
//public static void main(String[] args) {
//    System.out.println(exp(2,10));}}

//public class Recursion {
//public static int tilingprob(int n){
//    //base case
//    if(n==0||n==1){return 1;}
//    //vertical choice
//    int fnm1=tilingprob(n-1);
//    //horizontal choice
//    int fnm2=tilingprob(n-2);
//    //total
//    int total=fnm1+fnm2;
//    return total;}
//    public static void main(String[] args) {
//        System.out.println(tilingprob(5));}}

//public class Recursion {
//public static void indices(int [] arr,int key,int i){
//    if(i>= arr.length){return;}
//    if(arr[i]==key){
//        System.out.print(i+" ");}
//indices(arr,key,i+1);}
//    public static void main(String[] args) {
//int [] arr={3,2,4,5,6,2,7,2,2};
//indices(arr,2,0);}}

//public class Recursion {
//public static void digitstomun(int num){
//String [] digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
//if(num==0){return;}
//    digitstomun( num/10);
//System.out.print(digits[num%10]+" ");}
//    public static void main(String[] args) {
//digitstomun(2019);}}

//public class Recursion {
//    static int a=0;
//public static void freq(int num){
//    if(num==0){return;}
//    if(num%10==0){a++;}
//    freq(num/10);}
//    public static void main(String[] args) {
//freq(10204);
//        System.out.print(a);}}

//public class Recursion {
//    static int a=0;
//public static void lengthofstring(String str,int i){
//    if(i==str.length()-1){return;}
//    if(i!=str.length()){a++;}
//lengthofstring(str,i+1);}
//    public static void main(String[] args) {
//    lengthofstring("abcd",0);
//        System.out.println(a);}}

public class Recursion {
    static int a=0;
public static void occ(int [] arr,int key,int i){
    if(i< arr.length){
    if(arr[i]==key){a++;}
    occ(arr,key,i+1);}}
    public static void main(String[] args) {
int [] arr={5,7,7,8,8,10};
occ(arr,8,0);
        System.out.println(a);}}














