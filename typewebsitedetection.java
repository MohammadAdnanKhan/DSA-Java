import java.util.Scanner;
public class typewebsitedetection {
    public static void main(String[]args){
        System.out.println("Program to know the type of website");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the url of the website");
        String url= sc.next();
        {
            if (url.endsWith(".org")) {
                System.out.println("This is an organizational website");
            }
       else if(url.endsWith(".com")) {
                System.out.println("This is a commercial website");
            }
       else if (url.endsWith(".in")) {
                System.out.println("This is an Indian website");
            }
       else{
                System.out.println("You are stupid!\nYou can't even copy the website url");

            }
        }
    }
}
