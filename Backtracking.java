/*SUBSETS OF STRING*/
//public class Backtracking {
//public static void subset(String str,String ans,int i){
//    //base case
//    if(i==str.length()){
//        System.out.print(ans+"_");
//    return;}
//    //recursion
//    subset(str,ans+str.charAt(i),i+1);
//    //backtracking
//    subset(str,ans,i+1);}
//    public static void main(String[] args) {
//    subset("abc","",0);}}

/*PERMUTATIONS OF STRING*/
//public class Backtracking {
//    public static void permutations(String str,String ans){
//        //base
//        if(str.length()==0){
//            System.out.println(ans);
//            return;}
//        //recursion
//        for (int i = 0; i <str.length(); i++) {
//            char curr=str.charAt(i);
//            String newstr=str.substring(0,i)+str.substring(i+1,str.length());
//            permutations(newstr,ans+curr);}}
//    public static void main(String[] args) {
//        permutations("abc","");}}

/*N-QUEENS*/
//public class Backtracking {
//    public static void printboard(char [][] board){
//        System.out.println("-----------------------");
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                System.out.print(board[i][j]+" ");}
//            System.out.println();}}
//public static void nqueens(char [][] board,int row){
//    //base
//    if(row==board.length){
//        printboard(board);
//        return;}
//    //recursion
//    for (int j = 0; j <board.length; j++) {
//    if(isSafe(board,row,j)){
//        board[row][j]='Q';
//        nqueens(board,row+1);
//    board[row][j]='X';}}}
//    public static boolean isSafe(char[][] board,int row, int col){
//        for (int i =row-1; i>=0 ; i--) {
//            if (board[i][col]=='Q'){return false;}}
//        for (int i = row-1,j=col-1; i>=0&&j>=0; i--,j--) {
//                if (board[i][j]=='Q'){return false;}}
//        for (int i =row-1,j=col+1; i>=0&&j<board.length ; i--,j++) {
//            if (board[i][j]=='Q'){return false;} }
//        return true;}
//    public static void main(String[] args) {
//        int n=4;
//        char [][] board= new char[n][n];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length ; j++) {
//                board[i][j]='X';}}
//nqueens(board,0);}}

/*SUDOKU SOLVER*/
//public class Backtracking {
//public static boolean sudokusolver(int [][]sudoku,int row,int col){
//    if(row==9&&col==0){return true;}
//    int nextRow=row,nextcol=col+1;
//    if (col==9){nextRow=row+1;
//    nextcol=0;}
//    if (sudoku[row][col]!=0){return sudokusolver(sudoku,nextRow,nextcol);}
//    for (int digit =1; digit <=9 ; digit++) {
//        if(isSafe(sudoku,row,col,digit)){sudoku[row][col]=digit;
//        if (sudokusolver(sudoku,nextRow,nextcol)){return true;}
//        sudoku[row][col]=0;}}
//    return false;}
//public static boolean isSafe(int [][] sudoku,int row,int col,int digit){
//    for (int i = 0; i <=8; i++) {
//        if (sudoku[i][col]==digit){return false;}}
//    for (int i = 0; i <=8; i++) {
//        if (sudoku[row][i]==digit){return false;}}
//    int sr=(row/3)*3,sc=(col/3)*3;
//    for (int i =sr; i <sr+3; i++) {
//        for (int j =sc; j <sc+3; j++) {
//            if (sudoku[i][j]==digit){return false;}}}
//    return true;}
//    public static void printsudoku(int[][] sudoku){
//        for (int i = 0; i <9; i++) {
//            for (int j = 0; j <9; j++) {
//                System.out.print(sudoku[i][j]+" ");}
//            System.out.println();}}
//    public static void main(String[] args) {
//int [][] sudoku={{0,0,8,0,0,0,0,0,0},
//        {4,9,0,1,5,7,0,0,2},
//        {0,0,3,0,0,4,1,9,0},
//        {1,8,5,0,6,0,0,2,0},
//        {0,0,0,0,2,0,0,6,0},
//        {9,6,0,4,0,5,3,0,0},
//        {0,3,0,0,7,2,0,0,4},
//        {0,4,9,0,3,0,0,5,7},
//        {8,2,7,0,0,9,0,1,3}};
//if (sudokusolver(sudoku,0,0)){printsudoku(sudoku);}
//else{System.out.println("No solution exists");}}}

/*n queens*/
public class Backtracking {
    public static void printboard(char [][] board){
        System.out.println("--------\n--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");}
            System.out.println();}}
    public static boolean isSafe(char [][]board,int row,int col){
        for (int i = row-1; i>=0 ; i--) {
            if(board[i][col]=='Q'){return false;}}
        for (int i = row-1,j=col-1; i>=0&&j>=0 ; i--,j--) {
            if(board[i][j]=='Q'){return false;}}
        for (int i = row-1,j=col+1; i>=0&&j<=board.length-1 ; i--,j++) {
            if(board[i][j]=='Q'){return false;}}
        return true;}
public static void nQueens(char [][] board,int row){
    if (row==board.length){printboard(board);return;}
    for (int j = 0; j <board.length ; j++){
    if (isSafe(board,row,j)){
        board[row][j]='Q';
        nQueens(board,row+1);
        board[row][j]='X';}}}
    public static void main(String[] args) {
        int n=5;
        char [][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';}}
    nQueens(board,0);}}



















