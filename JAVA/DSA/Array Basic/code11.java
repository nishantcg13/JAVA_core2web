/*
 * 
 * [11] Product of maximum in first array and minimum in second

Given two arrays of A and B respectively of sizes N1 and N2, the task is to
calculate the product of the maximum element of the first array and minimum
element of the second array.
Example 1:
Input : A[] = {5, 7, 9, 3, 6, 2},
B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2.
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.
Example 2:
Input : A[] = {0, 0, 0, 0},
B[] = {1, -1, 2}
Output : 0
Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Output:
For each test case, output the product of the max element of the first array and the
minimum element of the second array.
Constraints:
1 ≤ N, M ≤ 10^6
 */
import java.util.*;
class maxminproduct{
    static void product(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array:");
        int size = sc.nextInt();
        System.out.print("Enter size of second array:");
        int size2 = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size2];

        System.out.println("Enter elements of array 1");
        for(int i=0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array 2");
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        int min = arr2[0];
        int max = arr1[0];
        for(int i=0;i<size;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        for(int i=0;i<size2;i++){
            if(arr2[i]<min){
                min = arr2[i];
            }
        }
        System.out.println("Product is: "+max*min);
    }

    public static void main(String[] args) {
        product();
    }
    
}