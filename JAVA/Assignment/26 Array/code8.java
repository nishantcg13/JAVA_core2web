import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));

		int size = Integer.parseInt(a.readLine());

		char arr[]= new char[size];

		for(int i=0;i<size;i++){

			arr[i]=(char)a.read();
			a.skip(1);
		}
		System.out.println("Enter the element you want to find the occurence ");
		char b= (char)a.read();
		a.skip(1);
		int count=0;
		for(int i=0;i<size;i++){

			if(b==arr[i]){

				count++;
			}
		}
		System.out.println(b+" Occured "+count+" times in array ");
	}
}
