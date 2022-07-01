

import acm.program.*;

public class task4 extends ConsoleProgram {
	
	public void run() {
		while(true) {
		String s = readLine("enter: ");
		println(isProperly(s));
		}
	}
	
	Boolean isProperly(String sequence) {
		int leftCnt = 0;
		int rightCnt = 0;
		
		for (int i = 0; i < sequence.length(); i++) {
			if(sequence.charAt(i) == '(') {
				leftCnt++;
			}
			else if(sequence.charAt(i) == ')') {
				rightCnt++;
			}
			
		}
		if (rightCnt == leftCnt)
		return true;
		else return false;
	}
	
	
}

