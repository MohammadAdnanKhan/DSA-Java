import java.util.Scanner;

public class percentagecalc {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in english");
        int a= sc.nextInt();
        System.out.println("Enter the marks in hindi");
        int b= sc.nextInt();
        System.out.println("Enter the marks in maths");
        int c= sc.nextInt();
        System.out.println("Enter the marks in sst");
        int d= sc.nextInt();
        System.out.println("Enter the marks in science");
        int e= sc.nextInt();
        int total=(a+b+c+d+e);
        System.out.println(total);
        System.out.println("Enter the maximum marks in one subject");
       int mm=sc.nextInt();
       int MM=mm*5;
       float percentage=((float)total/MM)* 100;
        System.out.println("The percentage is: "+percentage+"%");
        { if (percentage<40){
            System.out.println("You failed!\nBetter luck next time");}
            else{
                System.out.println("Congrats!\n You passed");
            }
        }
    }
}
