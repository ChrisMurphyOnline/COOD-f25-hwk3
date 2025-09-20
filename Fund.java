import java.util.Set;
import java.util.TreeSet;

/*
Implementation of a class that attempts to track donations to a fund.

DO NOT ASSUME THIS IMPLEMENTATION IS CORRECT! You should only use it for
running your test cases.
 */

public class Fund {
	
	private final int target;
	protected int balance = 0;
	protected Set<String> donors = new TreeSet<>();
	
	public Fund(int target) { 
		this.target = target;
	}
	 
	public int donate(String user, int donation) {
		
		if (user.isBlank()) {
			return 0;
		}

        if (user == null) {
            return 0;
        }

		if (donation < 0) {
			return 0;
		}
		
		if (balance < 0) {
			return -1;
		}

		// how much is required to meet the target
		int remaining = target - balance; 
		
		if (remaining > 0) {  // if the target has not been reached
			if (donation < remaining) { // if amount would not reach target
				balance += donation;
			}
			else { // if amount would exceed target
				donation = remaining;
				balance += target;
			}
			donors.add(user);
			return donation;
		}
		else { // if target has already been reached
			return 0;
		}
		
	}
}
