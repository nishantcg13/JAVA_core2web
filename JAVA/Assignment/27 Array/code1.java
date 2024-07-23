import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader( new InputStreamReader(System.in));

		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];
		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int flag=0;
		for(int i=1;i<size;i++){

			if(arr[i-1]<arr[i]){

				
			}
			else{
				flag=1;
			}
		}

		if(flag==0){
			System.out.println("Array is in ascending order ");
		}
		else{
			System.out.println("Array is not in ascending order ");
		}
	}
}
