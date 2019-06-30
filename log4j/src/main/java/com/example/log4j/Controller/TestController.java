package com.example.log4j.Controller;
//Logger建议用slf4j
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public String test(){
//        log.debug("debug ****************************");
//        log.info("info ****************************");
//        log.warn("warn ****************************");
//        log.error("error ****************************");

        try {
            int i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.toString());
        }

        log.info("哈哈哈");
        return "success";
    }
}