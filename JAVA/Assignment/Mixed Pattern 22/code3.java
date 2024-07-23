import java.util.*;

class p3{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);

		int row=a.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){

			for(int sp=i;sp<row;sp++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){

				System.out.print(num+"\t");
				num+=row;
			}
			System.out.println();
		}
	}
}
