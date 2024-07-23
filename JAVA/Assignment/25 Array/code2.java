
import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(a.readLine());
		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]= Integer.parseInt(a.readLine());
		}
		System.out.println();
		System.out.print("Enter the number you want to find ");
		int num= Integer.parseInt(a.readLine());
		for(int i=0;i<size;i++){
			if(arr[i]==num){

			System.out.print("num "+ num +" occurence at index "+i);
			}
		}
	}

}
