class p9{

	public static void main(String[] args){

		int DM=78;
		int FDS=89;
		int OOP=76;
		int CG=90;
		int DELD=95;
		char c='S';

		int avg=(78+89+76+90+95)/5;

		if (DM>=40 && FDS>=40 && OOP>=40 && CG>=40 && DELD>=40){

			System.out.println("You have passed in the exam");

			if(avg<=100 && avg>=75){
				c='O';
			}
			else if(avg<75 && avg>=65){
				c='A';
			}
			else if(avg<65 && avg>=55){
				c='B';
			}
			else{
				c='C';
			}

		}
		else{
			System.out.println("You failed in the exam");
		}

		switch(c){

			case 'O':{

				System.out.println("First Class With distinction");
				break;}
			case 'A':{
				System.out.println("First Class");
				break;}
			case 'B':{
				System.out.println("Second Class");
				break;}
			case 'C':{
				System.out.println("Pass Class");
				break;}

		}
		
	}
}

