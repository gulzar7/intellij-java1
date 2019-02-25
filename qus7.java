import java.util.*;
public class qus7 {
	//This is a Static Method
	static void foo (String firstname, String lastname,int age)
	{

		System.out.println("firstname is: " + firstname);
		System.out.println("lastname is: " + lastname);
		System.out.println("age is: " + age);
	}

//static variables
		static String firstname;
		static String lastname;
		static int age;
		//static block
		static {
			System.out.println("Static Block 1");
			firstname = "";
			lastname = "";
			age = 0;
		}

	public static void main(String[] args) {
		qus7 q7 = new qus7();

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter first name: ");
		firstname = sc.nextLine();
		System.out.println("Enter last name:");
		lastname = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
		q7.foo(firstname,lastname,age);
	}
	}
