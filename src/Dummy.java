import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dummy {

	public static void main(String[] args) {

		int[] actualInputArray = { 100, 80, 60, 70, 60, 75, 85 };
		int[] resultArray = new int[actualInputArray.length];

		for (int i = actualInputArray.length-1; i >= 0; i--) {
			
			int count = 1;
			for(int j = i-1;j>0;j--){
				if(actualInputArray[j] <= actualInputArray[i]){
					count++;
				}
				else{
					break;
				}
			}
			
			resultArray[i] = count;
		}
		
		for(int i = 0;i<resultArray.length;i++){
			System.out.print(resultArray[i] + " ");
		}
	}

}
