import java.util.*;
import java.util.LinkedList;
/*BASIC IMPLEMENTATION*/
//public class Stacks {
//    static class Node{
//        int data;Node next;
//        Node(int data){this.data=data;this.next=null;}}
//    static class Stack{
//        static Node head=null;
//        public static boolean isEmpty(){return head==null;}
//        //push
//        public static void push(int data){
//            Node newNode=new Node(data);
//            if (isEmpty()){head=newNode;return;}
//newNode.next=head;head=newNode;}
//        //pop
//        public static int pop(){
//            if (isEmpty()){return -1;}
//            int top=head.data;head=head.next;
//            return top;}
//        //peek
//        public static int peek(){
//            if (isEmpty()){return -1;}
//            return head.data;}}
//    public static void main(String[] args) {
//        Stack s=new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        while (!s.isEmpty()){
//        System.out.println(s.peek());s.pop();}}}
/*Push At Bottom*/
//public class Stacks {
//public static void pushAtBottom(Stack<Integer>s,int data){
//    if (s.isEmpty()){s.push(data);return;}
//    int top=s.pop();
//    pushAtBottom(s,data);
//    s.push(top);}
//    public static void main(String[] args) {
//        Stack<Integer>s =new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        pushAtBottom(s,4);
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();}}}
/*REVERSE STRING USING STACKS*/
//public class Stacks {
//public static String reversestring(String str){
//    Stack<Character>s=new Stack<>();
//    int idx=0;
//    while (idx<str.length()){
//        s.push(str.charAt(idx));idx++;}
//    StringBuilder result=new StringBuilder();
//    while (!s.isEmpty()){
//        char curr=s.pop();
//        result.append(curr);}
//    return result.toString();}
//    public static void main(String[] args) {
//    System.out.println(reversestring("ADNAN"));}}
/*GREATER ELEMENT ON RIGHT*/
//public class Stacks {
//    public static void main(String[] args) {
//        int [] arr={6,8,0,1,3};
//Stack<Integer>s=new Stack<>();
//int []nxtGreater=new int [arr.length];
//        for (int i = arr.length-1; i >=0; i--) {
//            //while
//            while (!s.isEmpty()&&arr[s.peek()]<=arr[i]){s.pop();}
//            //if else
//            if (s.isEmpty()){nxtGreater[i]=-1;}
//            else {nxtGreater[i]=arr[s.peek()];}
//          //push
//          s.push(i);}
//        for (int i = 0; i < nxtGreater.length; i++) {
//            System.out.print(nxtGreater[i]+" ");}
//        System.out.println();}}
/*VALID PARENTHESES*/
//public class Stacks {
//public static boolean isValid(String str){
//    Stack <Character> s=new Stack<>();
//    for (int i = 0; i < str.length(); i++) {
//       char ch=str.charAt(i);
//        if (ch=='('||ch=='{'||ch=='['){s.push(ch);}
//        else {if(s.isEmpty()) {return false;}
//        if ((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){s.pop();}
//        else {return false;}}}
//    if (s.isEmpty()){return true;}
//    else {return false;}}
//    public static void main(String[] args) {
//        System.out.println(isValid("(([]{})"));}}
/*SMALLER ELEMENT ON LEFT*/
//just see to change the conditions in next greater on right wale me
//public class Stacks {
//public static void nxtGreater(int []arr){
//    Stack<Integer>s=new Stack<>();
//    int[]nxtGreater=new int [arr.length];
//    for (int i = 0; i <arr.length ; i++) {
//        while (!s.isEmpty()&&arr[s.peek()]>=arr[i]){s.pop();}
//        if(s.isEmpty()){nxtGreater[i]=-1;}
//        else{nxtGreater[i]=arr[s.peek()];}
//        s.push(i);}
//    for (int i = 0; i < nxtGreater.length; i++) {
//        System.out.print(nxtGreater[i]+" ");}
//    System.out.println();}
//    public static void main(String[] args) {
//        int []arr={6,5,2,8,2,9,4,1};
//        nxtGreater(arr);}}
/*IS LINKED LIST A PALINDROME*/
//public class Stacks {
//
//    static class Node{
//        char data;Node next;
//        Node(char data){this.data=data;
//        this.next=null;}}
//   public static Node head;
//    public static Node tail;
//public static boolean isPalindrome(LinkedList<Character>ll,Node head){
//    Stack<Character>s=new Stack<>();
//    int count=0;
//if (ll.isEmpty()){return true;}
//    Node slow=head;
//    Node fast=head;
//    Node num=head;
//while (num!=null){num=num.next;count++;}
//while (fast!=null&&fast.next!=null){fast=fast.next.next;slow=slow.next;s.push(slow.data);}
//    if (count%2!=0){s.pop();}
//    while(slow!=null&&slow.next!=null){
//    if (slow.data==s.peek()){s.pop();}
//else{return false;}
//        slow=slow.next;}
//    if(s.isEmpty()){return true;}
//    else{return false;}}
//public static void main(String[] args) {
//        LinkedList<Character>ll=new LinkedList<>();
//    ll.addFirst('p');
//    ll.addFirst('B');
//    ll.addFirst('C');
//    ll.addFirst('B');
//    ll.addFirst('A');
//    if (isPalindrome(ll,head)){
//        System.out.println(true);}
//else{System.out.println(false);}}}