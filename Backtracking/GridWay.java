package Backtracking;
//Time complexity = O(2^(n+m))   very bad (exponential)

public class GridWay {
    public static int gridWays(int i, int j, int n,int m){
        //Base case
        if(i == n-1 && j==m-1){ //condition for last cell
            return 1;
        }else if(i==n || j==n ){ //Boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;

    }
    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}

//o/p: 6
