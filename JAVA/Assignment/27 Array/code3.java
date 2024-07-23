import java.io.*;

class p3{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));
		int size=Integer.parseInt(a.readLine());
		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}
		int flag=0;
		for(int i=0;i<size/2;i++){

			if(arr[i]==arr[size-i-1]){
				
			}
			else{

				flag=1;
			}
		}
		if(flag==0){

			System.out.println("Given array is palindrome array ");
		}
		else{
			
			System.out.println("Given array is not palindrome array");
		}
	}
}
