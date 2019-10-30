package timer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import timer.DTO.TomatoTimeDTO;
import timer.model.TomatoTimer;

import java.util.Date;

@RestController
public class TimerController {

    final TomatoTimer tomatoTimer;

    @Autowired
    public TimerController(TomatoTimer tomatoTimer) {
        this.tomatoTimer = tomatoTimer;
    }

    @GetMapping(value = "/rest/timer", produces = MediaType.APPLICATION_JSON_VALUE)
    TomatoTimeDTO getCurrentTime() {
        Date now = new Date();
        int minutes = tomatoTimer.getSecondsLeft(now) / 60;
        int seconds = tomatoTimer.getSecondsLeft(now) % 60;
        return new TomatoTimeDTO(minutes, seconds);
    }
}
