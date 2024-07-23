import java.util.*;

class p7{

	public static void main(String[] args){

		Scanner a = new Scanner (System.in);
		System.out.println("Enter the number of rows :");
		int row = a.nextInt();

		for(int i=1;i<=row;i++){

			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}

			for(int j=i*2-1;j>=1;j--){

				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}
}
