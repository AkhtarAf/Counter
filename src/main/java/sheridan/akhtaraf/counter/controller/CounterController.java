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
    @GetMapping("/")
    public ModelAndView counterHome(
            @RequestParam(defaultValue = "0") int counterValue
    ){
        log.trace("Initiated the Counter Controller.");
        log.debug("CounterValue = " + counterValue);
        System.out.println("Logging..");
        return new ModelAndView("index");
    }

}
