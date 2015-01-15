package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Friends extends User {
	protected String username;
	public void addFriends(String username){
		this.friendArray.add(username);
		this.friendNumber += 1;
	}
	@Override
	public void setUsername(String x) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
