import java.util.Arrays;
import java.util.Scanner;
public class recursionjava{
static int factorial(int n){
    if (n==0||n==1) {
        return 1;}
    else{
        return n*factorial(n-1);}}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you want the factorial: ");
        int n=sc.nextInt();
       int answer= factorial(n);
        System.out.println("The factorial of "+n+" is "+answer);
    }
}
