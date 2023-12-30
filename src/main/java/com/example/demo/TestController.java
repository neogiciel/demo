package com.example.demo;

/*
 * Lancement du Spring
 * mvn spring-boot:run
 * 
 */
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@RestController()
//@RequestMapping("/")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/security", method = RequestMethod.GET)
    public Map<String,String> security() {
        logger.info("[Demo] TestController : security");
        Map<String,String> map = Map.of("test","test security");
        return map;
    }

   
    @RequestMapping(value="/security/{id}", method = RequestMethod.GET)
    public Map<String,String> securityId(@PathVariable("id") String id) {
        logger.info("[Demo] TestController : securityId  = "+id);
        Map<String,String> map = Map.of("test","test from =  " + id);
        return map;
    }


    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String page() {
        //return "Application page : "+applicationName;
         logger.info("[Demo] TestController :  page ");
        return "test/page.html";
   }


}
