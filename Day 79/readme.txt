Question link: https://practice.geeksforgeeks.org/problems/rotate-bits4524/1

Problem: Rotate Bits

Question: Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and print the results in decimal values after each of the rotation.

Example:
Input: 
N = 29, D = 2
Output: 
116
16391
Explanation: 29 in Binary is:
000...011101
Rotating left by 2 positions, it becomes
00...1110100 = 116 (in decimal).
Rotating right by 2 positions, it becomes
010...000111 = 16391 (in decimal).

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <  216
1 <= D <= 105

Test Cases Passed: 
120 /120
