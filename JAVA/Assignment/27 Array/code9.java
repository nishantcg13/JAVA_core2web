import java.io.*;

class p9{

	public static void main(String[] args)throws IOException{
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Element: ");

		int size=Integer.parseInt(a.readLine());
		int i=0;
		int temp=size;
		int rem=0;
		int arr[]=new int[size];
		while(temp!=0){
	
			rem=temp%10;
			temp/=10;
			for(int i=0;i<size;i++){
			arr[i]=rem+1;
			i++;
		}	
		
		for(int j=0;j<size;j++){

			System.out.print(arr[j]+",");
		}

	}
}
