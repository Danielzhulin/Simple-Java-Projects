/**
 * Project: Lab4
 * File: DateTimeUtil.java
 * Date: Sep 30, 2018
 * Time: 6:34:01 PM
 */
package a01077579;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Date Time process class
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class DateTimeUtil {
	private static final String JOIN_DATE_PATTERN = "MMM dd uuuu";
	private static final String INPUT_DATE_PATTERN = "uuuuMMdd";

	/**
	 * 
	 */
	public DateTimeUtil() {
	}

	/**
	 * Generate the format string from a LocalDate
	 * 
	 * @param date
	 *            - to generte formated string from
	 * @return
	 */
	public static String getFormatedDateString(LocalDate date) {

		if (date == null) {
			return null;
		}
		DateTimeFormatter dateTimeForatter = DateTimeFormatter.ofPattern(JOIN_DATE_PATTERN);
		return date.format(dateTimeForatter);
	}

	/**
	 * @param string
	 * @return
	 * @throws ApplicationException
	 */
	public static LocalDate getJoinDate(String string) throws ApplicationException {
		LocalDate localDate = null;
		// String anotherDateString = "20150823";
		if (string == null || string.equals("") || string.length() != 8) {
			throw new ApplicationException("Error of joit data, plase make sure the valid format: " + INPUT_DATE_PATTERN);
		}

		int year = Integer.parseInt(string.substring(0, 4));
		if (year < 1500 || year > 2019) {
			throw new ApplicationException("Invalid value for Year: " + year);
		}
		int monthIndex = 4;
		// if (string.charAt(4) == '0') {
		// monthIndex++;
		// }
		int month = Integer.parseInt(string.substring(monthIndex, 6));

		int dayIndex = 6;
		// if (string.charAt(6) == '0') {
		// dayIndex++;
		// }
		if (month < Month.JANUARY.getValue() || month > Month.DECEMBER.getValue()) {
			throw new ApplicationException("Invalid value for Month(valid value 01-12): " + month);
		}
		int day = Integer.parseInt(string.substring(dayIndex));

		try {
			localDate = LocalDate.of(year, Month.of(month), day);
		} catch (DateTimeException e) {
			throw new ApplicationException("Invalid value for DayofMonth(valid value 1-28/31): " + day);
		}
		return localDate;
	}

	/**
	 * This is a old method for get a LocalDate from String, should not be used any more
	 * 
	 * @param string
	 * @return
	 * @throws ApplicationException
	 */
	@Deprecated
	public static LocalDate getJoinDateFromString(String string) {
		LocalDate localDate = null;
		@SuppressWarnings("unused")
		DateTimeFormatter dateTimeForatter = DateTimeFormatter.ofPattern(INPUT_DATE_PATTERN);
		int year = Integer.parseInt(string.substring(0, 4));
		int monthIndex = 4;
		int month = Integer.parseInt(string.substring(monthIndex, 6));
		int dayIndex = 6;
		int day = Integer.parseInt(string.substring(dayIndex));
		localDate = LocalDate.of(year, month, day);
		return localDate;
	}

}
