import java.util.*;

class p9{

	public static void main(String[] args){

		Scanner a= new Scanner(System.in);

		int row=a.nextInt();

		for(int i=row;i>=1;i--){
			int num=row;

			for(int sp=i;sp<row;sp++){

				System.out.print("\t");

			}

			for(int j=1;j<=i;j++){

				System.out.print((char)(num+64)+"\t");
				num--;
			}
			System.out.println();
		}
	}
}
		
