import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		System.out.println("Enter the number you want to check: ");
		int num= Integer.parseInt(a.readLine());
		int cnt=0;
		for(int i=0;i<size;i++){

			if(num==arr[i]){
			
				cnt++;
			}
		}
		if(cnt>2){
			
			System.out.println(num+" occurs more than 2 times in array");
		}
		else{
			System.out.println(num+" occurs "+cnt+" times in array");
		}
	}
}
