//public class staircasesearch {
//public static boolean staircasesearch(int[][] array,int key){
//    int row=0;int col=array[0].length-1;
//    while (row < array.length && col >= 0) {
//        if(array[row][col]==key){
//            System.out.println("Key found at "+row+","+col);return true;}
//        else if(key<array[row][col]){
//            col--;
//        }
//        else if (key>array[row][col]){row++;
//    }
//    }
//    System.out.println("Key not found");
//    return false;}
//
//    public static void main(String[] args) {
//        int [][]matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//        staircasesearch(matrix,30);
//
//
//}
//}

/*STAIRCASE SEARCH*/
public class staircasesearch {
    public static boolean staircasesearch(int[][] array, int key) {
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == key) {
                System.out.println("Key found at " + row + "," + col);
                return true;
            } else if (key > array[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Key not found");
return false;
}
    public static void main(String[] args) {
        int [] [] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        staircasesearch(matrix,3);
    }
}

























