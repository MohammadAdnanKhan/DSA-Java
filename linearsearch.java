public class linearsearch {
    public static int linearsearch(int array[],int asize, int key){
        for (int i = 0; i <asize; i++) {
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }
    //we could also take input from user.............
    public static void main(String[] args) {
        int key=12;
        int []array={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i <9; i++) {
            System.out.print(array[i]+" ");
        }
       int index= linearsearch(array,9, key);
        if (index==-1){
            System.out.println("\nKey not found!!!");
        }
        else{
        System.out.println("\nThe key "+key+" is found at index "+index);}
    }
}
