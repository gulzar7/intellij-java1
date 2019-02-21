class bank {

 void getDetails()
	 {
		 System.out.println("It is a method of class Bank");
		 System.out.println("ROI:"+8.2+"%");
	 }

 }
class SBI extends bank{
	void getDetails()
	{
		System.out.println("It is a method of class SBI");
		System.out.println("ROI:"+9.7+"%");
	}

}

class BOI extends bank{
	void getDetails()
	{
		System.out.println("It is a method of class BOI");
		System.out.println("ROI:"+7.1+"%");
	}

}
class ICICI extends bank {
	void getDetails() {
		System.out.println("It is a method of class ICICI");
		System.out.println("ROI:" + 8.6 + "%");
	}



	public static void main(String[] args) {
		bank obj1 = new bank();
		obj1.getDetails();

		SBI obj2 = new SBI();
		obj2.getDetails();

		BOI obj3 = new BOI();
		obj3.getDetails();

		ICICI obj4 = new ICICI();
		obj4.getDetails();
	}

}