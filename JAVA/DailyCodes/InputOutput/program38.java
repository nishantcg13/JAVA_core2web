iimport java.io.*;

class InputDemo {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("name: "+name);
		
		String cmpname = br.readLine();
		System.out.println("Compony name: "+cmpname);
		
	}
}





