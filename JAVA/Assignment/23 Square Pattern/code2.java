import java.util.*;

class p2{

	public static void main(String[] args){

		Scanner  a = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row= a.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(j==1){
				
					System.out.print((char)(96+num)+"\t");
				}
				else{
				
					System.out.print((char)(64+num)+"\t");
				}
			num++;
			}
			System.out.println();
		}
	}
}
