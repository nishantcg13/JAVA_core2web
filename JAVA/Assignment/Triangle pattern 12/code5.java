import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row=Integer.parseInt(a.readLine());

		int b=row+1;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print((char)(b+64)+" ");
				b++;
			}
		System.out.println();
		}
	}
}
