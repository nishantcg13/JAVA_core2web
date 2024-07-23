
import java.io.*;

class p6{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());
		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int mul=1;
		for(int i=0;i<size;i++){
			if(i%2==1){
				mul*=arr[i];
			}
		}
	System.out.println();
	System.out.print("Multiplication of odd indexed Elements is "+mul);	
	}
}
