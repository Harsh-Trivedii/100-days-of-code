Question link: https://practice.geeksforgeeks.org/problems/triangle-shrinking-downwards0459/1

Problem:Triangle shrinking downwards

Question:Given a string of a constant length, print a triangle out of it. The triangle should start with the given string and keeps shrinking downwards 
by removing one character from the begining of the string. The spaces on the left side of the triangle should be replaced with dot character.

Example:

Input:
S = @io30 
Output:
 @io30
.io30
..o30
...30
....0 

Expected Time Complexity: O(|S|2)
Expected Auxiliary Space: O(|S|)

Constraints:
1 <= |S| <=100

Test Cases Passed: 
52 /52
