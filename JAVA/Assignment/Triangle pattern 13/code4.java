
import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		int num=(row+1)*row/2;
		for(int i=1;i<=row;i++){

			for(int j=i;j<=row;j++){

				System.out.print((char)(num+64)+" ");
				num--;
			}
			System.out.println();
		}
	}
}
