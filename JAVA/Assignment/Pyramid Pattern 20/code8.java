import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		int num=row;
		for(int i=1;i<=row;i++){

			
			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				System.out.print(num+"\t");

			}
			System.out.println();
			num--;
		}
	}
}
