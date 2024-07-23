import java.io.*;

class p9{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row=Integer.parseInt(a.readLine());

		System.out.println();
		int c=1;
		for(int i=1;i<=row;i++){

			int b=row+1;
			
			for(int j=1;j<=i;j++){

				if(j%2==0){
				

					System.out.print((char)(96+c)+" ");
					c++;
				}
				else{
					
					System.out.print(b+" ");
					
			}
			b++;
			}
			System.out.println();
		}
	}
}

