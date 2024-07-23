import java.io.*;

class p3{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());

		int arr[] = new int[size];
		

		System.out.println();
		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		System.out.println();
		for(int i=0;i<arr.length;i++){

			if(i%2==0){

				System.out.print(arr[i]+",");
			}
		}
	}
}


