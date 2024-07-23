import java.util.*;

class p9{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int row=sc.nextInt();

		int sum=row;	
		for(int i=1;i<=row;i++){

			int num=sum;
			int temp=1;
			for(int j=i;j<=row;j++){
					
					if(i%2==1){

						System.out.print(temp+" ");
					}
					else{
						System.out.print((char)(num+64)+" ");
					
					}
				num--;		

				temp++;
			}
		System.out.println();
		
		sum--;
		}
	}
	
}

