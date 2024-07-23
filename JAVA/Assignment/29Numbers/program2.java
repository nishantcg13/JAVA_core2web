import java.util.*;

class StrongNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int tmp = num;
		int sum = 0;

		while(num!=0){
		int fact = 1;

			int num1 = num % 10;

			for(int i=num1; i>0; i--){

				fact *= i;
				num1--;
			
			}
			sum = sum + fact;
			num /=10;
		}
		if(sum==tmp){
	
			System.out.println("Number is strong Number.");
		}else{
		
			System.out.println("Number is not strong number");
		}
	}
}
