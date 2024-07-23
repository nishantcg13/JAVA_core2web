
import java.util.*;

class p4{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=sc.nextInt();

		for(int i=row;i>=1;i--){

			int num=i;
			for(int j=i;j<=row;j++){

				System.out.print(num+" ");

				num=num+i;

			}
			System.out.println();
		}
	}
}
			

