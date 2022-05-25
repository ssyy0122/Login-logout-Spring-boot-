package com.victolee.signuplogin.controller;

import com.victolee.signuplogin.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    //메인페이지
    @GetMapping("/")
    public String index() {
        return "/index";
    }
    //회원가입 페이지
    @GetMapping
    public String dispSingnup() {
        return "/singup";
    }
    //회원가입 처리
}
