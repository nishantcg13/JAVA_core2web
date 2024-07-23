import java.util.*;

class p10{

	public static void main(String[] args){

		Scanner a= new Scanner(System.in);

		int row=a.nextInt();

		for(int i=1;i<=row;i++){
			int num=64+i;

			for(int sp=1;sp<i;sp++){

				System.out.print("\t");
			}
			
				for(int j=i;j<=row;j++){

					if(row%2==0){

						if(j%2==0){

							System.out.print((char)num+"\t");
			
							
						}
						else{
							System.out.print(num+"\t");
						}
					}

					else{
						if(j%2==0){

							System.out.print(num+"\t");
						}
						else{
							System.out.print((char)num+"\t");
						}
					}
					num++;

				}
			System.out.println();
		}
	}
}
