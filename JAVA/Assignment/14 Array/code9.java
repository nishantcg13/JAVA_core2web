import java.io.*;


class p9{

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

			if(i%2==1){

				System.out.println(arr[i]+" is an odd indexed element");
			}
		}
	}
}


