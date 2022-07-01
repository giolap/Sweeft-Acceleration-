
import acm.program.*;

public class task1 extends ConsoleProgram {

	Boolean isPalindrome(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != text.charAt(text.length() - 1)) {
				return false;
			}
		}
		return true;
	}
}
