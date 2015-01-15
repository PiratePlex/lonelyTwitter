package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Author extends User {
	@Override		// I think I'm overriding something please tell me if i'm not
	public void setUsername(String x) throws IOException{
		if (x.length() > 8){
			throw new IOException("Name too Long!");
		}
		this.username = x;
	}
	
}
