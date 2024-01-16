package aibot.aibotspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/member/register")
    public String register(@RequestParam("memberId") String memberId,
                           @RequestParam("memberPassword") String memberPassword,
                           @RequestParam("memberName") String memberName,
                           @RequestParam("memberPhone") String memberPhone,
                           @RequestParam("memberEmail") String memberEmail,
                           @RequestParam("memberLibrary") String memberLibrary) {
        System.out.println("MemberController.register");
        System.out.println("User input info (ID: " + memberId + ", PW: " + memberPassword + ", Name: " + memberName + ", Phone: " +
                            memberPhone + ", Email: " + memberEmail + ", Library: " + memberLibrary + ")");
        return "home";
    }
}
