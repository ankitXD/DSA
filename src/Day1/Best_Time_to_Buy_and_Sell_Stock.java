package Day1;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
	}

}
