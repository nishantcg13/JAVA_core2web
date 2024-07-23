import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(a.readLine());

		int temp=1;

		System.out.print("Factors of "+num+" are ");
		while(temp<=num){

			if(num%temp==0){

				System.out.print(temp+",");
			}
			temp++;
		}
	}
}
