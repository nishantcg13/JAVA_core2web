
import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader( new InputStreamReader(System.in));
		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];


		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());

		}

		int min=arr[0];
		for(int i=0;i<size;i++){

			if(min<arr[i]){

				min=arr[i];
			}
		}

		int min2=arr[0];
		if(min==arr[0]){
			min2=arr[1];
		}

		else{
			min2=arr[0];
		}

		for(int i=0;i<size;i++){

			if(arr[i]>min2 && arr[i]<min){

				min2=arr[i];
			}
		}
		System.out.println("\n"+min2);

	}
}
