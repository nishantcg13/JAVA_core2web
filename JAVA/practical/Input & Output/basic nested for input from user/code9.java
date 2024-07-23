import java.util.*;
class p9{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();

		int a=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(a+" ");
				a++;
			}
			a--;
			System.out.println();
		}
	}
}
