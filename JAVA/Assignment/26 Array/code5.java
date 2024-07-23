import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]= Integer.parseInt(a.readLine());
		
		}

		for(int i=size-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
	}
}


