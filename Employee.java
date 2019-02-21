public class Employee{

	public void disp()
	{
		String str = "Welcome Welcome TO TTN";
		System.out.println( str.replace( 'W','Q' ) );
		System.out.println( str.replaceFirst("We", "QE") );
		System.out.println( str.replaceAll("We", "QA") );

	}




	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.disp();
		System.out.println("\n");
	}
}