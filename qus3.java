import java.util.*;
public class qus3 {
	String str;
	String word;
public void qus3()
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string:");
	str = sc.nextLine();
	System.out.println("Length Of String:" + str.length());
	System.out.println("Enter a word to replace");
	word = sc.nextLine();

	System.out.println("Length Of String Without word :"+word+" is " + str.replace(word,"").length());
	int charcount = str.length() - str.replaceAll(word, "").length();
	System.out.println("Occurrence Of A Char In String: " + charcount);
		}

	public static void main(String[] args) {
		qus3 q3 = new qus3();
		q3.qus3();
	}
	}
