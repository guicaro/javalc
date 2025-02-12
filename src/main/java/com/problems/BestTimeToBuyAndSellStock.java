package com.problems;

/*
Problem Statement:

You are given an array prices where prices[i] is the price of a given stock on day i. You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell that stock.

Constraints:

    You can only make one transaction (buy once and sell once).
    You can't sell before you buy.

Return: The maximum profit you can achieve. If no profit is possible, return 0.

Examples:
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: 
Buy at 1 (day 2) and sell at 6 (day 5), profit = 6 - 1 = 5.

Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: 
No profit can be made as prices are in decreasing order.
 */

 public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
 }