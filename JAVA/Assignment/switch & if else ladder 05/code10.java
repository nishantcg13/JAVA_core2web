class p10{


	public static void main(String[] args){

		int a=250000;
		int c=0;

		if (a<=250000 && a>=200000){

			c=1;
		}

		else if(a<200000 && a>=150000){
			c=2;
		}

		else if(a<150000 && a>=120000){
			c=3;
		}

		else if(a<120000 && a>=80000){
			c=4;
		}
		else{
			c=5;
		}

		switch(c){

			case 1:{
				       System.out.println("KTM RC 200");
				       break;
			}
			case 2:{
				       System.out.println("NS 200");
				       break;
			}
			case 3:{
				       System.out.println("NS 160");
				       break;
			}
			case 4:{
				       System.out.println("NS 125");

				       break;
			}
			case 5:{
				       System.out.println("Discover 100");
				       break;
			}
		}
	}
}
