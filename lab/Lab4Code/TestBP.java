

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;



public class TestBP {
	@Test
    public void testBP(){
		BackPack bp=new BackPack();
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
        bp.main(null);
        String  os="0"+"\t"+"0"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"4"+"\t"+"\r\n"
        		+"0"+"\t"+"0"+"\t"+"4"+"\t"+"5"+"\t"+"5"+"\t"+"5"+"\t"+"9"+"\t"+"9"+"\t"+"9"+"\t"+"9"+"\t"+"\r\n"
        		+"0"+"\t"+"0"+"\t"+"4"+"\t"+"5"+"\t"+"6"+"\t"+"6"+"\t"+"9"+"\t"+"10"+"\t"+"11"+"\t"+"11"+"\t"+"\r\n";
        Assert.assertEquals(os,outContent.toString());
    }

}
