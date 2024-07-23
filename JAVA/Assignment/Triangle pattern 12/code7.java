import java.io.*;

class p7{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row=Integer.parseInt(a.readLine());

		int b=1;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				if (j%2==0){
					System.out.print((char)(96+b)+" ");
					b++;
				}
				else{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
