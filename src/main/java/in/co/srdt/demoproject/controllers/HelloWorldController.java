package in.co.srdt.demoproject.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloWorldController {

    @Value("${welcome.message:test}")
    private String message = "test";

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", this.message);
        return "helloWorld";
    }
}
