import java.util.*;
/*QUEUE USING LINKEDLIST*/
//public class Queuess {
//    static class Node{
//        int data;Node next;
//        Node(int data){this.data=data;next=null;}}
//static class Queue{
//        static Node head=null;static Node tail=null;
//        public static boolean isEmpty(){return head==null &&tail==null;}
//    //add
//    public static void add(int data){
//            Node newNode=new Node(data);
//            if (head==null){head=tail=newNode;return;}
//            tail.next=newNode;tail=newNode;}
//        //remove
//    public static int remove(){
//            if (isEmpty()){
//                System.out.println("Empty queue");return -1;}
//int front=head.data;
//            if (tail==head){tail=head=null;}else{head=head.next;}
//        return front;}
////peek
//    public static int peek(){
//            if (isEmpty()){ System.out.println("Empty queue");return -1;}
//            return head.data;}}
//    public static void main(String[] args) {
//        Queue q=new Queue();
//        q.add(1);q.add(2);q.add(3);
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();}}}
/*FIRST NON REPEATING CHARACTER*/
//public class Queuess {
//public static void printNonRepeating(String str){
//    int []freq=new int[26];
//    Queue<Character> q=new LinkedList<>();
//    for (int i = 0; i <str.length(); i++) {
//        char ch=str.charAt(i);q.add(ch);
//freq[ch-'a']++;
//while (!q.isEmpty()&&freq[q.peek()-'a']>1){q.remove();}
//if (q.isEmpty()){
//    System.out.print(-1+" ");}
//else {System.out.print(q.peek()+" ");}}
//    System.out.println();}
//    public static void main(String[] args) {
//String str="aabccxb";
//printNonRepeating(str);}}
/*INTERLEAVE 2 HALVES OF A QUEUE*/
//public class Queuess {
//public static void interleave(String str) {
//Queue<Character>q1=new LinkedList<>();
//    Queue<Character>q2=new LinkedList<>();
//    for (int i = 0; i < str.length()/2; i++) {
//        char ch=str.charAt(i);
//        q1.add(ch);}
//    for (int i = (str.length()/2); i < str.length(); i++) {
//        char ch=str.charAt(i);
//        q2.add(ch);}
//    int x=0;
//    while(!q1.isEmpty()&&!q2.isEmpty()){
//        if(x%2==0){
//            System.out.print(q1.peek()+" ");q1.remove();x++;}
//        if(x%2==1){
//            System.out.print(q2.peek()+" ");q2.remove();x++;}}
//    System.out.println();}
//public static void main(String[] args) {
//        String str="12345678";
//        interleave(str);}}
/*QUEUE REVERSAL*/
//public class Queuess {
//public static void queueReversal(Queue<Character>q){
//    Stack<Character>s=new Stack<>();
//    while (!q.isEmpty()){
//        s.push(q.remove());}
//    while (!s.isEmpty()){q.add(s.pop());}
//while (!q.isEmpty()){
//    System.out.println(q.remove());}}
//    public static void main(String[] args) {
//        Queue<Character>q=new LinkedList<>();
//        q.add('1');q.add('2');q.add('3');
//        queueReversal(q);}}