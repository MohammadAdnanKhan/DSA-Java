import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

//public class ArrList {
//    public static void main(String[] args) {
//        ArrayList <Integer> list= new ArrayList<>();
//        list.add(2);
//        list.add(4);
//        list.add(5);
//        list.add(9);
//        list.add(1);
//        list.add(6);
//int max=Integer.MIN_VALUE;
//        for (int i = 0; i <list.size()-1; i++) {
////            if(list.get(i)>max){
////                max= list.get(i);}
//            max=Math.max(max,list.get(i)); }
//        System.out.println(max);}}
//public class ArrList {
//    public static void main(String[] args) {
//        ArrayList <Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(5);
//        list1.add(9);
//        list1.add(3);
//        list1.add(6);
//        System.out.println(list1);
//        int temp= list1.get(1);
//list1.set(1, list1.get(3));
//list1.set(3,temp);
//        System.out.println(list1);
//    Collections.sort(list1);
//        System.out.println(list1);
//        Collections.sort(list1,Collections.reverseOrder());
//        System.out.println(list1);}}

/*My brute force code for pair sum 1*/
//public class ArrList {
//public static ArrayList<Integer> targetsum(ArrayList<Integer> list,int target){
//    ArrayList<Integer> sollist=new ArrayList<>();
//    for (int i = 0; i < list.size()-1; i++) {
//        for (int j = i+1; j <list.size() ; j++) {
//            if(list.get(i)+list.get(j)==target){sollist.add(list.get(i));sollist.add(list.get(j));return sollist;}}}
//    return sollist;}
//    public static void main(String[] args) {
//        ArrayList<Integer> givlist=new ArrayList<>();
//        givlist.add(1);givlist.add(2);givlist.add(3);givlist.add(4);givlist.add(5);givlist.add(6);
//        System.out.println(targetsum(givlist,5));}}

/*Multi dimensional ArrayList*/
//public class ArrList {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//        ArrayList<Integer> list1=new ArrayList<>();
//        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);list1.add(6);
//        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add(1);list2.add(2);list2.add(3);list2.add(4);list2.add(5);
//        mainlist.add(list1);
//        mainlist.add(list2);
//        System.out.println(mainlist);
//        for (int i = 0; i < mainlist.size(); i++) {
//            ArrayList<Integer> currlist=mainlist.get(i);
//            for (int j = 0; j < currlist.size(); j++) {
//                System.out.print(currlist.get(j)+" ");}
//            System.out.println();}}}

/*Optimized maximum water*/
//public class ArrList {
//public static int storewater(ArrayList<Integer> height){
//    int maxWater=0;
//    int lp=0;
//    int rp= height.size()-1;
//    while (lp<rp){
//        int ht=Math.min(height.get(lp), height.get(rp));
//        int width=rp-lp;
//        int currwater=ht*width;
//        maxWater=Math.max(currwater,maxWater);
//        if(height.get(lp)< height.get(rp)){lp++;}else {rp--;}}
//    return maxWater;}
//    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);list.add(8);list.add(6);list.add(2);list.add(5);list.add(4);list.add(8);list.add(1);list.add(7);
//        System.out.println(storewater(list));}}

/*Practice question set*/
//public class ArrList {
//public static boolean ismonotonic (ArrayList<Integer> list){
//    boolean inc=true;
//    boolean dec=true;
//    for (int i = 0; i <list.size()-1; i++) {
//        if(list.get(i)>list.get(i+1)){inc =false;}
//        if(list.get(i)<list.get(i+1)){dec=false;}}
//    return inc||dec;}
//    public static void main(String[] args) {
//ArrayList<Integer> list= new ArrayList<>();
//        list.add(2);list.add(9);list.add(4);list.add(5);list.add(6);list.add(7);
//        System.out.println(ismonotonic(list));}}

public class ArrList {
public static ArrayList<Integer> islonely(ArrayList<Integer> list){
    ArrayList<Integer> list1=new ArrayList<>();
    for (int i = 0; i <list.size(); i++) {
        boolean alone=true;
        boolean noadjacent=true;
        for (int j = 0; j < list.size(); j++) {
            if(i!=j){
            if(list.get(i)==list.get(j)){alone=false;}
        if(list.get(i)== list.get(j)-1||list.get(i)== list.get(j)+1){noadjacent=false;}}}
        if(alone&&noadjacent){list1.add(list.get(i));}}
    return list1;}
    public static void main(String[] args) {
        //10,6,5,8
        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);list.add(6);list.add(5);list.add(8);
        System.out.println(islonely(list));}}





































