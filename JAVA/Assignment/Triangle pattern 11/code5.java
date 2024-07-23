import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(a.readLine());

		int c=1;

		for(int i=1;i<=b;i++){
			for(int j=1;j<=i;j++){


				System.out.print(c+" ");
				c++;

			}
			System.out.println();

		}
	}
}
