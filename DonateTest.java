import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DonateTest {
	
	@Test
	public void testEmptyUserName() {
        // initialize object
		Fund f = new Fund(100);

        // set up object *without* using donate() method
        f.balance = 50;
        f.donors.add("Snoopy");

        // call method we're testing with appropriate inputs
		int result = f.donate("", 10);

        // check output
        assertEquals(0, result); // return value should be 0

        // check side effects
        assertEquals(50, f.balance); // balance should not change
        assertEquals(1, f.donors.size()); // number of donors should not change
        assertTrue(f.donors.contains("Snoopy")); // names of donors should not change
	}
	
}
