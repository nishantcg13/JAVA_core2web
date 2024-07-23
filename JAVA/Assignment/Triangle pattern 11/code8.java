import java.io.*;

class p8{


	public static void main(String[] args)throws IOException{

		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(a.readLine());

		for(int i=1;i<=b;i++){
			for(int j=i;j<=b;j++){

				System.out.print(j +" ");
			}
			System.out.println();

	}


	}}
