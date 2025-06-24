<<<<<<< HEAD
package Arrays;

public class stocks {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}
=======
package Arrays;

public class stocks {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}
>>>>>>> 2ed70a9902f3bf953b20f82399c81d632496623a
