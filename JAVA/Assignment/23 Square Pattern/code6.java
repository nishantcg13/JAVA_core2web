import java.util.*;

class p6{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row=a.nextInt();
		
		for(int i=1;i<=row;i++){

			int num=row*row;
			for(int j=1;j<=row;j++){

				if(i%2==1){

					System.out.print(num-- + "\t");
				}
				else{
					if(j%2==0){
						num-=5;
					}
					else{
					
					}
					System.out.print(num+"\t");
				}

			}
			System.out.println();
		}
	}
}
