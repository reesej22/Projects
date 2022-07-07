package part2;

public enum Hours {
	MONDAY(1, "7am - 3pm"), TUESDAY(2, "8am - 4pm"), WEDNESDAY(3, "9am - 5pm"), THURSDAY(4, "10am - 6pm"),
	FRIDAY(5, "11am - 5pm"), SATURDAY(6, "6am - 6pm"), SUNDAY(7, "Closed");

	private final int day;
	private final String hours;

	Hours(int day, String hours) {
		this.day = day;
		this.hours = hours;
	}

	public int getDay() {
		return day;
	}

	public String getHours() {
		return hours;
	}
}