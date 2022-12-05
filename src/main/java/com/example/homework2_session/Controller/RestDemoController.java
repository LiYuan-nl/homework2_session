package com.example.homework2_session.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class RestDemoController {
    @RequestMapping("/session")
    public Integer setSession(HttpServletRequest request, @RequestParam("para") Integer para) {
        HttpSession session = request.getSession();

        Integer sum = (Integer) session.getAttribute("sum");
        if(sum == null)
        {
            session.setAttribute("sum",para);
            sum = para;
        }
        else
        {
            session.setAttribute("sum",sum+para);
            sum  =sum + para;
        }
        System.out.println(para);
        return sum;
    }
}
