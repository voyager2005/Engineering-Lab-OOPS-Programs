package lab8.date;

public class Main {
	public static void main(String[] args) {
        CurrentDate calendar = new CurrentDate();
        try {
            calendar.createDate();
        } catch (InvalidDayException | InvalidMonthException exp) {
            System.out.println(exp.getMessage());
        }
    }
}
