package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour;
	public int minute;
	public boolean twelve;
	
	/**
	 * Constructs time class setting instance variables to default
	 */
	public Time() {
		hour = 0;
		minute = 0;
		twelve = false;
	}
	
	/**
	 * Constructs time class setting instance variables to give parameters
	 * @param hour, hour of the day 0 to 23
	 * @param minute, minute of the hour 0 to 59
	 * @param twelve, whether the time should be shown in 12 or 24 hour format
	 */
	public Time(int hour, int minute, boolean twelve) {
		this.hour = hour;
		this.minute = minute;
		this.twelve = twelve;
	}
	
	public String toString() {
		String min = minute + "";
		if(minute < 10) {
			min = "0" + min;
		}
		if(twelve) {
			if(hour > 12) {
				return (hour - 12) + ":" + min + " PM";
			}
		}
		return hour + ":" + min;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time now = new Time(13, 16, true);
		Time weed = new Time(16, 20, false);
		System.out.println(now.toString());
		System.out.println(weed.toString());
    	
		Time nowSame = new Time(13, 16, false);
		
		System.out.println(now.equals(weed));
		System.out.println(now.equals(nowSame));
		
		Time exam = new Time(12, 30, true);
		Time eleven = new Time(11, 11, false);
		
		LinkedList<Time> listOfTimes = new LinkedList<Time>();
		
		listOfTimes.add(eleven);
		listOfTimes.add(now);
		listOfTimes.add(nowSame);
		listOfTimes.add(weed);
		listOfTimes.add(exam);
		
		System.out.println(listOfTimes);
		
		HashSet<Time> setOfTimes = new HashSet<Time>();
    	
    	setOfTimes.add(eleven);
    	setOfTimes.add(now);
    	setOfTimes.add(nowSame);
    	setOfTimes.add(weed);
    	setOfTimes.add(exam);
    	
    	System.out.println(setOfTimes);
    }

}