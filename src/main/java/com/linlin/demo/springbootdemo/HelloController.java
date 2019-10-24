package com.linlin.demo.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @Author zh wu
 * @Date 2019/8/24
 */
@RestController
//@RequestMapping("/oms/open/flightcollab/flightinfo")
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "heheDa123!456";
    }

}
