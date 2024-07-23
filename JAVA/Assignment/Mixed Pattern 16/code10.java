import java.util.*;

class p10{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		long num= sc.nextLong();
		long a=num;
		long temp=0;
		long rem=0;
		
		

		for(int i=1;num>0;i++){

			rem=num%10;
			num/=10;
			temp=temp*10+rem;
			

		}	
		System.out.println("Reversed Number is: "+temp);
		System.out.println();
		for(int i=1;temp>0;i++){

			rem=temp%10;
			temp/=10;
			if(rem%2==1){

				System.out.print(rem*rem+",");
			}

		}
	}
}
		
		



			


