class SwitchDemo {
	public static void main(String[] args){
		char data = 'B';
		System.out.println("Before Switch");
		
		switch (data) {

			case 'A':

				System.out.println("A");
				break;

			case 65:
			
				System.out.println( "B");
				break;
			case 'B':

				System.out.println( "C" );
				break;
			case 66:
			
				System.out.println( "B");
				break;
			default:
				System.out.println("In default state");
		}
		System.out.println("Out of Switch");

	}
}
