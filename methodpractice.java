//import java.util.Scanner;
//public class methodpractice {
//  static  int intelligence(int a,int b){
//if (a>=b){
//    System.out.println("You are more intelligent");}
//else {
//    System.out.println("No problem!\nA paper cannot judge your intelligence");
//}
//return 0;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your marks : ");
//        int a= sc.nextInt();
//        System.out.print("Enter your friend's marks : ");
//        int b= sc.nextInt();
//intelligence(a,b);
//    }
//}
//import java.util.Scanner;
//public class methodpractice {
//    static boolean isEven(int a){
//            if(a%2==0){return true;}
//     else {return false;}}
//    public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//    int a=sc.nextInt();
//    if (isEven(a)){
//        System.out.println("True");}
//    else{
//        System.out.println("False");
//    }}}
//import java.util.Scanner;
//public class methodpractice {
//boolean isPalindrome(int a){
//    int reversenum=0;
//    while(a>0) {
//        int lastdigit=a%10;
//        reversenum += reversenum*10+lastdigit;
//    a=a/10;}
//    if(a==reversenum){return true;}
//else {return false;}}
//public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    int a=sc.nextInt();
//    if(isPalindrome(a)){
//        System.out.println("True");
//    }}}
//public class methodpractice {
//    static int prime(int a){
//        for (int i = 2; i <a/2 ; i++) {
//            if (a%i==0){
//                return 1;
//            }}return 0;}
//    public static void main(String[] args){
//        int a=17;
//        System.out.println("This is a program to know if the number is prime or not\nOk Gutter Bhai");
//        if(a==0||a==1){
//            System.out.println("Not a prime number");}
//        else if(prime(a)==1){
//            System.out.println("No it is not a prime number");}
//        else{System.out.println("Yes it is a prime number");}}}

/*Apna college arrays 1st ques*/
//import java.util.Scanner;
//public class methodpractice {
//    public static boolean hasduplicate(int array[]){
//        for (int i = 0; i <array.length-1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i]==array[j]){
//                    return true;}
//            }}
//        return false;
//    }
//public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the length of array");
//    int n=sc.nextInt();
//    int [] array=new int[n];
//    for (int i = 0; i <n ; i++) {
//        System.out.println("Enter the element of the array");
//        array[i]=sc.nextInt();}
//    System.out.println("The array is as follows:-");
//    for (int i = 0; i < array.length; i++) {
//        System.out.print(array[i]+" ");}
//    if(hasduplicate(array)){
//        System.out.println("\nTrue");}
//    else{
//        System.out.println("\nFalse");
//    }
//    }}























