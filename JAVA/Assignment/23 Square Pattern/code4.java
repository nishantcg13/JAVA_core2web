import java.util.*;

class p4{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = a.nextInt();

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(i%2==0){

					if(j%2==0){
						System.out.print("$\t");
					}
					else{
						System.out.print("&\t");
					}
				}
				else{

					System.out.print("&\t");
				}
			}
			System.out.println();
		}
	}
}
