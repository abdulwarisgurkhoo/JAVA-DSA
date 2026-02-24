public class BuyAndSellStocks {
    public static int buystocks(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int totalprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                totalprofit = Math.max(totalprofit, profit);
            } else {
                buyprice = price[i];
            }

        }

        if (totalprofit <= 0) {
            return 0;
        } else {
            return totalprofit;
        }
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        int profit = buystocks(price);
        System.out.println("the maximum profit acheived is : " + profit);

    }
}