public class binomialcoefficient {
    public static int factorial(int n){
int f=1;
for (int i = 1; i <= n; i++) {
f=f*i;}
return f;}
    public static int binomialcoeff(int n,int r){
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
       int result=a/(b*c);
    return result;}
public static void main(String[] args) {
int c=binomialcoeff(9,3);
    System.out.println("The binomial coefficient is "+c);}}