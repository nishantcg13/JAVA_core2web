import java.util.*;

class p6{

	public static void main(String[] args){

		Scanner a= new Scanner(System.in);

		int row=a.nextInt();

		for(int i=row;i>=1;i--){

			for(int sp=row;sp>i;sp--){

				System.out.print("\t");
			}

			for(int j=i;j>=1;j--){

				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
}
