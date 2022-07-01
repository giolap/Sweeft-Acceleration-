



import acm.program.*;

public class task5 extends ConsoleProgram {
	
	public void run() {
		
	}
	
	
	int countVariants(int stearsCount) {
		int[] stear = new int[stearsCount+1];
		stear[0] = 1;
		stear[1] = 1;
		for (int i = 0; i <= stearsCount; i++) {
			stear[i] = stear[i-1] + stear[i-2];
		}
		return stear[stearsCount];
	}
	
	
}

