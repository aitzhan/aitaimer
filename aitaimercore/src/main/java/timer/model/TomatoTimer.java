package timer.model;

import java.util.Date;


public class TomatoTimer {
    private Date startDate;
    private int timerInSeconds;
    private boolean isOn;
    private boolean isPaused;

    public TomatoTimer(final Date startDate, final int minutes, final int seconds) {
        this(startDate, minutes * 60 + seconds);
    }

    public TomatoTimer(final Date startDate, final int timerInSeconds) {
        this.timerInSeconds = timerInSeconds;
        this.startDate = startDate;
    }

    public int getSecondsLeft(final Date now) {
        return timerInSeconds - (int)(now.getTime() - startDate.getTime()) / 1000;
    }

    public void start(final Date now) {
        this.startDate = now;
        isOn = true;
        isPaused = false;
    }

    public boolean pause(final Date now) {
        if (canPause()) {
            this.timerInSeconds = this.getSecondsLeft(now);
            this.startDate = now;
            isOn = false;
            isPaused = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean resume(final Date now) {
        this.startDate = now;
        isOn = true;
        isPaused = false;

        return true;
    }

    public int getTimerInSeconds() {
        return timerInSeconds;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public boolean isOn() {
        return isOn;
    }

    private boolean canPause() {
        return isOn();
    }
}
