import java.util.*;
class p4{

	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);

		int row=s.nextInt();
		int a=1;
		

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row*2;j++){
				if(j%2==1){
				System.out.print((char)+(a+64)+" ");
			}
			a++;
			}
			System.out.println();
		}
	}
}
