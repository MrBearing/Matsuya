package com.tasktoys.matsuya.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index
 * Created by Takumi on 2016/02/29.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    String handleIndex(Model model){
        // TODO DBから会記データをとってきてModelに格納しておく。

        return "./index";
    }

}
