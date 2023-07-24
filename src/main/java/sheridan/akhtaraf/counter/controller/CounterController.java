package sheridan.akhtaraf.counter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CounterController {

    private final Logger log = LoggerFactory.getLogger(CounterController.class);

    // For controlling the Counter Input
    @GetMapping("/")
    public ModelAndView counterHome() {
        log.trace("Showing the Index Page...");
        return new ModelAndView("index");
    }

    // Get mapping for the output page with request parameter `counterValue`
    @GetMapping("/counter")
    public ModelAndView counterPage(
            @RequestParam(defaultValue = "0") int counterValue
    ){
        log.trace("At the output counter page");
        log.debug("counterValue = " + counterValue);
        return new ModelAndView("counter","counterData", counterValue);
    }
}