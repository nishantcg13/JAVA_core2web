import java.util.*;

class p1{

	public static void main(String[] args){

		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = a.nextInt();
		int num=rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){

				if(j==1){

					System.out.print((char)(num+64)+"\t");
				}
				else{

					System.out.print((char)(num+96)+"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}
