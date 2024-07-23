
import java.io.*;

class p7{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());
		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		if(size%2==0){
			for(int i=0;i<size;i+=2){
				System.out.print(arr[i]+"\t");
			}
		}
		else{
			for(int i=0;i<size;i++){
				System.out.print(arr[i]+"\t");
			}

		}	
	}
}
