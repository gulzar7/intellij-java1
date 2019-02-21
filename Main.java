import java.lang.*;
public class Main {


	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.disp();
		System.out.println("\n");

		duplicate emp2 = new duplicate();
       emp2.duplicate();
		System.out.println("\n");

		qus3 q3 = new qus3();
       q3.qus3();
		System.out.println("\n");

		qus4 q4 = new qus4();
		q4.qus4("Welcome to TO the NEW 100%");
		System.out.println("\n");

		qus5 q5 = new qus5();
		q5.qus5();
		System.out.println("\n");

		qus6 q6 = new qus6();

		int a[] = {2, 3, 5, 4, 5, 3, 4};
		int n = a.length;
			System.out.println("Element occurring once is " +
					q6.qus6(a, n) + " ");
		
			System.out.println("\n");


			qus7 q7 = new qus7();
			q7.foo("Rajat","Singh",20);

		System.out.println("\n");


	}
}