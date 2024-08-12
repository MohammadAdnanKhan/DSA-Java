//import java.util.Scanner;
//public class practicequestions {
//    public static void TAUHEED(int n){
//        for (int i = 0; i <=n; i++) {
//            System.out.println("ALLAH HU AKBAR!!!!");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("How many times you want to praise Allah?");
//        int a=sc.nextInt();
//        TAUHEED(a);
//    }
//}
//import java.util.Scanner;
//public class practicequestions {
//    public static float avg(float a,float b,float c){
//        float average=(a+b+c)/3;
//        System.out.println("The average of the three numbers is "+ average);
//        return average;
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the three numbers of which you want the average\n");
//        float a= sc.nextFloat();
//        float b= sc.nextFloat();
//        float c= sc.nextFloat();
//        avg(a,b,c);
//    }
//}
//import java.util.Scanner;
//public class practicequestions {
//    public static boolean iseven(int a){
//        if (a%2==1){
//            return false;}
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the integer you want to check");
//        int a=sc.nextInt();
//       if(iseven(a)){
//           System.out.println("Number is even");}
//           else{
//               System.out.println("Number is odd");
//           }
//       }
//
//    }
//import java.util.Scanner;
//public class practicequestions{
//    public static boolean ispalindrome(int a){
//        int num=a;
//        int reversenum=0;
//        while(a>0){
//            int lastdigit=a%10;
//            reversenum=reversenum*10+lastdigit;
//            a=a/10;
//        }
//        return num==reversenum;}
//    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number you want to check");
//int a= sc.nextInt();
//    if (ispalindrome(a)){
//        System.out.println("Yes!!!\nIt's a palindrome");}
//        else{
//            System.out.println("No!!!\nIt's not a palindrome");
//
//        }
//    }
//    }
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class practicequestions {
//    public static int sumofdigits(int num){
//        int sum=0;
//        while(num>0){
//            int lastdigit=num%10;
//            sum=sum+lastdigit;
//            num=num/10;
//
//        }
//        System.out.println("The sum is "+sum);
//        return sum;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of you you want to compute the sum of digits");
//        int a=sc.nextInt();
//        sumofdigits(a);
//
//    }
//}
//public class practicequestions {
//    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
//public class practicequestions {
//    public static void holrect(int rows,int colmn){
//        for (int i = 1; i <=rows ; i++) {
//            for (int j = 1; j <=colmn ; j++) {
//                if (i==1||i==rows||j==1||j==colmn){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }}
//
//    public static void main(String[] args) {
//                holrect(19,12);
//
//
//            }
//
//        }
//public class practicequestions {
//    public static void rotatedpyramid(int rows){
//        for (int i = 1; i <=rows ; i++) {
//            for (int j = 1; j <=rows-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//
//    }
//    public static void main(String[] args) {
//rotatedpyramid(4);
//    }
//}
//public class practicequestions {
//    public static void invertedpyramidnum(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//
//    }
//    public static void main(String[] args) {
//        invertedpyramidnum(30);
//    }
//}
//public class practicequestions {
//    public static void floydtriangle(int n){
//        int ch=1;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
//        }
//
//
//    }
//    public static void main(String[] args) {
//        floydtriangle(3);
//    }
//}
//public class practicequestions {
//    public static void zeroonetri(int n){
//        for (int i = 0; i <=n; i++) {
//            for (int j = 0; j <=i; j++) {
//                if ((i+j)%2==0){
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        zeroonetri(5);
//    }
//}
//public class practicequestions {
//    public static void butterfly(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");}
//                for (int k = 1; k <=2*(n-i) ; k++) {
//                    System.out.print(" ");}
//                    for (int l = 1; l <=i; l++) {
//                        System.out.print("*");}
//            System.out.println();
//        }
//        for (int i = n; i >=1; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");}
//            for (int k = 1; k <=2*(n-i) ; k++) {
//                System.out.print(" ");}
//            for (int l = 1; l <=i; l++) {
//                System.out.print("*");}
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        butterfly(4);
//    }
//}
//public class practicequestions {
//    public static void main(String[] args) {
//        for (int i = 0; i <=3; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <=2; i++) {
//            for (int j = 0; j <=2-i ; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }}
//public class practicequestions {
//    public static void main(String[] args) {
//        for (int i = 0; i <=10; i++) {
//            for (int j = 0; j <=10; j++) {
//                if(i==0||j==0||i==10||j==10||i==j||i==10-j){
//                    System.out.print(" * ");}
//                else{
//    System.out.print("   ");
//}}
//            System.out.println();
//        }
//    }
//}
//public class practicequestions {
//    public static void main (String[] args) {
//      practicequestions obj = new practicequestions();
//      patter();
//    }
//    public static void patter (){
//     for (int i=1 ; i<=21; i++){
//         for (int j=1; j<=22-i;j++) {
//         System.out.print (" $ ");
//
//         }
//         System.out.println();}}}
//public class practicequestions {
//    public static void main (String[] args) {
//        practicequestions obj =  new practicequestions ();
//        athar();}
//  public static void athar (){
//        char a='A';
//        for (int i=1; i<=14;i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(" "+a+" ");
//                a++;}
//            System.out.println();}}}

//public class practicequestions {
//    public static void product(int [] array){
//        int product=1;int [] required=new int [array.length];
//        for (int i = 0; i <array.length ; i++) {
//            product*=array[i];}
//        for (int i = 0; i <array.length; i++) {
//            required[i]=product/array[i];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(required[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//int [] nums={1,2,3,4};
//product(nums);}}

//public class practicequestions {
//    public static void maximumfrequency(int[] array) {
//        int maxFrequency = 0;
//        int currentFrequency = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                currentFrequency++;
//                maxFrequency = Math.max(maxFrequency, currentFrequency);
//            } else {
//                currentFrequency = 0;
//            }
//        }
//
//        System.out.println(maxFrequency);
//    }
//
//    public static void main(String[] args) {
//        int array[] = {1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
//        maximumfrequency(array);
//    }
//}

//public class practicequestions {
//    public static void main(String[] args) {
//        String str1="aaabcd";
//        String str2="aaabce";
//        System.out.println(str1.compareTo(str2));
//    }
//
//}
//public class practicequestions {
//    public static void main(String[] args) {
//        int [][] array={{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
//        for (int i = 0; i <4; i++) {
//            for (int j = 0; j <3; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}


//public class practicequestions {
//    public static void main(String[] args) {
//        int num=0;
//        int [][] array= new int[4][3];
//        for (int i = 0; i <4; i++) {
//            num++;
//            for (int j = 0; j <3; j++) {
//                array[i][j]=num+(4*j);
//            }
//
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class practicequestions {
//    public static int answer(int x){
//        int answer=1;
//        for (int i = 0; i <x; i++) {
//            x=answer*x;
//        }
//        answer=x;
//        return answer;}
//    public static void main(String[] args) {
//        System.out.println(answer(5));
//    }
//}

//public class practicequestions {
//   public static int maxsumcontiguous(int [] array){
//       int sum=0;
//       int maxsum=Integer.MIN_VALUE;
//       for (int i = 0; i < array.length ; i++) {
//           sum+=array[i];
//           if(sum<0){sum=0;}
//           maxsum=Math.max(sum,maxsum);}
//return maxsum;}
//    public static void main(String[] args) {
//int [] array={1,2,3,-2,-8,9};
//        System.out.println(maxsumcontiguous(array));
//    }
//}

/*AP CHECK*/
//public class practicequestions {
//    public static boolean isAP(int [] array){
//        for (int i = 0; i < array.length-3; i++) {
//            if(array[i+1]-array[i]!=array[i+3]-array[i+2]){
//                return false;}}
//        return true;}
//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5,6,8};
//        System.out.println(isAP(arr));}}

/*FIBONACCI NUMBERS*/
//public class practicequestions {
//public static void fibonacci(int n){
//    int a=0;
//    int first=0;
//    int second=1;
//    while(a<=n){
//        System.out.print(first+" ");
//        int next=first+second;
//    first=second;
//        second=next;
//    a++;}}
//    public static void main(String[] args) {
//fibonacci(10);}}

//Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

import java.lang.invoke.WrongMethodTypeException;
import java.util.Arrays;

//public class practicequestions {
//    public static int romantoint(String s) {
//        int num = 0;
//        int i = 0;
//        while (i < s.length()) {
//            if (i < s.length() - 1) {
//                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {num += 4;i += 2;}
//                else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {num += 9;i += 2;}
//                else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {num += 40;i += 2;}
//                else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {num += 90;i += 2;}
//                else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {num += 400;i += 2;}
//                else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {num += 900;i += 2;}}
//            if (i < s.length()) {
//                if (s.charAt(i) == 'I') {num += 1;}
//                else if (s.charAt(i) == 'V') {num += 5;}
//                else if (s.charAt(i) == 'X') {num += 10;}
//                else if (s.charAt(i) == 'L') {num += 50;}
//                else if (s.charAt(i) == 'C') {num += 100;}
//                else if (s.charAt(i) == 'D') {num += 500;}
//                else if (s.charAt(i) == 'M') {num += 1000;}
//                else {System.out.println("Invalid character present in the given string");}
//                i++;}}
//        return num;}
//    public static void main(String[] args) {
//        System.out.println(romantoint("VI")); }}


//public class practicequestions {
//    public static void seq(int n){
//        int a=0;
//        int b=0;
//        while(b<n){
//            a++;
//            int m=3*a+2;
//            if(m%4!=0){System.out.print(3*a+2+" ");b++;}
//        }}
//    public static void main(String[] args) {
//        seq(10);}}

//public class practicequestions {
//public static int firstoccurence(int [] arr,int key){
//    for (int i = 0; i < arr.length; i++){
//        if(arr[i]==key){return i;}}
//    return -1;}
//    public static void main(String[] args) {
//        int [] arr={1,2,3,5,4,8,9,5};
//        System.out.println(firstoccurence(arr,5));}}


//public class practicequestions {
//    public static int lastoccurence(int [] arr,int key){
//        for (int i = arr.length-1; i>=0;i--){
//            if(arr[i]==key){return i;}}
//        return -1;}
//    public static void main(String[] args) {
//        int [] arr={1,2,3,5,4,8,5,9};
//        System.out.println(lastoccurence(arr,5));}}

//public class practicequestions {
//public static void missing(int [] array){
//    Arrays.sort(array);
//    for (int i = 0; i <array.length-1; i++) {
//        if(array[i]>0){
//        if(array[i+1]-array[i]!=1){
//            System.out.println(array[i+1]-array[i]);}}}}
//    public static void main(String[] args) {
//        int [] array={3,4,-1,1};
//        missing(array);}}

//public class practicequestions {
//public static String rep(String str1,String str2,String str3,String str4){
//    StringBuilder sb =new StringBuilder("");
//    for (int i = 0; i < str1.length(); i++) {
//        if(str1.charAt(i)==str2.charAt(i)&&str3.charAt(i)==str4.charAt(i)&&str1.charAt(i)==str3.charAt(i)){
//            sb.append(str1.charAt(i));}}
//    return sb.toString();}
//    public static void main(String[] args) {
//        System.out.println(rep("Coding","Coders","Codingninjas","Codingclub"));}}

import java.util.*;
//public class practicequestions {
//    static int answer,finalanswer;
//public static int maxwater(int [] array){
//    int max=Integer.MIN_VALUE;
//    for (int i = 0; i < array.length-1; i++) {
//        for (int j = i+1; j <array.length; j++) {
//            int height=Math.min(array[i],array[j]);
//           answer=Math.abs((height)*(i-j));
//           finalanswer=Math.max(max,answer);}}
//    return finalanswer;}
//    public static void main(String[] args) {
//        int [] array={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxwater(array));}}


































