//////public class LinkedList {
//////    public static class Node{
//////        int data;Node next;
//////        public Node(int data){this.data=data;}}
//////    public static Node head;
//////    public static Node tail;
//////    public void addFirst(int data){
//////        Node newNode=new Node(data);
//////        newNode.next=head;
//////        head=newNode;}
//////    // Method to add a node at the end of the linked list
//////    void addLast(int data) {
//////        Node newNode = new Node(data);
//////        // If the linked list is empty, make the new node as the head
//////        if (head == null) {head = newNode;return;}
//////        // Traverse till the last node
//////        Node last = head;
//////        while (last.next != null) {
//////            last = last.next;}
//////        // Point the last node's next to the new node
//////        last.next = newNode;}
//////    public void printlist(){
//////        if (head==null){System.out.println("LL is empty");}
//////        Node temp=head;
//////        while(temp!=null){
//////            System.out.print(temp.data+"=>");
//////            temp=temp.next;}
//////        System.out.println("null");}
//////    public static void main(String[] args) {
//////     LinkedList ll=new LinkedList();
//////     ll.printlist();
//////     ll.addFirst(2);
//////        ll.printlist();
//////        ll.addFirst(1);
//////        ll.printlist();
//////     ll.addLast(3);
//////        ll.printlist();
//////        ll.addLast(4);
//////        ll.printlist();}}
////
////public class LinkedList{
////public static class Node{
////    int data;Node next;
////    public Node(int data){
////        this.data=data;
////        this.next=null;}}
////public static Node head;
////    public static Node tail;
////    public void addFirst(int data){
////        //create new node
////        Node newNode= new Node(data);
////        if(head==null){head=tail=newNode;return;}
////        //newnode.next=head
////        newNode.next=head;
////        //head=newnode
////        head=newNode;}
////    public void addLast(int data){
////        //create new node
////        Node newNode= new Node(data);
////        if(head==null){head=tail=newNode;return;}
////        //newnode.next=tail
////        tail.next=newNode;
////        //tail=newnode
////        tail=newNode;}
//////public void addLast(int data) {
//////    // create new node
//////    Node newNode = new Node(data);
//////    if (head == null) {
//////        head = tail = newNode;
//////        return;
//////    }
//////    // update next pointer of current tail node
//////    tail.next = newNode;
//////    // update tail to point to new node
//////    tail = newNode;
//////}
////
////    public void printlist(){
////        if (head==null){
////            System.out.println("ll is empty");return;}
////        Node temp=head;
////        while(temp!=null){
////            System.out.print(temp.data+"=>");
////            temp=temp.next;}
////            System.out.println("null");}
////    public static void main(String[] args) {
////        LinkedList ll=new LinkedList();
////        ll.printlist();
////        ll.addFirst(2);
////        ll.printlist();
////        ll.addFirst(1);
////        ll.printlist();
////        ll.addLast(3);
////        ll.printlist();
////        ll.addLast(4);
////        ll.printlist();}}
//
//public class LinkedList {
//    public static class Node{
//        int data;Node next;
//        public Node(int data){
//            this.data=data;this.next=null;}}
//        public static Node head;
//        public static Node tail;
//        public static int size=0;
//        public void addFirst(int data){
//            //create newnode
//            Node newNode=new Node(data);
//            if (head==null){head=tail=newNode;return;}
//            //newnode.next=head
//            newNode.next=head;
//            //head=newnode
//            head=newNode;
//        size++;}
//        public void addLast(int data){
//            Node newNode=new Node(data);
//            if (head==null){head=tail=newNode;return;}
//        tail.next=newNode;
//        tail=newNode;
//        size++;}
//    public void add(int idx,int data){
//            if (idx==0){addFirst(data);size=0;return;}
//            Node newNode=new Node(data);
//            Node temp=head;
//            int i=0;
//            size++;
//            while (i<idx-1){temp=temp.next;i++;}
//            newNode.next=temp.next;
//            temp.next=newNode;}
//public int removeFirst(){
//            if (size==0){
//                System.out.println("ll is empty");}
//            else if (size==1){
//                int val=head.data;
//                head=tail=null;size=0;return val;}
//            int val=head.data;head=head.next;size--;
//            return val;}
//public int removeLast(){
//            if (size==0){
//                System.out.println("ll is empty");}
//            else if (size==1){
//                int val=head.data;
//                head=tail=null;size=0;return val;}
//            //prev=i=size-2
//    Node prev=head;
//    for (int i = 0; i <size-1 ; i++) {prev=prev.next;}
//    int val=prev.next.data;
//    prev.next=null;
//    tail=prev;
//    size--;
//    return val;}
    /*Iteration se search*/
