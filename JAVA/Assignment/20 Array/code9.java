
import java.io.*;

class p9{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());
		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int min=arr[0];
		for(int i=0;i<size;i++){
			if(min>arr[i]){
				min=arr[i];
			}

		}
		System.out.println("Minimum number in the array is: "+min);
	}
}
