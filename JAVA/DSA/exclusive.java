/*
 * BRUTE FORCE APPROACH for exclusive number count
 * */
/*

import java.util.*;
class P2{

	static int excl(int start,int end){

		int count=0;
		for(int i=start;i<=end;i++){

			count++;
		}
		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end = sc.nextInt();
		int k=excl(start,end);
		System.out.println(k);
	}
}*/


/* OPTIMISED APPROACH  for this code
 *
 * */


import java.util.*;
class P2{

	static int excl(int start,int end){

		int count=end-start+1;
		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end = sc.nextInt();
		int k=excl(start,end);
		System.out.println(k);
	}
}
