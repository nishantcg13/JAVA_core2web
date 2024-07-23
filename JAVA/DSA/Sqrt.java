/*
 * Lecture 2
 * */



/*Brute Force Approach
 *
 */

/*class P1{

	static int squareroot(int num){

		int val=0;
		for(int i=1;i<=num;i++){

			if(i*i<=num){
				
				val=i;
			}
			else
				break;
		}
		return val;
	}

	public static void main(String[] args){

		int num=100;
		int k=squareroot(num);
		System.out.println(k);
	}
}*/
import java.util.*;
class P1{

	static int squareroot(int num){

		int start=1;
		int end=num;
		int h=0;
		int cnt=0;

		for(int i=1;start<=end;i++){
			cnt++;
			int mid=(start+end)/2;
			if(mid*mid==num){

			//	System.out.println(cnt);
				return mid;
			}
			if(mid*mid>num){
				end=num+1;
			}
			else{
				h=mid;
				start=mid+1;
			}
		}
		System.out.println(cnt);
		return h;
	}

	public static void main(String[] args){

		int num=50;
		int k=squareroot(num);
		System.out.println(k);
	}
}

