package timer.model;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TomatoTimerTest {

    @Test
    public void getSecondsLeftTest() throws Exception {
        Date startDate = new SimpleDateFormat("yyyy-MM-dd mm:ss").parse("2010-10-10 10:00");
        TomatoTimer tester = new TomatoTimer(startDate, 25*60);

        Date currentDate = new SimpleDateFormat("yyyy-MM-dd mm:ss").parse("2010-10-10 10:05");
        tester.getSecondsLeft(currentDate);
        Assert.assertEquals("5 seconds ", 25*60 - 5, tester.getSecondsLeft(currentDate));
    }
}
