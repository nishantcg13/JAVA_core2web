class DayDate{

	public static void main(String[] args){

		byte date = 04;
		byte month = 06;
		int year = 2024;

		System.out.println("Today's date is "+ date +"/"+ month+"/"+year);
		int secday =86400;
		int secmonth = 2592000;
		int secyear = 31536000;

		System.out.println("Second in a day = "+secday);
		System.out.println("Second in a month = "+secmonth);
		System.out.println("Second in a year = "+secyear);
	}
}
