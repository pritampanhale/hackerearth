import java.util.Scanner;

public class SignalRange {

	public static void main(String[] args) {

		Scanner scanQueries = new Scanner(System.in);
		int testCases = Integer.parseInt(scanQueries.nextLine());

		String[] numberOfInputString = new String[testCases];
		String[] actualInputString = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			numberOfInputString[i] = scanQueries.nextLine();
			actualInputString[i] = scanQueries.nextLine();
		}

		for (int k = 0; k < testCases; k++) {
			int numberOfInput = Integer.parseInt(numberOfInputString[k]);
			String[] actualInputArrayString = actualInputString[k].split(" ");
			int[] actualInputArray = new int[numberOfInput];
			int[] resultArray = new int[numberOfInput];

			for (int i = actualInputArray.length - 1; i >= 0; i--) {
				actualInputArray[i] = Integer.parseInt(actualInputArrayString[i]);
			}

			for (int i = actualInputArray.length - 1; i >= 0; i--) {

				int count = 1;
				for (int j = i - 1; j > 0; j--) {
					if (actualInputArray[j] <= actualInputArray[i]) {
						count++;
					} else {
						break;
					}
				}

				resultArray[i] = count;
			}
			for (int i = 0; i < resultArray.length; i++) {
				System.out.print(resultArray[i] + " ");
			}
			System.out.println();
		}

	}
}
