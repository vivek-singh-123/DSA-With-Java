package Backtracking;

public class RatMazePath {
    public static int maze(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec){
            return 0;
        }
        if(sr == er && sc == ec){
            return 1;
        }
        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);
        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int row=3;
        int column=3;

        int totalWays = maze(0,0,row-1,column-1);
        System.out.println(totalWays);
    }
}
