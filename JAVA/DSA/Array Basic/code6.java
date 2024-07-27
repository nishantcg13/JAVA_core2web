/*
6] Elements in the Range

Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
 */
import java.util.*;
 class range{
    static void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the startting range and ending range: ");
        int start =sc.nextInt();
        int end = sc.nextInt();
        for(int i=0;i<size;i++){
            if(start<=arr[i] && end>=arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        numbers();
    }
 }