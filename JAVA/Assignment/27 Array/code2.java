import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(a.readLine());

		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i] = Integer.parseInt(a.readLine());
		}

		int odd= 0;
		int even=0;
		for(int i=0;i<size;i++){

			if(arr[i]%2==0){
			
				even+=arr[i];
			}
			else{
				odd+=arr[i];
			}
		}
		System.out.println("Even Sum "+even);
		System.out.println("Odd Sum "+odd);
	
	}
}
