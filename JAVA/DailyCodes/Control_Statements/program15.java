class SwitchDemo {
	public static void main(String[] args){
		float num = 1.5;
		System.out.println("Before Switch");
		
		switch (num) {

			case 1.5:

				System.out.println("One");
				break;

			case 2.0:
			
				System.out.println( "Two");
				break;
			case 2.5:

				System.out.println( "Three " );
				break;
			default:
				System.out.println("In default state");
		}
		System.out.println("Out of Switch");

	}
}
