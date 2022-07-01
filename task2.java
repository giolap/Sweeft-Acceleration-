
import acm.program.*;

public class task2 extends ConsoleProgram {

	private final static int NeededMoney = 529;
	private final static int fifty = 50;
	private final static int twenty = 20;
	private final static int ten = 10;
	private final static int five = 5;
	private final static int one = 1;

	private int minSplit(int x) {
		int counter = 0;
		int currentMoney = 0;
		while (currentMoney < NeededMoney) {

			if (currentMoney + fifty <= NeededMoney) {
				currentMoney += fifty;
				counter++;
			} else if (currentMoney + twenty <= NeededMoney) {
				currentMoney += twenty;
				counter++;
			} else if (currentMoney + ten <= NeededMoney) {
				currentMoney += ten;
				counter++;
			} else if (currentMoney + five <= NeededMoney) {
				currentMoney += five;
				counter++;
			} else if (currentMoney + one <= NeededMoney) {
				currentMoney += one;
				counter++;
			}
			println(currentMoney);
		}
		return counter;

	}

}
