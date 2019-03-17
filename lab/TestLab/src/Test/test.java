package Test;

import Lab1.TakeMoney;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class test {
	private int input;
	private boolean output;
	private TakeMoney tm=null;
	
	public test(int x,boolean y){
		this.input=x;
		this.output=y;
	}
	
	@Before
	public void setUp(){
		tm=new TakeMoney(); 
	}
	
	@Test
	public void check(){
		Assert.assertEquals(tm.getBool(input), this.output);		
	}
	
	@Parameters
	public static Collection<Object[]> getDate(){
		return Arrays.asList(new Object[][]{
			{-12,false},
			{0,true},
			{2,true},
			{40,false},
			{65,false},
			{73,true},
			{85,false}
		});		
	}

	
	
}
