import java.util.*;

class p8{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row=a.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			int temp=num;
			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(temp+"\t");
				temp++;
			}
			num--;
			System.out.println();
		}
	}
}
