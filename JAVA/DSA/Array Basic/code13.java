/*
 * 
 * 13] Find unique element

Given an array of size n which contains all elements occurring in multiples of K,
except one element which doesn't occur in multiple of K. Find that unique element.
Example 1:
Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.
Example 2:
Input :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.
Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )
Constraints:
3<= N<=2*10^5
2<= K<=2*10^5
1<= A[i]<=10^9

 */

import java.util.HashMap;
import java.util.*;

class unique{
    static void uniqueEle(){
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int arr[] = new int[size];
        for(int i =0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }
       

        HashMap<Integer, Integer> people = new HashMap<Integer, Integer>();

        for(int i=0;i<size;i++){
            if(!people.containsKey(arr[i])){
                people.put(arr[i], 1);
            }else{
                people.put(arr[i], people.get(arr[i])+1);
            }
        }
        for(int i=0;i<size;i++){
            if(people.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }
        
    } 

    public static void main(String[] args) {
        uniqueEle();
    }
}
