package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	public TweetList()
	{
		tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
		
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
	
	public int getCount()
	{
		return count;
	}
	public void addTweet(LonelyTweetModel tweet)
	{
		/*for (int index = 0; index < tweetList.size(); index++)
		{
			if (tweet.equals(tweet))
		}*/
		
		if (tweetList.contains(tweet)){
			throw new IllegalArgumentException("Tweet Exists Already");
		}
		
		count++;
		tweetList.add(tweet);
	}
}
