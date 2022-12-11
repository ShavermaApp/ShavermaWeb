package com.application.shaverma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/Menu")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="Menu") String name, // id , imp, def val
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "Menu";
    }

    @GetMapping("/")
    public String main(Map<String, Object> model) {
        model.put("some", "Welcome!");
        return "Main";
    }
}