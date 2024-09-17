package lab8.date;

import java.util.Scanner;

//Custom exception for invalid day
class InvalidDayException extends Exception {
	public InvalidDayException(String message) {
		super(message);
	}
}

//Custom exception for invalid month
class InvalidMonthException extends Exception {
	public InvalidMonthException(String message) {
		super(message);
	}
}

public class CurrentDate {
	private int day; 
	private int month; 
	private int year; 
	
	// Method to create date by reading values from keyboard
    public void createDate() throws InvalidDayException, InvalidMonthException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        day = scanner.nextInt();
        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        System.out.print("Enter month: ");
        month = scanner.nextInt();
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }

        System.out.print("Enter year: ");
        year = scanner.nextInt();

        System.out.println("Date is valid: " + day + "/" + month + "/" + year);
    }
}
