import java.util.Scanner;

public class TwoDimentionArrayReverse {

	public static void main(String[] args) {

		Scanner scanNumber = new Scanner(System.in);
		String size = scanNumber.nextLine();

		String[] split = size.split(" ");
		int row = Integer.parseInt(split[0]);
		int column = Integer.parseInt(split[1]);
		Integer[][] twoDArray = new Integer[row][column];

		for (int i = 0; i < row; i++) {
			String strNumbers = scanNumber.nextLine();
			String[] numbers = strNumbers.split(" ");
			
			for(int j = 0; j<column ;j++){
				twoDArray[i][j] = Integer.parseInt(numbers[j]);
			}
		}
		
		Integer[][] transposeArr = new Integer[column][row]; 
		
		int transRow = column;
		int transCol = row;
		
		for (int i = 0; i < transRow; i++) {
			for(int j = 0; j<transCol ;j++){
				transposeArr[i][j] = twoDArray[j][i];
			}
		}
		
		for (int i = 0; i < transRow; i++) {
			for(int j = 0; j<transCol ;j++){
				System.out.print(transposeArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
