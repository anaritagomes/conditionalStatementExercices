import java.util.Scanner;

public class WeekdayWithMethod {
	//Write a Java program that keeps a number from the user and generates an integer 
	//between 1 and 7 and displays the name of the weekday.
	public static void main(String[] args) {
		System.out.println("Insert a number from 1 to 7");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		getDay(number);
		sc.close();
	}
	
	
	public static String getDay(int number){
		String day = null;
		
		switch(number) {
		   case 1 :
		     System.out.println("Monday");
		      	break;
		   case 2 :
			   System.out.println("Tuesday");
			      break;
		   case 3 :
			   System.out.println("Wednesday");
			      break;
		   case 4 :
			   System.out.println("Thursday");
			      break; 
		   case 5 :
			   System.out.println("Friday");
			      break;  
		   case 6 :
			   System.out.println("Saturday");
			      break;
		   case 7 :
			   System.out.println("Sunday");
			      break;
		}
		
		return day;
	}
}