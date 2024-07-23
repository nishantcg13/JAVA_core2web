import java.util.*;

class p10{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=a.nextInt();

		
		for(int i=1;i<=rows;i++){
			int num=i;

			for(int sp=i;sp<rows;sp++){

				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				if(j<i){

					System.out.print(num-- +"\t");
				}
				else{
					System.out.print(num++ +"\t");
				}

			}
			System.out.println();
		}
	}
}
