
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();

		int[] array = new int[arraySize];

		Scanner scanNumber = new Scanner(System.in);

		for (int i = 0; i < arraySize; i++) {
			array[i] = scanNumber.nextInt();
		}
		
		
		for (int i = arraySize-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
