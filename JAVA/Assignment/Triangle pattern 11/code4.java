import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));

		int b=Integer.parseInt(a.readLine());

		for(int i=1;i<=b;i++){
			int c=b;
			for(int j=1;j<=i;j++){
				System.out.print(c*j+" ");
			}
			System.out.println();
		}
	}
}
