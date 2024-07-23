import java.util.*;

class p10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]= sc.nextInt();
		}

		int mul=1;
		for(int i=0;i<size;i++){

			int cnt=0;
			for(int j=1;j<=arr[i];j++){

				if(arr[i]%j==0){

					cnt++;
				}
			}
			if(cnt==2){
				mul*=arr[i];
			}
		
		}
		System.out.println("\n"+mul);

	}
}
