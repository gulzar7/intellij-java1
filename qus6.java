public class qus6 {
	static int qus6(int a[], int a_size) {


		// Do XOR of all elements and return
		int res = a[0];
		for (int i = 1; i < a_size; i++) {
			res = res ^ a[i];


		}
		return res;


	}

	public static void main(String[] args) {
		qus6 q6 = new qus6();

		int a[] = {2, 3, 5, 4, 5, 3, 4};
		int n = a.length;
		System.out.println("Element occurring once is " +
				q6.qus6(a, n) + " ");



	}
	}

