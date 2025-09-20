package Backtracking;

public class MaxKnightsInNxNBoard {
    static int maxKnights = -1;  //global variable
    static int number;  // maximum knights possible in n x n
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        //2 up & 1 right
        int i=row-2;
        int j=col+1;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        //2 up & 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        //2 down & 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j] == 'K') return false;
        //2 down & 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j] == 'K') return false;

        //2 right & 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        //2 right & 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j] == 'K') return false;
        //2 left & 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        //2 left & 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j] == 'K') return false;

        return true;
    }
    public static void kNight(char[][] board, int row, int col, int num){
        int n = board.length;
        //base case
        if(row == n){
           if(num == number){
               for(int i=0; i<n; i++){
                   for(int j=0; j<n; j++){
                       System.out.print(board[i][j]);
                   }
                   System.out.println();
               }
               System.out.println();
           }

            maxKnights = Math.max(maxKnights,num);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col != n-1) kNight(board, row, col+1, num+1);
            else kNight(board, row+1, 0, num+1);
            board[row][col] = 'x';  //backtracking
        }

        if(col != n-1) kNight(board, row, col+1, num);
        else kNight(board, row+1, 0, num);
    }
    public static void main(String[] args) {
        int n=4;   //4×4 board par max 8 knights rakhe jaa sakte hain aur unke 6(ways) distinct arrangements ho skta hai
        char[][] board=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }

        number = (n * n + 1) / 2;  // maximum knights possible in n x n

        kNight(board,0,0,0);
        System.out.println(maxKnights);
    }
}
