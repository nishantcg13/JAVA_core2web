import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(a.readLine());

		int m=1;

		while(num>0){

			m*=num;
			num--;
		}
		System.out.println(m);
	}
}
