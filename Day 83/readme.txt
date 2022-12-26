Question link: https://practice.geeksforgeeks.org/problems/wine-buying-and-selling/1

Problem: Wine Buying and Selling

Question: Given an array, Arr[] of size N represents N house built along a straight line with equal distance between adjacent houses. Each house has a certain number of wine and they want to buy/sell those wines to other houses. Transporting one bottle of wine from one house to an adjacent house results in one unit of work. The task is to find the minimum number of work is required to fulfill all the demands of those N houses.

if arr[i] < 0, then ith house wants to sell arr[i] number of a wine bottle to other houses.
if arr[i] > 0, then ith house wants to buy arr[i] number of a wine bottle from other houses.

Example: 
Input: N = 5,
Arr[] = {5, -4, 1, -3, 1}
Output: 9
Explanation: 
1th house can sell 4 wine bottles to 0th house,
total work needed 4*(1-0) = 4, new arr[] = 1,0,1,-3,1
now 3rd house can sell wine to 0th, 2th and 4th.
so total work needed = 1*(3-0)+1*(3-2)+1*(4-3) = 5
So total work will be 4+5 = 9

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ N ≤ 10^5
-10^6 ≤ Arr[i] ≤ 10^6

Test Cases Passed: 
206 /206
