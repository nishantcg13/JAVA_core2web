class p3
{
	public static void main(String[] args){
	
		int x=8;
		if (x%2==0){
			System.out.println("Number is even number");
			if (x>10){
				System.out.println("NUmber is greater than 10");
			}
			
			else if (x<10){
				System.out.println("NUmber is less than 10");
			}
			else {
				System.out.println("NUmber is equal to 10");
			}
		}
		
		else if (x%2==1){
			System.out.println("Number is odd number");
			if (x>10){
				System.out.println("NUmber is greater than 10");
			}
			
			else if (x<10){
				System.out.println("NUmber is less than 10");
			}
			else {
				System.out.println("NUmber is equal to 10");
			}
		}
		else {
		System.out.println("invalid input");
		
	}

}
}
