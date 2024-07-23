import java.util.*;

class p5{

	public static void main(String[] args){

		Scanner a= new Scanner(System.in);

		int row=a.nextInt();

		for(int i=1;i<=row;i++){

			int num=i;

			for(int sp=1;sp<=row-i;sp++){

				System.out.print("\t");

			}

			for(int j=1;j<=i;j++){

				System.out.print(num+"\t");
				num+=i;
			}

			System.out.println();
		}
	}
}
