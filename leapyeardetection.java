import java.util.Scanner;
public class leapyeardetection {
    public static void main(String[]args){
        System.out.println("This is a program for stupid peoples to check if a year is a leap year or not");
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        {if (year>2023||year<0){
            System.out.println("Enter a valid year");}
            else{
            {if(year%4==0){
                System.out.println("Yes! " +year + " is a leap year");
            }
            else{
                System.out.println("This is not a leap year");}}

            }

        }
    }
}
