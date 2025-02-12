package com.problems;
/*
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

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {
  
  @Test
  public void shouldReturnAnswerWhenMaxAfterMin() {
	  BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
	  int[] prices = {7, 1, 5, 3, 6, 4};
	  int expected = 5;
	  int result = solution.maxProfit(prices);
	  assertEquals(expected, result);
  }

  @Test
  public void shouldReturnZeroWhenNoProfit() {
	BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
	int[] prices = {7, 6, 4, 3, 1};
	int expected = 0;
	int result = solution.maxProfit(prices);
	assertEquals(expected, result);
  }

  @Test
  public void shouldReturnNonZero() {
	BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
	int[] prices = {2, 4, 1};
	int expected = 2;
	int result = solution.maxProfit(prices);
	assertEquals(expected, result);
  }
}

