//public class Strings {
//    public static void main(String[]args){
//        String myname="The name is Adnan Khan";
//        System.out.println(myname.toLowerCase());
//        System.out.println(myname.replace(" ","_"));
//        String sc= "Dear <|name|>, Trans a lot";
//        System.out.println(sc);
//        System.out.println(sc.replace("<|name|>","Adnan"));
//        String mystring="This line contains  double but not triple spaces";
//        System.out.println(mystring.indexOf("  "));
//        System.out.println(mystring.indexOf("   "));
//        System.out.println("Dear\tAdnanm\b,\tThis\tJava\tCourse\tis\tnice.\n\"Thanks\"");}}


//public class Strings {
//public static boolean reverse(String str){
//    int i=0;
//    while(i<str.length()/2){
//        if(str.charAt(i)!=str.charAt(str.length()-i-1)){return false;}
//        i++;
//    }
//
//    return true;
//}
//
//    public static void main(String[] args) {
//        String str="raceprr";
//        if(reverse(str)){System.out.println("Yes");}
//        else{System.out.println("No");}}}

//public class Strings {
//    public static void main(String[] args) {
//        String str="Adnan";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
//    }
//}



/*SHORTEST PATH QUESTION*/
//import java.util.*;
//public class Strings {
//    public static  void position(String str){
//        int x=0,y=0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)=='N'){y++;}
//        else if(str.charAt(i)=='S'){y--;}
//            else if(str.charAt(i)=='E'){x++;}
//            else if(str.charAt(i)=='W'){x--;}}
//        System.out.println("The final position is "+"("+x+","+y+")");
//        double m=Math.sqrt(x*x+y*y);
//        System.out.println("The shortest path will be "+m+" units");
//    }
//    public static void main(String[] args) {
//        String given="WNEENESENNNQQQ";
//        position(given);
//    }
//}

//public class Strings {
//    public static void main(String[] args) {
//        String str="AdnanBhai";
//        System.out.println(str.substring(0,5));}}

/*STRING BUILDER*/
//public class Strings {
//   public static String toUppercase(String str){
//       StringBuilder sb=new StringBuilder("");  //initialize
//       char ch=Character.toUpperCase(str.charAt(0));
//sb.append(ch);
//       for (int i = 1; i <str.length(); i++) {
//           if(str.charAt(i)==' ' && i<str.length()-1){
//               sb.append(str.charAt(i));
//               i++;
//               sb.append(Character.toUpperCase(str.charAt(i)));}
//           else{sb.append(str.charAt(i));}}
//   return sb.toString();}
//    public static void main(String[] args) {
//       String str="shraddha is a cobra ..:``";
//        System.out.println(toUppercase(str));
//    }
//}


/*FIRST LETTER TO UPPER CASE*/
//public class Strings {
//    public static String toUppercase(String str){
//        StringBuilder sb=new StringBuilder("");
//        char ch=Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//        for (int i = 1; i <str.length() ; i++) {
//            if(str.charAt(i)==' '&& i<str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));}
//            else{sb.append(str.charAt(i)); }}
//    return sb.toString();}
//    public static void main(String[] args) {
//        String String="sharaddha is a cobra and dhattarwal is a rabbit";
//        System.out.println(toUppercase(String));
//    }
//}

/*COMPRESSION*/
//public class Strings {
//public static String compress(String str){
//    String newstr="";
//    for (int i = 0; i < str.length(); i++) {Integer count=1;
//        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//            count++;
//         i++;}
//        newstr+=str.charAt(i);
//        if (count>1){newstr+=count.toString();}}
//    return newstr;}
//    public static void main(String[] args) {
//        String string = "aaaaaaaaaaabcdddd";
//        System.out.println(compress(string));}}


/*NUMBER OF LOWERCASE VOWELS IN A STRING*/
//public class Strings {
//    public static int freq(String str){
//        int count=0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
//                count++;}}
//        return count;}
//    public static void main(String[] args) {
//        String str="AaEeOohjjjjhjkkIighhjkUuggh";
//        System.out.println(freq(str));}


/*ANAGRAMS*/
//import java.util.Arrays;
//public class Strings {
//    public static void anagrams(String str1,String str2){
//str1=str1.toLowerCase();
//str2=str2.toLowerCase();
//if(str1.length()==str2.length()){
//    char[] str1tochararray=str1.toCharArray();
//    char[] str2tochararray=str2.toCharArray();
//    Arrays.sort(str1tochararray);
//    Arrays.sort(str2tochararray);
//    if(Arrays.equals(str1tochararray,str2tochararray)){System.out.println("Yes they are anagrams");}
//    else{System.out.println("They are not anagrams");}}
//else{System.out.println("Not anagrams");}}
//    public static void main(String[] args) {
//String str1="Heart";
//        String str2="Earth";
//        anagrams(str1,str2);}}

/*STRING BUILDER QUESTION*/
//public class Strings{
//    public static String reversearray(String str){
//        StringBuilder sb=new StringBuilder("");
//        for (int i = str.length()-1; i >=0 ; i--){
//            sb.append(str.charAt(i));}
//        return sb.toString();}
//    public static void main(String[] args) {
//        System.out.println(reversearray("Hello World"));}}
//public class Strings {
//    public static String dupli(String str) {
//        StringBuilder sb = new StringBuilder("");
//        for (int i = 0; i < str.length(); i++) {
//            boolean isDuplicate = false;
//            for (int j = i + 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        String str = "Geeks For Geeks";
//        System.out.println(dupli(str));}}

/*REMOVE DUPLICATES FROM STRING*/
//public class Strings {
//public static String toUppercase(String str){
//    StringBuilder sb=new StringBuilder("");
//char ch=Character.toUpperCase(str.charAt(0));
//sb.append(ch);
//    for (int i = 1; i <str.length() ; i++) {
//        if (str.charAt(i)==' '&&i<str.length()-1){
//            sb.append(str.charAt(i));
//            i++;
//            sb.append(Character.toUpperCase(str.charAt(i)));}
//    else{sb.append(str.charAt(i));}}
//    return sb.toString();}
//    public static void main(String[] args) {
//        System.out.println(toUppercase("hi, the teacher name is shraddha cobra"));}}























