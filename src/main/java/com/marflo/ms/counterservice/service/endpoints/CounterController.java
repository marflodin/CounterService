package com.marflo.ms.counterservice.service.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
    private final Logger logger = LoggerFactory.getLogger(CounterController.class.getName());

    @RequestMapping("/increment")
    public String increment() {
        logger.info("increment counter!!");
        return "index";
    }
}
