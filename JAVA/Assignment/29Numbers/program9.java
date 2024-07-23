import java.util.*;

class HarshadNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int tmp = num;
		int sum = 0;

		while(tmp!=0){

			int rem = tmp%10;	
			sum += rem;
			tmp /= 10;
		}
		if(num%sum==0){
	
			System.out.println(num+ " Number is harsad Number.");
		}else{
		
			System.out.println(num+" Number is not Harshad number");
		} 
	}
}
