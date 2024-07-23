import java.io.*;

class p6{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(a.readLine());
		char arr[]=new char[size];

		for(int i=0;i<size;i++){

			arr[i]= (char)a.read();
			a.skip(1);
		}
		for(int i=0;i<size;i++){
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='o'&& arr[i]!='i'&& arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I'&& arr[i]!='O'&& arr[i]!='U'){
			System.out.print(arr[i]+"\t");
		}
	}

	}
}
