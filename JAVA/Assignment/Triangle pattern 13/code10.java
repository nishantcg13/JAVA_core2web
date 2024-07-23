
import java.io.*;

class p10{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		
		for(int i=row;i>=1;i--){

			for(int j=i;j>=1;j--){

				if(row%2==1){
					if(i%2==0){

					System.out.print((char)(64+j)+" ");
					

			
					}
			
					else{
			
						System.out.print((char)(96+j)+" ");
			
					}
				}
				else{
					if(i%2==1){

					System.out.print((char)(96+j)+" ");
					

			
					}
			
					else{
			
						System.out.print((char)(64+j)+" ");
					}
				}
			}
			System.out.println();
		}
	}
}

