import java.util.*;
class p3{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
