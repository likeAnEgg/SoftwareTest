package course2;

import org.junit.Assert;
import org.junit.Test;

public class TestA {
	@Test
    //≤‚ ‘ add()∑Ω∑®
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(result, 3);
    }

}
