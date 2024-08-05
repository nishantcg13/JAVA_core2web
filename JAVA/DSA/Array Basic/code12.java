/*
 * 
 * 12] First and last occurrences of X
Given a sorted array having N elements, find the indices of the first and last
occurrences of an element X in the given array.
Note: If the number X is not found in the array, return '-1' as an array.
Example 1:
Input:
N = 4 , X = 3
arr[] = { 1, 3, 3, 4 }
Output:
1 2
Explanation:
For the above array, first occurance of X = 3 is at index = 1 and last
occurrence is at index = 2.

Example 2:
Input:
N = 4, X = 5
arr[] = { 1, 2, 3, 4 }
Output:
-1
Explanation:
As 5 is not present in the array, so the answer is -1.
Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 10^5

0 <= arr[i], X <= 10^9
 */

import java.util.*;
class occ{
    static void occur(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the number to be Searched");
        int num = sc.nextInt();
        int k = 0;
        int m = 0;
        int flag = 0;
        for(int i=0;i<size;i++){
            if(arr[i] == num){
                if(flag==0){
                    k = i;
                    flag = 1;
                }
                m=i;
            }
            
        }
        if(k!=m){
            System.out.print(k+" ");  
            System.out.println(m);
        }
        else{
            System.out.println("-1");
        }
          
        
    }
    
    public static void main(String[] args){
        occur();
    }
}