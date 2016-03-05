package com.tasktoys.matsuya.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Takumi on 2016/03/02.
 */
@Controller
public class MyPageController {

    @RequestMapping("mypage")
    public String handleMyPage(Model model ){
        return "mypage";
    }
}
