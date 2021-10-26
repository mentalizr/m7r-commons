package org.mentalizr.commons;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DatesTest {

    @Test
    void getISOForNow() {
        Instant nowInstantPre = Instant.now();

        String isoNow = Dates.currentTimestampAsISO();
        System.out.println(isoNow);

        Date now = Dates.dateForISO(isoNow);
        System.out.println(now);

        Instant nowInstantPost = now.toInstant();

        long diff = nowInstantPost.toEpochMilli() - nowInstantPre.toEpochMilli();
        assertTrue(nowInstantPost.isAfter(nowInstantPre) || diff == 0);

        Duration duration = Duration.between(nowInstantPre, nowInstantPost);
        assertTrue(duration.toMinutes() < 1);
    }

    @Test
    void isNotOlderThanOneMinute() {
        String first = ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // din
        }
        assertTrue(Dates.isNotOlderThanOneMinute(first));
    }

    @Test
    void isYoungerThan1() {
        String isoTest = "2021-10-26T10:53:23.669126Z";
        String isoReference = "2021-10-26T10:54:23.669126Z";
        assertFalse(Dates.isYoungerThan(isoTest, isoReference));
    }

    @Test
    void isYoungerThan2() {
        String isoReference = "2021-10-26T10:53:23.669126Z";
        String isoTest = "2021-10-26T10:54:23.669126Z";
        assertTrue(Dates.isYoungerThan(isoTest, isoReference));
    }

    @Test
    void isYoungerThan3() {
        String isoReference = "2021-10-26T10:53:23.669126Z";
        assertFalse(Dates.isYoungerThan(isoReference, isoReference));
    }

    @Test
    void asDate() {
        String isoNow = ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT);
        System.out.println(Dates.asGermanDate(isoNow));
    }

}