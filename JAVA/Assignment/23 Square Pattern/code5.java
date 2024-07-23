// 4	&	5	&
// 6	6	6	6
// 6	&	7	&
// 8	8	8	8	rows=4;
import java.util.*;

class p5{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int row=a.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){
			
				if(i%2==1){
				
					if(j%2==1){

						System.out.print(num+"\t");
						num++;
					}
					else{
						System.out.print("$\t");
					}
				}
				else{
					System.out.print(num+"\t");
				}
			}
			System.out.println();
		}
	}
}
