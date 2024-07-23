import java.util.*;
class p7{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();		
		for(int i=1;i<=row;i++){
			for(int j=3;j>=row-2;j--){
			
				System.out.print(" "+(char)(j+96));
			
			
			}
			System.out.println();
		}
	}
}
