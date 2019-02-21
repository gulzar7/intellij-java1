public class qus10 {
	//adding two integer number
	int add(int a, int b)
	{
		return a+b;
	}
	//adding two double number
	double add(double a, double b)
	{
		return a+b;
	}
	//multiplication of two float number
	float multiply(float a, float b)
	{
		return a*b;
	}
	//multiplication of two int number
	int multiply(int a, int b)
	{
		return a*b;
	}
	public static String concat(String s1, String s2)
	{
		return new StringBuilder(s1).append(s2).toString();
	}
	public static String concat(String s1, String s2, String s3)
	{
		return s1.concat(s2).concat(s3);
	}
}
class qus10n {
	public static void main (String[] args) {

		qus10 ob = new qus10();

		int sum1 = ob.add(1,2);
		System.out.println("sum of the two integer value :" + sum1);
		double sum2 = ob.add(1.2,2.3);
		System.out.println("sum of the three integer value :" + sum2);
		float mult1 = ob.multiply(3,5);
		System.out.println("multiplication of two float value:" + mult1);
		int mult2 = ob.multiply(5,8);
		System.out.println("multiplication of two integer value:" + mult2);
		String conct1 = ob.concat("A","B");
		System.out.println("concat of two string: " + conct1);
		String conct2 = ob.concat("A","B", "C");
		System.out.println("concat of three string: " + conct2);
	}
}
