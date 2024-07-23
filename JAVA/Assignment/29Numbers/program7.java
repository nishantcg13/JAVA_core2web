import java.util.*;

class HappyNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int tmp = num;

		while(true){
			sum = 0;
			while(num!=0){
				int rem = num % 10;
				int sqr = rem * rem;
				sum += sqr;	
				num /= 10;
			}
		
			if(sum==1){
	
				System.out.println("Number is Happy Number.");
				break;
			}else if(sum==tmp || sum<10){
		
				System.out.println("Number is not Happy number");
				break;
			}
			num = sum;
		}
	}
}

