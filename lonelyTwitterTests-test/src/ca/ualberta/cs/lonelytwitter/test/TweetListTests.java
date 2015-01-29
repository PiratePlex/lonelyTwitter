package ca.ualberta.cs.lonelytwitter.test;
import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		//ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("Tweet List not initalized", tweetlist.getTweets());
	}
	public void testCounts(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		assertEquals("this should be zero", 1, tweetList.getCount());
	}
	public void testAddTweet(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		NormalTweetModel tweet2 = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		try {
			tweetList.addTweet(tweet2);
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("Didn't throw.");
	}
	

}
