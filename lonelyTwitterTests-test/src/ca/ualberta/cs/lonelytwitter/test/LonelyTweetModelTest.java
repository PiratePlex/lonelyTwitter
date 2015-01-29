package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSample()
	{
		//fail("This is a failing test");
		//assertTrue("This is false", true);
		//assertFalse("This is false", isGreaterThan(5,6));
		assertEquals("5 is equal to 5",5,5);
	}
	
	public void testEquals()
	{
		Date date = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("Hello", new Date(123));
		NormalTweetModel tweet2 = new NormalTweetModel("Hello", new Date(123));
		assertTrue("Different tweets", tweet1.equals(tweet2));
	}
	public void testEquals2()
	{
		Date date = new Date();
		ImportantTweetModel tweet1 = new ImportantTweetModel("Hello", date);
		NormalTweetModel tweet2 = new NormalTweetModel("Hello", date);
		assertFalse("Different tweets", tweet2.equals(tweet1));
	}
	
	
	private boolean isGreaterThan(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return true;
		else
			return false;
	}
}
