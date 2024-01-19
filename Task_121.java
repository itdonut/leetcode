package org.example.tasks;

public class Task_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currentMin = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < currentMin)
                currentMin = price;

            if (price - currentMin > profit)
                profit = price - currentMin;
        }
        System.out.println(profit);
        return profit;
    }
}
