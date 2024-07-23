import java.util.*;

class p2{

	public static void main(String[] args){

		Scanner a=new Scanner(System.in);
		
		int row=a.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				System.out.print(" "+(char)(64+row)+num+" ");
				num--;
			}
			num=row+i;
		System.out.println();
		}
	}
}
