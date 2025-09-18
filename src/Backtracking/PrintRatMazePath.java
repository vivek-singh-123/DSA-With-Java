package Backtracking;

public class PrintRatMazePath {
    public static void printPath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        //go right
        printPath(sr, sc+1, er, ec, s+"R");
        //go down
        printPath(sr+1, sc, er, ec, s+"D");
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        printPath(1,1,rows,columns,"");
    }
}
