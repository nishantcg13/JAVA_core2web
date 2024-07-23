import java.util.*;

class p1{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);

		int num=1;
		int row=a.nextInt();
		for(int i=1;i<=row;i++){
			
			for(int sp=i;sp<row;sp++){
				System.out.print("\t");
			}

			for(int j=1;j<=i;j++){

				System.out.print(num+"\t");
				num+=2;
			}
			System.out.println();
		}
	}
}
