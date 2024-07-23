


import java.io.*;

class p6{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		
		for(int i=1;i<=row;i++){

			int num=1;
			
			for(int j=1;j<=row-i+1;j++){

				if(j%2==0){
					
					System.out.print((char)(96+num)+" ");
					num++;
				}
				else{
					System.out.print(num+" ");
						
				}
				
				
			}
			System.out.println();
		}
	
	}
}
