package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;
import android.test.ViewAsserts;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTests extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTests() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSendText(){
		String text = "Hello world";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.NORMAL);
		assertEquals("got the text?", text, activity.getText());
	}
	
	public void testDoubleText(){
		String text = "Hello world";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.DOUBLE);
		assertEquals("double text?", text+text, activity.getText());
	}
	public void testDisplayText(){
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText); 		
		assertEquals("correct text?", text, view.getText());
	}
	public void testReverseText(){
		String text = "Hello world";
		String checkText = new StringBuilder(text).reverse().toString();
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.REVERSE);
		TextView view = (TextView) activity.findViewById(R.id.intentText); 		
		assertEquals("correct text?", checkText, view.getText());
	}
	public void testDefaultMessage(){
		String checkText = "No text sent";
		IntentReaderActivity activity = startWithText(null,
				IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText); 		
		assertEquals("correct text?", checkText, view.getText());
	}
	public void testTextViewVisable(){
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.NORMAL);
		View current = activity.getWindow().getDecorView();
		TextView checkView = (TextView) activity.findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(current, checkView);
	}
	private IntentReaderActivity startWithText(String text, int mode){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}
