import java.util.*;

class p4{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);

		int row=a.nextInt();

		for(int i=1;i<=row;i++){

			int num=i;
			for(int sp=1;sp<i;sp++){

				System.out.print("\t");
			}
			for(int j=i;j<=row;j++){

				if(row%2==1){

					System.out.print((char)(64+num)+"\t");
				}
				else{
				
					System.out.print((char)(96+num)+"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}
