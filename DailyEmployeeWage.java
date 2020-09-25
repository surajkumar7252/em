
public class DailyEmployeeWage {
	public static void main(String[] args) {
		final int WagePerHour = 20;
		final int FullDayHour =8;
		System.out.println("Daily Employee Wage Calculation System");
		int Wage=WagePerHour*FullDayHour;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		if(empCheck!=0)
		System.out.println("Daily Wage ="+ Wage);
		else
			System.out.println("Employee Absent");
		
	

}
}