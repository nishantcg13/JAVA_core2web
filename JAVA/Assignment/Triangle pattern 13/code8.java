import java.util.*;

class p8{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int row=sc.nextInt();

		for(int i=row;i>=1;i--){

			for(int j=i;j>=1;j--){

				if(i%2==1){
					System.out.print((char)(64+j)+" ");
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
