class SwitchDemo {
	public static void main(String[] args){
		String friends = "Kanha";
		System.out.println("Before Switch");
		
		switch (friends) {

			case "Ashish":

				System.out.println("BMC Software");
				break;

			case "Kanha":
			
				System.out.println( "Infosys");
				break;
			case "Rahul":

				System.out.println( "IBM" );
				break;
			case "Badhe":
			
				System.out.println( "Barclays");
				break;
			default:
				System.out.println("In default state");
		}
		System.out.println("Out of Switch");

	}
}
