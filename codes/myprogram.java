package best;

import java.util.Scanner;
import java.util.Random;

public class myprogram {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int[] arr = new int[5];
		Random r = new Random();
		int count1 = 0, count2 = 0;
		if ((a >= 1 && a <= 40) && (b >= 1 && b <= 40)) {
			for (int i = 0; i < 5; i++) {
				arr[i] = r.nextInt(41);
				System.out.print(arr[i] + " ");
			}

			for (int j = 0; j < 5; j++) {
				if (a == arr[j]) {
					count1 = 1;
				}
				if (b == arr[j]) {
					count2 = 1;
				}
			}
			if (count1 == 1 && count2 == 1) {
				System.out.println("Bingo");

			} else
				System.out.println("not found ");
		}

	}
}
