enum House {
	HA(900),HB(400),HC(200),HD(150),HE(1200);
	private int price;
	House(int p) {
		price = p;
	}
	int getPrice() {
		return price;
	}
}
public class qus9 {
	public static void main(String args[]){
		System.out.println("All house prices:");
		for (House c : House.values()) System.out.println(
				c + " costs " + c.getPrice() + " thousand dollars.");
	}
}

