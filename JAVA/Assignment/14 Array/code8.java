import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));



		System.out.println("Enter number of employees: ");
		int size= Integer.parseInt(a.readLine());

		
		int arr[] = new int[size];

		
		System.out.println("Enter employees age: ");
		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());

		}

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");
		}
	}
		

}

			



		
