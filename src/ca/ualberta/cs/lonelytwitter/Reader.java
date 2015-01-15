package ca.ualberta.cs.lonelytwitter;

public class Reader extends User {
	@Override		// I think I'm overriding something please tell me if i'm not
	public void setUsername(String x) {
		if (x.length() <= 8){
			throw new RuntimeException("Name too short!");
		}
		this.username = x;
	}
}
