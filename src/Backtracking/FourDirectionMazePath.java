package Backtracking;

public class FourDirectionMazePath {
    public static void allPossibleWays(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er || sc>ec){
            return;
        }
        if(isVisited[sr][sc]){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;

        //go right
        allPossibleWays(sr, sc+1, er, ec, s+"R", isVisited);
        //go down
        allPossibleWays(sr+1, sc, er, ec, s+"D", isVisited);
        //go left
        allPossibleWays(sr, sc-1, er, ec, s+"L", isVisited);
        //go up
        allPossibleWays(sr-1, sc, er, ec, s+"U", isVisited);

        //backtracking
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        boolean[][] isVisited=new boolean[rows][columns];
        allPossibleWays(0,0,rows-1,columns-1,"",isVisited);
    }
}
