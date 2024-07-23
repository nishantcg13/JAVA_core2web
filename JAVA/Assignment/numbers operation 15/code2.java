import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(a.readLine());

		int temp=1;

		int cnt=0;
		
		while(temp<=num){

			if(num%temp==0){

				cnt++;
			}
			temp++;
		}
		if(cnt==2){
			System.out.println(num+" is prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}

	

	}
}
