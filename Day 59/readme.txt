Question link: https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
Problem: Leaders in an array
Question:Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example:
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 107
0 <= Ai <= 107

Test Cases Passed: 
410 /410
