



import java.util.ArrayList;

import acm.program.*;

public class task6 extends ConsoleProgram {
	
	
	public boolean remove(Object obj, ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(obj)) {
				list.remove(obj);
				return true;
			}
		}
		return false;
	}
	
}

