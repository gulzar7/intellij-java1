public class duplicate {
	public void duplicate() {
		int count = 1;

		String value = "This is testing testing or or Program testing Program";


		value = value.toLowerCase();
		String item[] = value.split(" ");
		for (int i = 0; i < item.length; i++) {

			for (int j = i + 1; j < item.length; j++) {
				if (item[i].equals(item[j])) {
					count += 1;
					item[j] = "0";
				}
			}
			//if(!"0".equals(item[i]))
			if (item[i] != "0")
				System.out.println(item[i] + "-----" + count);
			count = 1;


		}
	}

	public static void main(String[] args) {


		duplicate emp2 = new duplicate();
		emp2.duplicate();
	}
}

