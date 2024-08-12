import java.util.Scanner;
class learning_structure{
    public static void main(String[]args){
        System.out.println("TAKING INPUT FROM THE USER");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
int product=a*b;
        System.out.print("The product of the two numbers is: ");
        System.out.println(product);
        System.out.println("To check if the value is integer, enter the value");
                boolean b1=sc.hasNextInt();
                System.out.println(b1);
            }
        }