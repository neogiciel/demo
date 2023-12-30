package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
/*1
 * Lancement du Spring
 * mvn spring-boot:run
 * 
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@Controller()
//@RequestMapping("/page")
public class PageController {

    Logger logger = LoggerFactory.getLogger(PageController.class);

    @Value("${application.name}")
    private String applicationName;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String page() {
        //return "Application page : "+applicationName;
        logger.info("[Demo] PageController : page");
        return "page.html";
   }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error() {
        //return "Application page : "+applicationName;
        logger.info("[Demo] PageController : error");
        return "error.html";
   }

}
