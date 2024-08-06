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

// import java.util.*;
// class occ{
//     static void occur(){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the size of the array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         System.out.println("Enter the array elements: ");
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         System.out.println("Enter the number to be Searched");
//         int num = sc.nextInt();
//         int k = 0;
//         int m = 0;
//         int flag = 0;
//         for(int i=0;i<size;i++){
//             if(arr[i] == num){
//                 if(flag==0){
//                     k = i;
//                     flag = 1;
//                 }
//                 m=i;
//             }
            
//         }
//         if(k!=m){
//             System.out.print(k+" ");  
//             System.out.println(m);
//         }
//         else{
//             System.out.println("-1");
//         }
          
        
//     }
    
//     public static void main(String[] args){
//         occur();
//     }
// }

import java.util.*;

import javax.annotation.processing.SupportedOptions;

class occ{
    static int firstoccur(int num,int arr[], int size){
        int high = size-1;
        int low =0;
        int mid = 0, firstoccurence =-1;
            
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == num){
                firstoccurence = mid;
                high = mid-1;
            }
            else if(arr[mid] < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return firstoccurence;
    }

    static int lastoccur(int num,int arr[], int size){
        int high = size-1;
        int low = 0;
        int lastoccurence = -1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]  == num){
                lastoccurence = mid;
                low = mid+1;
            }
            else if(arr[mid] < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return lastoccurence;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        int FO = firstoccur(num, arr, size);
        int LO = lastoccur(num, arr, size);
        
        System.out.println("First occurence is " + FO);
        System.out.println("Last occurence is " + LO);

    }
}