//import java.net.PasswordAuthentication;
//public class OOPS {
//    public static void main(String[] args) {
//        Pen p1=new Pen();
//        p1.setColor("Blue");
//        System.out.println(p1.getcolor());
//        p1.setTip(5);
//        System.out.println(p1.getTip());
//    }
//
//    static class Pen{
//        private String color;
//        private int tip;
//        String getcolor(){
//            return this.color;}
//        int getTip(){return this.tip;}
//        void setColor(String newcolor){this.color=newcolor;}
//        void setTip(int tip){this.tip=tip;}
//    }
//}
//public class OOPS {
//    public static void main(String[] args) {
//        Pen p1=new Pen();
//        p1.setcolor("blue");
//        System.out.println(p1.getcolor());
//        p1.setcost(15);
//        System.out.println(p1.getcost());
//        p1.setpassword("cdef");
//        System.out.println(p1.getpassword());
//    }
//
//
//}
//class Pen{
//    String color="yellow";
//    int cost=90;
//    private String password="abcd";
//    void setpassword(String newpassword){
//        this.password=newpassword;}
//
//    String getpassword(){
//        return this.password;}
//    void setcolor(String newcolor){
//        this.color=newcolor;}
//    void setcost(int newcost){
//        this.cost=newcost;}
//    String getcolor(){
//        return this.color;}
//    int getcost(){
//        return this.cost;}}

/*ABSTRACTION CONSTRUCTOR SEQUENCE*/
//public class OOPS {
//    public static void main(String[] args) {
//        OOPS oops = new OOPS();
//        Mustang myhorse = oops.new Mustang();
//
//    }
//    abstract class Animal{
//        Animal(){
//            System.out.println("Animal constructor called");}}
//    class Horse extends Animal{
//        Horse(){
//            System.out.println("Horse constructor called");}}
//    class Mustang extends Horse{
//        Mustang(){
//            System.out.println("Mustang constructor called");}}}

/*MULTIPLE INHERITANCE*/
public class OOPS {
    public static void main(String[] args) {
        Bear b=new Bear();
b.eatsveg();
b.eatsnonveg();}}
interface Herbivore{
       public void eatsveg();}
interface Carnivore{
      public  void eatsnonveg();}
 class Bear implements Herbivore,Carnivore{
        public void eatsveg(){
            System.out.println("Eats grass and vegetables");}
    public void eatsnonveg(){
        System.out.println("Eats fish and meat");}}