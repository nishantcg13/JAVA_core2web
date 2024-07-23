//import java.io.*;
import java.util.*;
class p3{

	public static void main(String[] args){//throws IOException{
		Scanner a = new Scanner(System.in);
		//BuffferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size = a.nextInt();
		//int size= Integer.parseInt(a.readLine());
		char arr[] = new char[size];
		for(int i=0;i<size;i++){
			
			arr[i]=a.next().charAt(0);
		}

		for(int i=0;i<size;i++){
			if(arr[i]== 'a' || arr[i]== 'e' || arr[i]== 'i' || arr[i]=='o' || arr[i]=='u'|| arr[i]=='A'|| arr[i]=='E'|| arr[i]=='O'|| arr[i]=='U'){

			System.out.println("Vowel "+arr[i]+" found at index "+i);


			}
		}
	}

}
