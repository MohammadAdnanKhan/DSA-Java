import java.util.Scanner;
public class prime {
    static int prime(int a){

        for (int i = 2; i <a/2 ; i++) {
            if (a%i==0){
                return 1;
            }}return 0;}
    public static void main(String[] args){
        System.out.println("This is a program to know if the number is prime or not\nOk Gutter Bhai");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a =sc.nextInt();
        if(a==0||a==1){
            System.out.println("Not a prime number");
        }
        else if(prime(a)==1){
            System.out.println("No it is not a prime number");
        }
        else{System.out.println("Yes it is a prime number");}}}
