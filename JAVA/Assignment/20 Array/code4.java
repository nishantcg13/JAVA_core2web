import java.io.*;

class p4{
	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());

		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		System.out.println();
		System.out.println("Enter the Element to  be searched");
		int num = Integer.parseInt(a.readLine());

		for(int i=0;i<size;i++){

			if(arr[i]==num){
				System.out.println("Element found at index "+i);
			}
		}


	}
}
