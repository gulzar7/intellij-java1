import java.util.*;
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
		Scanner sc = new Scanner(System.in);


		System.out.println("enter two integer numbers : ");





        

		int sum1 = ob.add(sc.nextInt(),sc.nextInt());
		System.out.println("sum of the two integer value :" + sum1);

		System.out.println("enter two decimal numbers : ");
		double sum2 = ob.add(sc.nextDouble(),sc.nextDouble());
		System.out.println("sum of the three integer value :" + sum2);

		System.out.println("enter two float numbers : ");
		float mult1 = ob.multiply(sc.nextFloat(),sc.nextFloat());
		System.out.println("multiplication of two float value:" + mult1);

		System.out.println("enter two integer numbers");
		int mult2 = ob.multiply(sc.nextInt(),sc.nextInt());
		System.out.println("multiplication of two integer value:" + mult2);

		System.out.println("enter two strings :\n");

		String conct1 = ob.concat(sc.nextLine(),sc.nextLine());
		System.out.println("concat of two string:" + conct1);

		System.out.println("enter three strings :");
		String conct2 = ob.concat(sc.nextLine(),sc.nextLine(),sc.nextLine());
		System.out.println("concat of three string: " + conct2);
	}
}
