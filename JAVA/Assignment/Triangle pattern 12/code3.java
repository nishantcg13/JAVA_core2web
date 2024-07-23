import java.io.*;

class p3{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(a.readLine());

		for(int i=1;i<=b;i++){

			for(int j=1;j<=i;j++){

				System.out.print((char)(64+j)+" ");
			}
		System.out.println();
		}
	}
}


