/*
 *
 * Brute Force Approach to print sum of n natural numbers
 * */
/*import java.util.*;
class P1{

	static int sum(int num){

		int cnt=0;
		for(int i=0;i<=num;i++){

			cnt+=i;
		}
		return cnt;
	}

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		int num=a.nextInt();
		int k=sum(num);
		System.out.println("Sum of First "+num+" numbers is "+k);
	}
}*/

/* Optimised Approach for the above code*/


import java.util.*;
class P1{

	static int sum(int num){
		//GUASS Theorom = n*(n+1)/2
		int cnt=(num*(num+1))/2;
		return cnt;
	}

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		int num=a.nextInt();
		int k=sum(num);
		System.out.println("Sum of First "+num+" numbers is "+k);
	}
}
