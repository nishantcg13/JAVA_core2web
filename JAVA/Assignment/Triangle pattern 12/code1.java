import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(a.readLine());

		for(int i=1;i<=b;i++){

			for(int j=1;j<=i;j++){

				System.out.print(b*b+" ");
			}
			System.out.println();
		}
	}
}
