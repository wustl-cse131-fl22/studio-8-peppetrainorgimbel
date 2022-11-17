package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public String toString() {
		return "Date: " + date.toString() + " Time: " + time.toString() + "\n";
	}


	public static void main(String[] args) {
		Appointment csClass = new Appointment(new Date(22, 11, 2022, false), new Time(13, 0, true));
		Appointment officeHours = new Appointment(new Date(17, 11, 2022, false), new Time(18, 0, true));
		Appointment mechE = new Appointment(new Date(17, 11, 2022, false), new Time(14, 30, true));
		Appointment calc = new Appointment(new Date(18, 11, 2022, false), new Time(11, 0, false));
		
		LinkedList<Appointment> calender = new LinkedList<Appointment>();
		
		calender.add(csClass);
		calender.add(officeHours);
		calender.add(mechE);
		calender.add(calc);
		
		System.out.println(calender);
	}

}
