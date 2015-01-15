package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweetModel {
	private String text;
	private Date timestamp;
	public String getText() {	// may throw RuntimeExcepptions, but not normal
		return text;
	}
	
	public LonelyTweetModel(String text) {
		super();	//calling constructor in the class object
		this.text = text;	//takes the text that was passed in as an argument and sets it to text
		timestamp = new Date();
	}
	
	public LonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public abstract Date getTimestamp();
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
