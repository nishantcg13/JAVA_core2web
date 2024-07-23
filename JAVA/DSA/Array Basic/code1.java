/*
Given an integer array and another integer element. The task is to find if the given
element is present in the array or not.
Example 1:
Input:
n=4;
arr[] ={1,2,3,4}
x=3
Output: 2
Explanation: There is one test case with an array as {1, 2, 3 4} and an
element to be searched as 3. Since 3 is present at index 2, output is 2.
Example 2:
Input:
n=5
arr[] ={1,2,3,4,5}
x=5
Output: 4
Explanation: For array elements {1,2,3,4,5} element to be searched is 5 and
it is at index 4. So, the output is 4.
Expected Time Complexity: O(n).
Expected Auxiliary Space: 0(1).
Constraints:
1<=n<=10^6
0<=arr[i]<=10^6
0<=x<=10^5
*/
import java.util.*;
class searchElement{

	static void element(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		int snum = sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i] == snum)
				System.out.println("Element " + arr[i] + " found at index " + i);
		}
	}

	public static void main(String[] args){
		element();
	}
}
