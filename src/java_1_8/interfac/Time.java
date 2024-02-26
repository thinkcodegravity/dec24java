package java_1_8.interfac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current Date="+today);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+time);
		
		LocalTime timegmt= LocalTime.now(ZoneId.of("GMT"));
		System.out.println("Current Time in GMT="+timegmt);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
	}

}
