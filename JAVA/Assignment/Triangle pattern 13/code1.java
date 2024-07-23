import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){

			for(int j=i;j<=row;j++){

				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
