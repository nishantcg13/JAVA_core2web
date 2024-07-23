import java.io.*;

class InputDemo{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :");
		String name = br.readLine();
		System.out.println("Enter Society name :");
		String scName = br.readLine();
		System.out.println("Enter wing :");
		char wing = br.readLine();
		System.out.println("Enter flat no :");
		int flatNo = br.readLine();

	}
}

