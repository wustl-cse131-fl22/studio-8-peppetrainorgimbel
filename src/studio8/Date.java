package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int date;
	private int month;
	private int year;
	private boolean holiday;
	
	/**
	 * Constructs instance variables to default
	 */
	public Date() {
		date = 1;
		month = 1;
		year = 2004;
		holiday = false;
	}
	
	/**
	 * Constructs class setting instance variables to parameters
	 * @param date, day of the month 1 to 31
	 * @param month, month 1 to 12
	 * @param year, year
	 * @param holiday, whether the day is a holiday or not
	 */
	public Date(int date, int month, int year, boolean holiday) {
		this.date = date;
		this.month = month;
		this.year = year;
		this.holiday = holiday;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return date == other.date && month == other.month && year == other.year;
	}

	public String toString() {
		return month + "/" + date + "/" + year + " Holiday? " + holiday;
	}

    public static void main(String[] args) {
    	Date mischa = new Date(28, 5, 2004, true);
    	Date today = new Date(17, 11, 2022, false);
    	Date best = new Date(28, 5, 2004, false);
    	
    	System.out.println(mischa.toString());
    	System.out.println(today.toString());
    	
    	System.out.println(mischa.equals(today));
    	System.out.println(mischa.equals(best));
    	
    	Date newYears = new Date(1, 1, 2023, true);
    	Date piDay = new Date(14, 3, 2015, true);
    	
    	LinkedList<Date> listOfDates = new LinkedList<Date>();
    	
    	listOfDates.add(0, newYears);
    	listOfDates.add(1, piDay);
    	listOfDates.add(2, mischa);
    	listOfDates.add(3, best);
    	listOfDates.add(4, today);
    	
    	System.out.println(listOfDates);
    	
    	HashSet<Date> setOfDates = new HashSet<Date>();
    	
    	setOfDates.add(newYears);
    	setOfDates.add(piDay);
    	setOfDates.add(mischa);
    	setOfDates.add(best);
    	setOfDates.add(today);
    	
    	System.out.println(setOfDates);
    	
    }

}
