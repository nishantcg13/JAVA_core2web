import java.util.*;

class p8{

	public static void main(String[] args){

		Scanner a= new Scanner (System.in);

		int row= a.nextInt();

		for(int i=1;i<=row;i++){

			for(int sp=1;sp<i;sp++){

				System.out.print("\t");
			}

			for(int j=i;j<=row;j++){

				System.out.print(j+"\t");

			}
			System.out.println();
		}
	}
}
