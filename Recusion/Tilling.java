package Recursion;  // #Amazon
//Given  a "2 x n" board and tiles of size "2 x 1",
//count the number of ways to tiles given board using
//the 2 x 1 tiles.
//(A tile can either be placed horizontally or vertically.)

public class Tilling {
    public static int tilingProblem(int n){ //2 x n (floor size)
        //base case 
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(tilingProblem(n));
    }
}
