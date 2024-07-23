/* Lecture 2
 *
 *
 *
 * */

/* 
 * BRUTE FORCE APPROACH
 * */
/*
class P1{

	static int sqr(int num){
		int ans=0;

		for(int i=1;i<=num;i++){

			if(i*i<=num){
				ans=i;
			}
			else{
			break;
			}
		}
		return ans;
	}

	public static void main(String[] args){

		int num=100;
		int k=sqr(num);
		System.out.println(k);
	}
}
*/

class Sqe{

	static int sqr(int num){
		int start = 1;
		int end=num;
		int ans=0;
		int cnt=0;
		int mid=0;

		while(start<=end){
			mid=(start+end)/2;
			if(mid*mid==num){
				ans=mid;
				break;
			}
			else if(mid*mid>num){
				end=mid-1;
			}
			else{

				ans=mid;
				start=mid+1;
			}

		}
		//System.out.println(ans);
		return ans;
	}
	public static void main(String[] args){
		int num=37;
		int k=sqr(num);
		System.out.println(k);
	}

}
