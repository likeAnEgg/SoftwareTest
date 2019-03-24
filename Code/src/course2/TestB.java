package course2;

import org.junit.Assert;
import org.junit.Test;

public class TestB {
	@Test
    //≤‚ ‘ sub()∑Ω∑®
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(2, 1);
        Assert.assertEquals(result, 1);
    }

}
