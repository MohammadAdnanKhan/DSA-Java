import java.util.Scanner;
public class binarysearch {
    public static int binarysearch(int array[],int asize, int key){
        int l,r,mid;
        l=0;
        r=asize-1;
        mid=(l+r)/2;
        while(l<=r){
            if (key == array[mid]) {
            return mid;}
            else if (key>array[mid]) {
                l=mid+1;}
            else{
                r=mid-1;}
        mid=(l+r)/2;
        }
        return -1;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] myarray={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            System.out.print(myarray[i]+" ");}
        System.out.print("\nEnter the number you want to search:");
        int key=sc.nextInt();
        int index=binarysearch(myarray,10,key);
if(index!=-1){
    System.out.println("\nThe number is present at index "+index);
}
else{
    System.out.println("\nKey not found!");
}
    }
}
