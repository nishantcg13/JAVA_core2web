import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int row= Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){

			for(int sp=1;sp<=row-i;sp++){

				System.out.print("\t");

			}
			for(int j=1;j<=i*2-1;j++){

				System.out.print("1\t");
			}
			
			System.out.println();
		}
	}
}
