import java.util.*;

class p3{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=sc.nextInt();

		for(int i=1;i<=row;i++){

			int num=row;
			for(int j=1;j<=row;j++){


				if(i%2==1){
					

					System.out.print((char)(64+num)+" ");
					num--;
				}
				else{
					System.out.print(j+" ");
					
				}
			}
			System.out.println();
		}
	}
}
