package com.example.demo;

/*
 * Lancement du Spring
 * mvn spring-boot:run
 * 
 */
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@RestController()
//@RequestMapping("/")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${application.name}")
    private String applicationName;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        logger.info("[Demo] HomeController : index");
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String,String> test() {
        logger.info("[Demo] HomeController : test");
        Map<String,String> map = Map.of("test","test from "+applicationName);
        return map;
    }


}
