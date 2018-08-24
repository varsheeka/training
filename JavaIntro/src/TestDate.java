
public class TestDate {

	public static void main(String[] args) {
		Date date1=new Date();
		Date date2=new Date(4, "Sept", 2018);
		
		date1.setDay(8);
		date1.setMonth("July");
		date1.display();
		date2.display();
		
	}

}
