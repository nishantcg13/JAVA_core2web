/*
 * 3] Largest Element in Array
Given an array Al] of size n. The task is to find the largest element in it.
Example 1:
Input:
n=5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation:
The largest element ofa given array is 90.
Example 2:
Input:
n=7
Output: 5
Explanation:
The largest element of a given array is 5.
Expected Time Complexity: O(N)
Expected Auxiliary Space: 0(1)
Constraints:
1<=n<=10^3
O <= A[i] <= 10^3
Arrays may contain duplicate elements.

*/


import java.util.*;
class max{
    static void maximum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is "+ max);
    }
    public static void main(String[] args){
        maximum();
    }
}

