public class qus5 {
	public void qus5(){
		int[] arr1 = {5,6,1,8,9};
		int[] arr2 = {3,1,12,9,24,67,6};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		qus5 q5 = new qus5();
		q5.qus5();
	}
}
