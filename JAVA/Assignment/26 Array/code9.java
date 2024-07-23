import java.util.*;

class p9{

	public static void main(String[] args){

		Scanner a= new Scanner(System.in);

		int size= a.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=a.next().charAt(0);
		}

		for(int i=0;i<size;i++){

			if(arr[i]>=65 && arr[i]<=90){
				System.out.println("#");
			}
			else{
				System.out.println((char)(arr[i]));
			}
		}
	}
}
