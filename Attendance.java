
public class Attendance {
public static void main(String[] args) {
	final int EMPLOYEE=1;
	System.out.println("Employee Attendance check");
	int a= (int)Math.floor(Math.random()*10)%2;
	if(a==EMPLOYEE)
		System.out.println("Employee is present");
	else
		System.out.println("Employee is absent");
	}
}
