import java.util.*;

class p1{

	public static void main(String[] args){

		Scanner a= new Scanner (System.in);
		int row=a.nextInt();

		int b=1;
		for(int i=1;i<=row;i++){


			for(int j=1;j<=row;j++){

				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}
	}
}

