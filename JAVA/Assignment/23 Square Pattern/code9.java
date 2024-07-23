import java.util.*;

class p9{

	public static void main(String[] args){

		Scanner a = new Scanner (System.in);

		int row=a.nextInt();
		int num=row*row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){
		
				if(j%2==0){

					System.out.print("@\t");
				}
				else{
					System.out.print(num*i+"\t");
				}
				num--;
			}
			System.out.println();

		}
	}
}
