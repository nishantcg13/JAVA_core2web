class InputDemo{

	void fun(){

		System.out.println("In fun method.");
	}
	static void run(){

		System.out.println("In fun method.");
	}
	public static void main(String[] args){

		System.out.println("In main method.");
		run();		//here run is static method so it's callable
	}
}
