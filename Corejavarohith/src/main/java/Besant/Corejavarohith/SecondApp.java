package Besant.Corejavarohith;
import java.time.*;

public class SecondApp {
//	public SecondApp(int a, int b) {
//		int c=a+b;
//		System.out.println(c);
//	}
//
//	public SecondApp() {
//		System.out.println("hello");
//	}

	public void MyNameWithParam(String Name,int age)
	{
		System.out.println(Name+age);
	}

	public void phon(int num) {
		if(num == 91) {
			System.out.println("Indian Num");
		}else {
			System.out.println("Not Indian Num");
		}
	}

	public void age(String args[])  
	{
		LocalDate dob = LocalDate.of(2002, 10, 25);   
		LocalDate curDate = LocalDate.now();  
		Period period = Period.between(dob, curDate);
		System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
	}
	
	public static void main(String[] args) {
		
		SecondApp Sc = new SecondApp();
					Sc.MyNameWithParam("Rohith",21);
					Sc.age(args);
					Sc.phon(99);
				}
			
	}

