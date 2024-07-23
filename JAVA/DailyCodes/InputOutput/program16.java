class StaticDemo{

	int x = 30;
	static int y = 40;

	void run(){

		System.out.println("In run method.");
	}
	static void fun(){

		System.out.println("In fun method.");
	}
	public static void main(String[] args){

		StaticDemo obj = new StaticDemo();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();

	}
}
