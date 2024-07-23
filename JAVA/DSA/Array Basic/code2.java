/*
 *21 Find minimum and maximum element in an array
Given an array A of size N of integers. Your task is to find the minimum and
maximum elements in the array.
Example 1:
Input:
n=6
A[] = {3, 2, 1, 56, 10000, 167}
Output: 1 10000
Explanation: minimum and maximum elements of array are I and 10000.
Example 2:
Input:
n=5
A[] = {1, 345, 234, 21, 56789}
Output: 1 56789
Explanation: minimum and maximum elements of array are I and 56789.
Expected Time Complexity: O(N)
Expected Auxiliary Space: 0(1)
Constraints:
1<=N<=10^5
1<=Ai<=10^12
 * */
import java.util.*;
class minmax{
	
	static void code2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for(int i=1;i<size;i++){
			if(min > arr[i])
				min = arr[i];

			else{

			}
			if(max<arr[i])
				max = arr[i];
			else{
			}
		}
		System.out.println(min +" "+max);

	}

	public static void main(String[] args){
		code2();
	}
}

