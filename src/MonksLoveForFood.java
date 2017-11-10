import java.util.Scanner;

public class MonksLoveForFood {

	static Integer[] STACK;
	static int TOP = -1;
	static int LIMIT = 100;

	public static void main(String[] args) {
		STACK = new Integer[LIMIT];

		Scanner scanQueries = new Scanner(System.in);
		int numberOfQueries = scanQueries.nextInt();
		String[] input = new String[numberOfQueries + 1];
		
		for (int i = 0; i <= numberOfQueries; i++) {
			input[i] = scanQueries.nextLine();
		}
		
		for (int i = 0; i <= numberOfQueries; i++) {
			String line = input[i];
			if(line.startsWith("2")){
				String[] split = line.split(" ");
				int cost = Integer.parseInt(split[1]);
				push(cost);
			}else{
				pop();
			}
		}
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
			System.out.println("No Food");
		} else {
			val = STACK[TOP];
			System.out.println(val);
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
