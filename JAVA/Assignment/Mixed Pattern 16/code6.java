

import java.util.*;

class p6{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int row=sc.nextInt();

			for(int i=row;i>=1;i--){
				int num=row;
				for(int j=i;j<=row;j++){

					if(i%2==1){

						System.out.print((char)(96+num)+" ");
					}
					else{
						System.out.print(num+" ");
					}
					num--;
				}
				System.out.println();
			}
	}
}
