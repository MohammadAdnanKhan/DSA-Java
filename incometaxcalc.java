import java.util.Scanner;
class incometaxcalc{
    public static void main(String[]args){
        System.out.println("Hello!\nThis is a program to calculate you income tax");
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter you annual income in lakhs");
        float income=sc.nextFloat();
        {if (income>=2.5 && income<5.0) {
            System.out.println("Pay an income tax of:" + income*0.05 + "Lakhs");}
        else if (income >= 5.0 && income < 10.0) {
                System.out.println("Pay an income tax of:" + income*0.2 + "Lakhs");
            }
        else if (income>=10.0){
                System.out.println("\"Pay an income tax of:" + income*0.3 + "Lakhs");
            }
        else{
            System.out.print("You are gareeb\nDon't pay any income tax");
        }}

    }
}