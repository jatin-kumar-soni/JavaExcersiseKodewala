
public class TimeValidation {
	private int hours, minutes, seconds;

	public TimeValidation(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if(hours>=0 && hours<=24)
		{
			this.hours = hours;
		}
		else {
			System.out.println("invalid hours");
			return;
		}
		
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if(minutes>=0 && minutes<=59)
		{
			this.minutes = minutes;
		}
		else {
			System.out.println("Invalid Minutes");
			return;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if(seconds>=0 && seconds<=59)
		{
			this.seconds = seconds;
		}
		else{
			System.out.println("invalid seconds");
			return;
		}
	}
	String getAMPM()
	{
		if(this.getHours()>12)
		{
			return "PM";
		}
		return "AM";
	}
	void displayTime()
	{
		System.out.println("Time is: "+this.getHours()+":"+this.getMinutes()+":"+this.getSeconds()+this.getAMPM());
		
	}
	
}
