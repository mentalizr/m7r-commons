package org.mentalizr.commons;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {

    public static String currentTimestampAsISO() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        return zonedDateTime.format(DateTimeFormatter.ISO_INSTANT);
    }

    public static Date dateForISO(String iso) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(iso);
        return Date.from(zonedDateTime.toInstant());
    }

    public static String toIsoString(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("UTC"));
        return zonedDateTime.format(DateTimeFormatter.ISO_INSTANT);
    }

    public static String epochAsISO() {
        return "1970-01-01T00:00:00Z";
    }

    public static boolean isNotOlderThanOneMinute(String iso) {
        int minutes = 1;
        ZonedDateTime reference = ZonedDateTime.parse(iso);
        ZonedDateTime now = ZonedDateTime.now();
        Duration duration = Duration.between(reference, now);
        return duration.toMinutes() < minutes;
    }


}