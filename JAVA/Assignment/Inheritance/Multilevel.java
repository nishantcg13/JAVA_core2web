/*
 * Example of Multilevel Inheritance
 *
 * */



class ICC{

	ICC(){
		System.out.println("International Cricket Council");
	}
}

class BCCI extends ICC{

	BCCI(){
		System.out.println("Board of Control for Cricket In India");
	}
}

class IPL extends BCCI{

	IPL(){
		System.out.println("Indian Premier League");
	}
}
