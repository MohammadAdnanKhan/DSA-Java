//import java.util.*;
//public class stocks_arrays {
//public static void buysellstocks(int [] prices){
//    int buyprice=Integer.MAX_VALUE;
//    int maxprofit=0;
//    for (int i = 0; i < prices.length; i++) {
//        if(buyprice<prices[i]){
//            int profit=prices[i]-buyprice;
//            maxprofit=Math.max(maxprofit,profit);}
//        else{
//            buyprice=prices[i];}}
//    System.out.println(maxprofit);}
//
//    public static void main(String[] args) {
//        int [] prices={7,1,5,3,6,4};
//        buysellstocks(prices);
//    }}


//import java.util.*;
//public class stocks_arrays {
//    public static void buysellstocks(int [] prices){
//        int buyprice=Integer.MAX_VALUE;
//        int maxprofit=0;
//        for (int i = 0; i <prices.length; i++) {
//            if (buyprice<prices[i]){
//                int profit=prices[i]-buyprice;
//                maxprofit=Math.max(profit,maxprofit);}
//            else{
//                buyprice=prices[i];}
//        }
//        System.out.println(maxprofit);}
//
//    public static void main(String[] args) {
//        int [] prices={6,5,4,3,9,1};
//    buysellstocks(prices);}}