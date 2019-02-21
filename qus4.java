public class qus4 {
	public void qus4(String input)
	{
		int totalChar = input.length();
		int uc = 0;
		int lc = 0;
		int lcc= 0;
		int digits = 0;
		int others = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uc++;
			}
			else if (Character.isLowerCase(ch)) {
				lc++;

			}
			else if (Character.isDigit(ch)) {
				digits++;
			}
			else {
				others++;
			}
		}
		double ucPercent = (uc * 100) / totalChar;
		double lcPercent = (lc * 100) / totalChar;
		double digitsPercent = (digits * 100) / totalChar;
		double otherCharPercent = (others * 100) / totalChar;

		System.out.println("Input '" + input + "' : ");
		System.out.println("Uppercase letters are " + ucPercent + "% ");
		System.out.println("Lowercase letters are " + lcPercent + "%");
		System.out.println("Digits Are " + digitsPercent + "%");
		System.out.println("Other Characters Are " + otherCharPercent + "%");
	}

	public static void main(String[] args) {
		qus4 q4 = new qus4();
		q4.qus4("Welcome to TO the NEW 100%");
	}
}
