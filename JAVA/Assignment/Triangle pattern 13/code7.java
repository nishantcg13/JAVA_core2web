import java.util.*;

class p7{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int row=sc.nextInt();

		for(int i=row;i>=1;i--){

			int n=1;
			int a=i;
			int s=i;
			for(int j=1;j<=i;j++){

				if(n%2==0){

					System.out.print((char)(s+96)+" ");
					
				}
				else{
					System.out.print(a+" ");
					
				}
				n++;
				s--;
				a--;
			}
		System.out.println();
		}
	}
}


