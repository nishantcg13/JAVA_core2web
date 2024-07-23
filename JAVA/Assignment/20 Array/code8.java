
import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());
		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.print(arr[i]+" is greater than 5 and less than 9");
				System.out.println();
			}
		}
	}
}
