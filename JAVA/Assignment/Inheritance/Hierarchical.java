/*
 * Example of Hierarchical Inheritance
 *
 * */


class PUBG{

	PUBG(){
		System.out.println("PUBG");
	}
}

class PUBGKR extends PUBG{

	PUBGKR(){
		System.out.println(" PUBG Korean Version");
	}
}

class BGMI extends PUBG{

	BGMI(){
		System.out.println("PUBG Indian Version");
	}
}

class PUBGPC extends PUBG{

	PUBGPC(){
		System.out.println("PUBG PC Version");
	}
}
