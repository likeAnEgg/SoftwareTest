package course2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Ptest {
	private int input1;
	private int input2;
	private int output;
	private Calculator cal=null;
	
	public Ptest(int x,int y,int z){
		this.input1=x;
		this.input2=y;
		this.output=z;
	}
	
	@Before
	public void setUp(){
		cal=new Calculator();
	}
	
	@Test
	public void test(){
		Assert.assertEquals(cal.add(input1, input2), this.output);		
	}
	
	@Parameters
	public static Collection<Object[]> getDate(){
		return Arrays.asList(new Object[][]{
			{1,1,2},
			{2,3,5},
			{7,9,16},
			{78,-43,35},
			{0,0,0}
		});		
	}

}
