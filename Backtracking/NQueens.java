package Backtracking;
//Time complexity = o(n!)

public class NQueens {
    public static boolean isSafe(char board[][],int row, int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]== 'Q'){
                return false;
            }
        }
        //Diagonal left
         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]== 'Q'){
                return false;
            }
        }
        //Diagonal right
         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]== 'Q'){
                return false;
            }
        }
        return true;

    }
    // static int count =0;
    public static void nQueen(char board[][] , int row){
        //base case
        if(row == board.length){
            printBoard(board);
            // count++;
            return;
        }
        //column
         for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board, row+1); //function call
                board[row][j] = 'X'; //Backtraking
            }
         }
    }
    public static void printBoard(char board[][]){
        System.out.println("-------------Chess board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print( board[i][j] + " ");
               
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
        // System.out.println("Total ways to solve n queens ="+count);
    }
}
/*o/p:
 -------------Chess board---------
X Q X X 
X X X Q
Q X X X
X X Q X
-------------Chess board---------
X X Q X
Q X X X 
X X X Q
X Q X X
 */









//  //if solution exist or not if exist then print 1 solution
//  public class NQueens {
//     public static boolean isSafe(char board[][],int row, int col){
//         //vertical
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]== 'Q'){
//                 return false;
//             }
//         }
//         //Diagonal left
//          for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(board[i][j]== 'Q'){
//                 return false;
//             }
//         }
//         //Diagonal right
//          for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if(board[i][j]== 'Q'){
//                 return false;
//             }
//         }
//         return true;

//     }
//     // static int count =0;
//     public static boolean nQueen(char board[][] , int row){
//         //base case
//         if(row == board.length){
//             // printBoard(board);
//             // count++;
//             return true;
//         }
//         //column
//          for(int j=0;j<board.length;j++){
//             if(isSafe(board,row,j)){
//                 board[row][j] = 'Q';
//                 if(nQueen(board, row+1)){
//                     return true;
//                 } //function call
//                 board[row][j] = 'X'; //Backtraking
//             }
//          }
//          return false;
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("-------------Chess board---------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print( board[i][j] + " ");
               
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j] = 'X';
//             }
//         }
//         if(nQueen(board,0)){
//             System.out.println("Solution is possible");
//              printBoard(board);
//         }
//         else{
//             System.out.println("Solution is not possible");
//         }


//         // System.out.println("Total ways to solve n queens ="+count);
//     }
// }
 
