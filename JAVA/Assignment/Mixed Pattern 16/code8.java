import java.util.*;

class p8{

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		int row=sc.nextInt();
		int temp=(row+1)*row/2;

		for(int i=row;i>=1;i--){

			for(int j=1;j<=i;j++){

				System.out.print((char)(temp+64)+" ");
				temp--;

			}
		System.out.println();
		}
	}
}
