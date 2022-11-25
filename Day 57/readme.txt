Question : Write a program to implement Bucket Sort using Linked list.

Explanation: Bucket Sort is a sorting algorithm that divides the unsorted array elements into several groups called buckets.
Each bucket is then sorted by using any of the suitable sorting algorithms or recursively applying the same bucket algorithm.

Sample Input:
Enter your n:5

Enter array elements:50
48
60
42
12

Sample Output:
Initial array: 50 48 60 42 12
-------------
Bucket[0]:
Bucket[1]: 12
Bucket[2]:
Bucket[3]:
Bucket[4]: 42 48
Bucket[5]: 50
Bucket[6]: 60
Bucket[7]:
-------------
Bucktets after sorting
Bucket[0]:
Bucket[1]: 12
Bucket[2]:
Bucket[3]:
Bucket[4]: 42 48
Bucket[5]: 50
Bucket[6]: 60
Bucket[7]:
-------------
Sorted array: 12 42 48 50 60


Time Complexity	 
Best	O(n+k)
Worst	O(n2)
Average	O(n)
Space Complexity	O(n+k)
Stability	Yes
