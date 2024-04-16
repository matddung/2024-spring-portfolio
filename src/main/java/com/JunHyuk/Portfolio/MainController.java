package com.JunHyuk.Portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String Home() {
        return "index";
    }

    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

    @GetMapping("/intranet")
    public String Intranet() {
        return "intranet";
    }

    @GetMapping("/mily")
    public String mily() {
        return "mily";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
