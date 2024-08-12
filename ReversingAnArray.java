public class ReversingAnArray {
    public static void main(String[] args) {
int [] array={1,2,3,4,5,6,7};
int l= array.length;
int n =l/2;      //you could also use Math.floorDiv(l,2)
int temp;
        for (int element:array){
            System.out.print(element+" ");
        }
        System.out.println("\n");
        for (int i = 0; i <n; i++) {
            temp=array[i];array[i]=array[l-i-1];array[l-i-1]=temp;
        }
        for (int element:array){
            System.out.print(element+" ");
        }
    }
}
