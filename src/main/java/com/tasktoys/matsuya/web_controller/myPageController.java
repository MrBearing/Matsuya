package com.tasktoys.matsuya.web_controller;

import com.tasktoys.matsuya.domain.User;
import com.tasktoys.matsuya.service.LoginUserDetails;
import com.tasktoys.matsuya.service.LoginUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Takumi on 2016/03/02.
 */
@Controller
public class MyPageController {

    @Autowired
    LoginUserDetailsService loginUserDetailsService;



    //TODO ユーザーのオブジェクト取得方法調査
    @RequestMapping("home")
    public String handleMyPage(Model model ){
        //パラメーターでセッション構築中のユーザーを参照？
        /*
        User currentUser = userDetails.getUser();
        model.addAttribute("user",currentUser);
        */


        return "myPage";
    }
}


