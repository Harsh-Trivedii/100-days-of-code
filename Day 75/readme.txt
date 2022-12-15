Question link: https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?page=2&category[]=Arrays&sortBy=submissions

Problem: Stock buy and sell

Question: The cost of stock on each day is given in an array A[] of size N.
Find all the segments of days on which you buy and sell the stock so that in between those days your profit is maximum.

Example:
Input:
N = 7
A[] = {100,180,260,310,40,535,695}
Output:
1
Explanation:
One possible solution is (0 3) (4 6)
We can buy stock on day 0,
and sell it on 3rd day, which will 
give us maximum profit. Now, we buy 
stock on day 4 and sell it on day 6.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
2 ≤ N ≤ 106
0 ≤ A[i] ≤ 106

Test Cases Passed: 
152 /152
