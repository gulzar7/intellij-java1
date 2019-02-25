
import java.util.*;
public class qus8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


		System.out.println("enter the string : ");
		String value = sc.nextLine();
	StringBuffer b1 = new StringBuffer(value);
		System.out.println("String is:" +b1);
		b1.reverse();
		System.out.println("Reverse String :"+b1);
		b1.delete(4,8);
		System.out.println("string after deleting index :"+b1);





	}
}
