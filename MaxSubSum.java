package Max;

import java.util.*;

public class MaxSubSum {


		public static void main(String args[]){
			
			Scanner s = new Scanner(System.in);
			
			int n;  n = s.nextInt();
			
			int []Array =new int[n+1];
			
			for (int i = 1; i < n+1; i++){
				Array[i] = s.nextInt();
			}
			
			System.out.println(maxsubsum(Array));
		}

		public static int maxsubsum(int[] array) {
			int maxSum = 0;
			int tempSum = 0;

			for (int i = 1; i < array.length; i++) {
				tempSum += array[i];

				if (tempSum > maxSum)
					maxSum = tempSum;
				else if (tempSum < 0)
					tempSum = 0;
			}
			return maxSum;
		}
}
