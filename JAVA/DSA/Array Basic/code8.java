/*
8] Even occurring elements
Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.
Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23
Example 2:
Input:
N = 5
Arr[] = {23, 12, 56, 34, 32}
Output: -1
Explanation:
Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^5
0 ≤ Arr[i] ≤ 63
 */
import java.util.*;
class even{
    static void occ(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int cnt=1;
        int i=1;
        for(i=1;i<size;i++){
            if(arr[i]==arr[i-1]){
                cnt++;
            }
            else{
                if(cnt%2==0){
                    System.out.print(arr[i-1]+" ");
                }
                cnt=1;
            }
        }
        if(cnt%2==0){
            System.out.print(arr[i-1]+" ");
        }
    }
    public static void main(String[] args) {
        occ(); //9, 12, 23, 10, 12, 12,15, 23, 14, 12, 15
      
    }
}