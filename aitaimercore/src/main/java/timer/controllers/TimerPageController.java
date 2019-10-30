package timer.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import timer.model.TomatoTimer;

import java.util.Date;

@Controller
@RequestMapping("timer")
public class TimerPageController {

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    protected TomatoTimer getTomatoTimer() {
        return new TomatoTimer(new Date(), 25*60);
    }

    @GetMapping("/")
    public String getTimerPage(Model model) {
        model.addAttribute("tomatoTimer", getTomatoTimer());
        return "timer";
    }
}
