
public class Date {

	private int day, year;
	private String month;
	
	public Date(){
		 day=1;month="jan";year=1996;
	}
	
	public Date(int day, String month, int year){
		 this.day=day; this.month=month;this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	public void display() {
		System.out.println("Date:"+day +month +year);
	}
}
