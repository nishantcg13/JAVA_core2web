import java.util.*;

class p1{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		int row=a.nextInt();

		int sp=0;
		int col=0;
		for(int i=1;i<=row*2-1;i++){

			if(i<=row){
				sp=row-i;
				col=i*2-1;
			}
			else{
				sp=i-row;
				col-=2;
			}

			for(int j=1;j<=sp;j++){

				System.out.print("\t");
			}
			for(int j=1;j<=col;j++){
			
				System.out.print("#\t");
			}
			System.out.println();
		}
	}
}
