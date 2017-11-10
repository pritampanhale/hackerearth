
public class Test {

	public static void main(String[] args) {
		int arr[] = new int[5];
		test1(arr);
		showArra(arr);
		test2(arr);
		showArra(arr);
	}

	private static void test1(int arr[]) {
		arr[0] = 12;
	}

	private static void test2(int arr[]) {
		arr[1] = 13;
	}
	
	private static void showArra(int arr[]) {
		for(int a : arr){
			System.out.print(a + " ");
		}
	}
	

}
