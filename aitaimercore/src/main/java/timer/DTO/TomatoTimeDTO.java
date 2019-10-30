package timer.DTO;

public class TomatoTimeDTO {
    private int minutes;
    private int seconds;

    public TomatoTimeDTO(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
