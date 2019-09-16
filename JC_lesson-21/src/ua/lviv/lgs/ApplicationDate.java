package ua.lviv.lgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ApplicationDate {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		System.out.println("------------------------");

		System.out.println(convertToLocalDate(date));
		System.out.println(convertToLocalTime(date));
		System.out.println(convertToLocalDateTime(date));
	}

	public static LocalDate convertToLocalDate(Date date) {
		LocalDate localDate = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}

	public static LocalTime convertToLocalTime(Date date) {
		LocalTime localTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalTime();
		return localTime;
	}

	public static LocalDateTime convertToLocalDateTime(Date date) {
		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		return localDateTime;
	}
}
