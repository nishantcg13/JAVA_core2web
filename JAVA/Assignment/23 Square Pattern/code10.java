import java.util.*;

class p10{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		int row=a.nextInt();

		int num= row*row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(j==i){
					System.out.print("$\t");
				}
				else{
					System.out.print(num*j+"\t");
				}
				num--;

			}
			System.out.println();
		}
	}
}