//public int itrSearch(int key){
//            Node temp=head;int i=0;
//            while (temp!=null){
//                if(temp.data==key){return i;}
//                temp=temp.next;i++;}
//            return -1;}
    /*Recursion se search*/
//public int helper(Node head,int key){
//            if(head==null){return -1;}
//            if (head.data==key){return 0;}
//            int idx=helper(head.next,key);
//            if (idx==-1){return -1;}
//            return idx+1;}
//public int recSearch(int key){
//            return helper(head,key);}
//
    /*Reverse LinkedList*/
////public void reverse(){
////    Node prev=null;
////    Node curr=tail=head;
////    Node next;
////    while(curr!=null){
////        next=curr.next;
////        curr.next=prev;
////        prev=curr;
////        curr=next;}
////    head=prev;}
//
    /*Reverse LinkedList*/
//    public void reverse(){
//        Node prev=null;
//        Node curr=tail=head;
//        Node next;
//        while (curr!=null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;}
//        head=prev;}
    /*isPallindrome*/
//public Node findMid(Node head){
//    Node slow=head;
//    Node fast=head;
//    while (fast!=null&&fast.next!=null){
//        slow=slow.next;
//        fast=fast.next.next;}
//    return slow;}
//
//public boolean checkPalindrome(){
//    //base case
//    if (head==null||head.next==null){return true;}
//    //step1=>Find mid
//    Node midNode=findMid(head);
//    //Step2=>reverse 2nd half
//    Node prev=null;
//    Node curr=midNode;
//    Node next;
//    while(curr!=null){
//        next=curr.next;
//        curr.next=prev;
//        prev=curr;
//        curr=next;}
//    Node right=prev;
//    Node left=head;
//    //Step3=>compare
//    while (right!=null){
//        if (left.data!=right.data){return false;}
//        left=left.next;right=right.next;}
//    return true;}
//
    /*Detect a cycle in a LinkedList*/
//    public static boolean isCycle(){
//        Node slow=head;Node fast=head;
//        while (fast!=null&&fast.next!=null){
//            slow=slow.next;fast=fast.next.next;
//        if (slow==fast){return true;}}
//        return false;}
//
//            public void printlist(){
//            Node temp=head;
//            while (temp!=null){
//                System.out.print(temp.data+"=>");
//                temp=temp.next;}
//            System.out.println("null");}
//    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
////        ll.addFirst(3);
////        ll.addFirst(2);
////        ll.addFirst(1);
////        ll.addFirst(1);
////        ll.addLast(4);
////        ll.addLast(5);
////        ll.addLast(6);
////        ll.removeFirst();
////        ll.removeLast();
//        head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=head;
////                ll.printlist();
////        ll.reverse();
////        ll.printlist();
//        System.out.println(isCycle());
////        System.out.println(ll.checkPalindrome());
////        System.out.println("The key is present at index "+ll.itrSearch(5));
////        System.out.println("The key is present at index "+ll.recSearch(4));
////        System.out.println("The size of the LinkedList is "+size);
//    }}

/*REMOVE CYCLE CODE*/
//import java.util.*;
//public class LinkedList {
//public static class Node{
//    int data;Node next;
//    public Node(int data){this.data=data;
//    this.next=null;}}
//    public static Node head;
//    public static Node tail;
//    public static void removecycle(){
//    //detect cycle
//        Node slow=head;Node fast=head;
//        boolean cycle=false;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if (fast==slow){cycle=true;break;}}
//        if (cycle==false){return;}
//    //find meeting point
//        slow=head;
//Node prev=null;
//while (slow!=fast){prev=fast;slow=slow.next;fast=fast.next;}
////remove cycle
//        prev.next=null;}
//    public void printlist(){
//        if (head==null){System.out.println("LL is empty");}
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+"=>");
//            temp=temp.next;}
//        System.out.println("null");}
//    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
//head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=new Node(4);
//        head.next.next.next.next=head.next;
//        removecycle();
//        System.out.println(ll);
//        ll.printlist();}}
/*Java collections framework*/
//import java.util.*;
//public class Linkedlist {
//    public static void main(String[] args) {
//        LinkedList <Integer> ll=new LinkedList<>();
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.addLast(6);
//        ll.addFirst(2);
//        ll.addFirst(1);
//        System.out.println(ll);}}