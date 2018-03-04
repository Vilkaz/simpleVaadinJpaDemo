package de.vilkas.jpaDemo.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by Vilkas on 04/03/2018.
 */
public class LocalDateFormatter {

    private static  DateTimeFormatter formatter = createFormatter();

    public static String format(LocalDate date) {
        return date.format(formatter);
    }

    private static DateTimeFormatter createFormatter() {
        return DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(Locale.GERMANY);
    }
}
