import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{
		

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int b= Integer.parseInt(a.readLine());

		for(int i=1;i<=b;i++){

			for(int j=1;j<=i;j++){

				if(i%2==1){

					System.out.print((char)(96+j)+" ");
				}
				else{
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
}
