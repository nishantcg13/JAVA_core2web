/*
7] Form largest number from digits

Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
of the array such that after combining all the elements of the array, the number
formed is maximum.
Example 1:
Input:
N = 5
A[] = {9, 0, 1, 3, 0}
Output:
93100
Explanation:
Largest number is 93100 which can be formed from array digits.
Example 2:
Input:
N = 3
A[] = {1, 2, 3}
Output:
321

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 10^7
0 <= Ai <= 9
 */
import java.util.*;
class bignum{
    static void max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        max();
    }
}