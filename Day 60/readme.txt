Question Link:https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1
Problem: Minimize the sum of product
Question: You are given two arrays, A and B, of equal size N. 
The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.

Example :
Input:
N = 3 
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23 
Explanation:
1*6+1*5+3*4 = 6+5+12
= 23 is the minimum sum

Expected Time Complexity: O(N. log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106

Test Cases Passed: 
150 /150
