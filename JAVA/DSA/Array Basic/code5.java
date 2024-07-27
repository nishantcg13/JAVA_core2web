/*
5] Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 10000
 */
import java.util.*;
class zeros{
    static void replace(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element:");
        int element = sc.nextInt();
        int newnum=0;
        int num3=0;
        int num2 =0;
        for(;element!=0;){
            newnum = element%10;
            element/=10;
            if(newnum==0){
                newnum=5;
            }
            num2 = num2*10+newnum;
        }
        newnum=0;
        for(;num2!=0;){
            element= num2%10;
            num2/=10;
            newnum=newnum*10+element;
        }
        System.out.println(newnum);
    }
    public static void main(String[] args) {
        replace();
    }
 }