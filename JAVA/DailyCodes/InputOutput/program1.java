class InputDemo{

	void run(){

		System.out.println("In run Method");
	}
	static void fun(){

		System.out.println("In fun method");

	}	
	public static void main(String[] args){

		System.out.println("In main method.");
		fun();

		InputDemo obj = new InputDemo();
		obj.run();
	}
}
