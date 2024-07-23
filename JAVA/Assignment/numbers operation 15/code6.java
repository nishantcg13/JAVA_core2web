import java.io.*;

class p6{

	public static void main(String[] args)throws IOException{


		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(a.readLine());

		int b=num;
		int temp=0;
		while(num>0){

			
			int rem=num%10;
			num=num/10;
			temp = temp*10+rem;
		}
		if(temp==b){
			System.out.println(b+" is a palindrome number");
		}
		else{
			System.out.println(b+"is not a palindrome number");
		}
	}
}


