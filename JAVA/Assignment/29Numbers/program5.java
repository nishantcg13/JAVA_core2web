import java.util.*;

class AutomorphicNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int tmp = num;
		int cnt = 0;
		int sqr = num * num;
		while(tmp!=0){

			int rem = tmp % 10;
			cnt++;
			tmp /= 10;
		}
		System.out.println("cnt "+cnt);
		int rev = 0;
		while(cnt>0){

			int rem = sqr%10;
			rev = rev * 10 + rem;
			sqr /= 10;
			cnt--;
		}
		System.out.println("rev "+rev);
		int temp = rev;
		int rev1 = 0;
		while(temp != 0){

			int rem = temp % 10;
			rev1 = rev1 *10 + rem;
			temp /= 10;	
		}
		System.out.println("rev1 "+rev1);
		if(rev1==num){

			System.out.println("Number is Automorphic Number.");
		}else{
			System.out.println("Number is not Automorphic Number.");
		}
	}
}
