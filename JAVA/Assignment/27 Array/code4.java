import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));
		int size=Integer.parseInt(a.readLine());
		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		
		for(int i=0;i<size;i++){
		
			int flag=0;
			for(int j=i+1;j<size;j++){

				if(arr[i]==arr[j]){

					flag++;
					break;
				}
			}

			if(flag==1){

				System.out.println("First Duplicate Element at index "+i);
				break;
			}
		}
	}
}
