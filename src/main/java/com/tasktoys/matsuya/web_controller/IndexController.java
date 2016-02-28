package com.tasktoys.matsuya.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by Takumi on 2016/02/29.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    String handleIndex(){
        return "index";
    }

}
