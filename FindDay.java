import java.util.Scanner;
class FindDay{
	public static void main(String args[]){
		//Variables for getting input
		int day, month, year;
		
		int factor;

		//Cumulative sum of months
		int month_days[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		
		//Day names
		String day_names[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		//Initializing scanner class
		Scanner input = new Scanner(System.in);

		//Getting input from user
		System.out.print("Enter the day:");
		day = input.nextInt();
		System.out.print("Enter the month:");
		month = input.nextInt();
		System.out.print("Enter the year:");
		year = input.nextInt();
		
		
		//This is to check whether the given date includes a febraury
		if(month > 2){
			factor = 0;
		}
		else{
			factor = 1;
		}
		
		//since days are cyclic modulo is used
		var dayValue = month_days[month - 1] + (year - 1) % 7 + ((year - factor) / 4 - (year - factor) / 100 + (year - factor) / 400) + day;
		
		System.out.print(day + "/" + month +"/" + year + " is " + day_names[dayValue % 7]);
	}
}