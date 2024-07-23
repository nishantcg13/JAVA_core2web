
import java.io.*;

class p9{

	
	public static void main(String[] args)throws IOException{



		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		int num=row*(row+1)-1;
		for(int i=1;i<=row;i++){

			for(int j=i;j<=row;j++){

				System.out.print(num+" ");
				num-=2;
			}
			System.out.println();
		}
	}
}


