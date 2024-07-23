import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));
		int size=Integer.parseInt(a.readLine());
		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		for(int i=0;i<size;i++){

			int rem=0;
			int temp=arr[i];
			int count =0;
			while(temp!=0){
			
				rem=temp%10;
				temp/=10;
				count++;
				
			}
			System.out.print(count+",");
		}
	}
}
