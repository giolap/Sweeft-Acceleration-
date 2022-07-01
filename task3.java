
import acm.program.*;

public class task3 extends ConsoleProgram {

	private int notContains(int[] array) {
		int minValue = 0;
		int equals = 0;

		while (true) {
			equals = 0;
			minValue++;

			for (int i = 0; i < array.length; i++) {
				if (array[i] == minValue) {
					equals++;
					break;
				}

			}
			if (equals == 0)
				return minValue;
		}

	}

}
