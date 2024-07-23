import java.util.*;
class p6{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
			
				System.out.print(" "+j+(char)(j+64));
			
			
			}
			System.out.println();
		}
	}
}
