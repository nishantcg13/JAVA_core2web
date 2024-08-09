/*
 * 
 * 15] Sum of distinct elements

You are given an array Arr of size N. Find the sum of distinct elements in an array.
Example 1:
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So the sum is 15.
Example 2:
Input:
N = 5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So the sum is 5.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N*logN)
Constraints:
1 ≤ N ≤ 10^7
0 ≤ A[i] ≤ 10^4
 */


import java.util.LinkedHashSet;
import java.util.*;

class distinct{
    static void hello(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        Set <Integer> lhs = new LinkedHashSet<Integer>();
        int temp;
        for(int i=0;i<size;i++){
            temp = sc.nextInt();
            lhs.add(temp);
        }
        int sum=0;
        for(Integer x :lhs){
            sum+=x;
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        hello();
    }
}