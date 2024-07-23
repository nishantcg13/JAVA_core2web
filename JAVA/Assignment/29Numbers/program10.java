import java.util.*;

class ArmstrongNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int tmp = num;
		int cnt = 0;
		int sum = 0;
		while(tmp!=0){

			int rem = tmp % 10;
			cnt++;
			tmp /= 10;
		}
		tmp= num;
		
		while(tmp!=0){

			int rem = tmp%10;
			int prd = 1;
			for(int i=1; i<=cnt; i++){
				prd *= rem;
			}	
			sum += prd;
			tmp /= 10;
		}
		if(sum==num){

			System.out.println(num+" Number is Armstrong Number.");
		}else{
			System.out.println(num+" Number is not Armstrong Number.");
		}
	}
}
