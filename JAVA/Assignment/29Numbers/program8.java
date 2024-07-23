import java.util.*;

class DuckNumber{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int flag = 0;
		int tmp = num;
		int rev = 0;

		while(tmp!=0){

			int rem = tmp%10;
			if(rem==0){

				flag=1;
				break;
			}
			tmp /= 10;
		}
		if(flag==1){
	
			System.out.println(num+ " Number is Duck Number.");
		}else{
		
			System.out.println(" Number is not Duck number");
		} 
	}
}
