import java.util.*;
class p1{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print("$# ");
			}
			System.out.println();
		}
	}
}
