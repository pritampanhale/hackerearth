import java.util.Scanner;

public class TheFootBallFest {

	static Integer[] STACK;
	static int TOP = -1;
	static int LIMIT = 100000;

	public static void main(String[] args) {
		STACK = new Integer[LIMIT];
		int lastPlayer = -1;
		Scanner scanQueries = new Scanner(System.in);
		int noUse = Integer.parseInt(scanQueries.nextLine());
		String firstLine = scanQueries.nextLine();
		String firstLineArray[] = firstLine.split(" ");
		int numberOfQueries = Integer.parseInt(firstLineArray[0]);
		int playerOne = Integer.parseInt(firstLineArray[1]);
		push(playerOne);

		String[] input = new String[numberOfQueries];

		for (int i = 0; i < numberOfQueries; i++) {
			input[i] = scanQueries.nextLine();
		}

		int i = 0;
		do {
			
			String line = input[i];
			if (line.startsWith("P")) {
				String[] passes = line.split(" ");
				push(Integer.parseInt(passes[1]));
			} else if (line.startsWith("B")) {
				lastPlayer = pop();
			} else {
				System.out.println("Player " + lastPlayer);
				String[] passes = line.split(" ");
				push(Integer.parseInt(passes[1]));
			}
			i++;
		} while (i < numberOfQueries);

		System.out.println("Player " + lastPlayer);
	}

	public static void push(Integer element) {
		if (TOP == LIMIT) {
			System.out.println("Overflow");
		} else {
			TOP = TOP + 1;
			STACK[TOP] = element;
		}

	}

	public static int pop() {
		int val = -1;

		if (TOP == -1) {
			System.out.println("UnderFlow");
		} else {
			val = STACK[TOP];
			// System.out.println(val);
			TOP = TOP - 1;
		}

		return val;
	}

	public static void showStack() {
		for (int i = 0; i <= TOP; i++) {
			System.out.print(STACK[i] + " ");
		}
		System.out.println();
	}
}
