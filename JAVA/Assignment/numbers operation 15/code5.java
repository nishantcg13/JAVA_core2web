import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int num= Integer.parseInt(a.readLine());

		int temp=0;


		while(num>0){

			int rem=num%10;
			num=num/10;
			temp=temp*10+rem;
		}
		System.out.println(temp);
	}
}



