
class InputDemo{

	void methodFun(){

		System.out.println("In fun method.");
	}
	void methodGun(){

		System.out.println("In gun method.");
	}
	void methodRun(){

		System.out.println("In run method.");
	}

	public static void main(String[] args){

		System.out.println("In main mehtod.");	//all above methods are non static one
		
		InputDemo obj = new InputDemo();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}
}


