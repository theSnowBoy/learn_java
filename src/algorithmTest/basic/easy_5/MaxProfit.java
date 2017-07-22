package algorithmTest.basic.easy_5;

public class MaxProfit {
	//Ì°ÐÄËã·¨
	public static int maxProfit(int[] prices) {
		if(prices.length < 2) return 0;
		int profit =0;
		boolean hasStock = false;
		int prePrice = 0;
		if(prices[0] < prices[1]) {
			hasStock = true;
			prePrice = prices[0];
		}
		
		for(int i = 1;i < prices.length-1;i++){
			if(!hasStock && prices[i] <= prices[i-1] && prices[i] <= prices[i+1]){
				hasStock = true;
				prePrice = prices[i];
			}else if(hasStock && prices[i] >= prices[i-1] && prices[i] >= prices[i+1]){
				profit += (prices[i]-prePrice);
				hasStock = false;
			}
		}
		if(hasStock && prePrice <prices[prices.length-1]) {
		    profit += prices[prices.length-1] - prePrice;
		}
		
	return profit;	
	}
	
	public static void main(String[] args) {
		int[] data = {2,1,4} ;
		maxProfit(data);
	}
}
