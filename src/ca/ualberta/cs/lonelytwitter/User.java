package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class User extends Object implements UserLike {		// adding "extends Object" changes absolutely nothing
	protected String username;
	protected ArrayList<String> friendArray = new ArrayList<String>();
	protected int friendNumber = 0;

	public String getUsername() {
		return username;
	}

	public abstract void setUsername(String x) throws IOException;

	public User(String username) {
		super();
		this.username = username;
	}
	
	// default setups
	public User() {
		super();
		this.username = "anonymous";
	}
	
}
