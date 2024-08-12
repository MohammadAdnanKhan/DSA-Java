public class sumof2matrices {
    public static void main(String[] args) {
        System.out.println("This is a JAVA program to compute the sum of two matrices");
        int [][]matrix1={{1,2,3},{4,5,6}};
        int [][] matrix2={{7,8,9},{10,11,12}};
        int[][] result={{0,0,0},{0,0,0}};
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=matrix1[i][j]+matrix2[i][j];}}
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result[i][j]+" ");}
            System.out.println(" ");}}}
