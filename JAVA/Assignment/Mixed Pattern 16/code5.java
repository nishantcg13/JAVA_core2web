
import java.util.*;

class p5{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			int num=i;

			for(int j=1;j<=i;j++){

				System.out.print(num+" ");
				num+=i;
			}
			System.out.println();
		}
	}
}

