package techscore;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseRetryExample {
	
	@Test()
	public void add() {
		System.out.println(">>>>>>>>>>>>>>>>");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void minus() {
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKK");
	}

}
