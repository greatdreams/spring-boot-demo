package com.greatdreams.springboot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author greatdreams
 */
@Controller
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }
}
