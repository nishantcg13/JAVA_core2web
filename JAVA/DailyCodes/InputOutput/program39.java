import java.io.*;

class InputDemo {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Employee name :");
		String name = br.readLine();
		
		System.out.print("Enter Compony name :");
		String cmpname = br.readLine();

		System.out.println("name: "+name);
		System.out.println("Compony name: "+cmpname);
		
	}
}






