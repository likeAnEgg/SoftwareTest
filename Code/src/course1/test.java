package course1;

import org.junit.*;

public class test {
	@Test
	    //���� add()����
	    public void testAdd(){
	        Calculator c = new Calculator();
	        int result = c.add(1, 2);
	        Assert.assertEquals(result, 3);
	    }
	@Test
	    //���� sub()����
	    public void testSub(){
	        Calculator c = new Calculator();
	        int result = c.sub(2, 1);
	        Assert.assertEquals(result, 1);
	    }
	    /*
	public static void main(String[] args) {
        Calculator c = new Calculator();
        //���� add()����
        int result = c.add(1, 2);
        if(result == 3){
            System.out.println("add()������ȷ");
        }
         
        //���� sub()����
        int result2 = c.sub(2, 1);
        if(result2 == 1){
            System.out.println("sub()������ȷ");
        }
         
    }*/

}
