package Things;

public class CollegeEvent extends Events {
	protected String collageName;
	protected String nameOfEvent;
	protected String guest;

	void eventInformation() {
		super.budget=400;
		super.eventName="dasara";
		super.eventType="state event";
		System.out.println("event name is:"+super.eventName);
		System.out.println("event type is:"+super.eventType);
		System.out.println("event budget is:"+super.budget);
		
		
	}
}
