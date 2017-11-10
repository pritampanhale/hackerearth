package hackerearth;

import java.util.HashSet;
import java.util.Set;

public class NumberTrangle {
	
	public static class MyPair{
		int max;
		int min;
		
		public MyPair(int max , int min) {
			this.max = max;
			this.min = min;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + max;
			result = prime * result + min;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyPair other = (MyPair) obj;
			if (max != other.max)
				return false;
			if (min != other.min)
				return false;
			return true;
		}
		
	}

	public static void main(String[] args) {
		Set<MyPair> set = new HashSet<>();

		int[] inputArray = { 3,2,1 };
		int numberOfInput = inputArray.length;

		for (int k = 0; k < numberOfInput; k++) {
			for (int i = k; i < numberOfInput; i++) {
				
				int max=-1, min = -1;
				
				for (int j = k; j <= i; j++) {
					if(inputArray[j] > max){
						min = max;
						max = inputArray[j];
					}else if(inputArray[j] < max && inputArray[j] > min){
						min = inputArray[j];
					}
				}
				if(max!=-1 && min!=-1){
					MyPair m = new MyPair(max, min);
					set.add(m);
				}
			}
		}
		
		System.out.println(set.size());
	}
}
