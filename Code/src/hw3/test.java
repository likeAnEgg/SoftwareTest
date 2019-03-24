package hw3;

import org.junit.*;

public class test {
	PrintPrimes pp = null;
	@Before
	public void setup(){
		pp = new PrintPrimes();
	}
	
	@Test
	    public void testPrintPrimes(){
	        pp.printPrimes(5);
	    }

}