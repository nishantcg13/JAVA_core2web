import java.util.*;

class p6{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);

		int row=a.nextInt();

		for(int i=1;i<=row;i++){

			int num=1;
			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){

				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
