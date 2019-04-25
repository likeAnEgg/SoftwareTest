

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class TestBS {
	@Test
    public void testBS(){
		BubbleSort bs=new BubbleSort();
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
        bs.main(null);
        int rt[] = new int[]{1, 2, 2, 5, 6};  
        String  os=Arrays.toString(rt)+"\r\n";
        Assert.assertEquals(os,outContent.toString());
    }
}
