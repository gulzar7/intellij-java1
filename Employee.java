import java.util.*;
public class Employee{
String name;
String word;
String newword;
	public void disp()
	{
		Scanner sc = new Scanner(System.in);


			System.out.println("enter the string : ");
			name = sc.nextLine();
		System.out.println("given string:" +name);
		System.out.println("enter a word to replace:");
		word = sc.nextLine();
                System.out.println("enter a word to replace with:");
		newword = sc.nextLine();
		System.out.println( name.replace( word,newword ) );


	}




	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.disp();
		System.out.println("\n");
	}
}
