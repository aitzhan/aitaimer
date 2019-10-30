package timer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = "/greeting")
    public String showMainPage(Model model) {
        model.addAttribute("name", "aitimer");
        return "greeting";
    }
}
