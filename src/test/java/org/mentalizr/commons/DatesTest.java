package org.mentalizr.commons;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

}