import java.util.Scanner;

public class MonkAndPhilosophersStone {

	static int LIMIT = 10000000;
	static Integer[] HARRY_STACK = new Integer[LIMIT];
	static Integer[] MONK_STACK = new Integer[LIMIT];
	static int HARRY_TOP = -1;
	static int MONK_TOP = -1;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String numberOfCoins = scanner.nextLine();
		String coins = scanner.nextLine();
		String instructions = scanner.nextLine();
		
		String[] instructionsInArray = instructions.split(" ");
		int numberOfInstruction = Integer.parseInt(instructionsInArray[0]);
		int monksWealth = Integer.parseInt(instructionsInArray[1]);
		
		String[] actualInstructions = new String[numberOfInstruction];;
		int[] coinsArray = new int[Integer.parseInt(numberOfCoins)];
		
				
		initializeHarrysStack(coinsArray,coins);
		
		for (int i = 0; i < numberOfInstruction; i++) {
			actualInstructions[i] = scanner.nextLine();
		}

		int counter = 0;
		do {
			String ins = actualInstructions[counter];
			if (ins.equals("Harry")) {
				int popFromHarryStack = popFromHarryStack();
				pushInMonkStack(popFromHarryStack);
			}else if(ins.equals("Remove")){
				popFromMonkStack();
			}
			counter++;
		} while (!sumMonksArray(monksWealth));

		System.out.println(MONK_TOP+1);
	}
	
	public static boolean sumMonksArray(int monksWealth){
		int val = 0;
		boolean res = false;
		
		for(int i =0;i<=MONK_TOP ;i++){
			val = val + MONK_STACK[i];
		}
		
		if(val == monksWealth){
			res = true;
		}
		return res;
	}

	public static void initializeHarrysStack(int[] input,String coinsStr) {

		String[] coins = coinsStr.split(" ");
		for (int i = input.length - 1; i >= 0; i--) {
			pushInHarryStack(Integer.parseInt(coins[i]));
		}
	}

	public static void pushInHarryStack(Integer element) {
		if (HARRY_TOP == LIMIT) {
			System.out.println("Overflow");
		} else {
			HARRY_TOP = HARRY_TOP + 1;
			HARRY_STACK[HARRY_TOP] = element;
		}

	}

	public static int popFromHarryStack() {
		int val = -1;

		if (HARRY_TOP == -1) {
			System.out.println("No Food");
		} else {
			val = HARRY_STACK[HARRY_TOP];
			HARRY_TOP = HARRY_TOP - 1;
		}

		return val;
	}
	
	public static void pushInMonkStack(Integer element) {
		if (MONK_TOP == LIMIT) {
			System.out.println("Overflow");
		} else {
			MONK_TOP = MONK_TOP + 1;
			MONK_STACK[MONK_TOP] = element;
		}

	}
	
	public static int popFromMonkStack() {
		int val = -1;

		if (MONK_TOP == -1) {
			System.out.println("No Food");
		} else {
			val = MONK_STACK[MONK_TOP];
			MONK_TOP = MONK_TOP - 1;
		}

		return val;
	}
	
	

}
