package com.application.shaverma;

import com.application.shaverma.domain.Menu;
import com.application.shaverma.repos.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private MenuRepo menuRepo;
    @GetMapping("/Menu")
    public String menu(Model model) {
        Iterable<Menu> message = menuRepo.findAll();
        model.addAttribute("message", message);
        return "Menu";
    }
    @PostMapping("/Menu")
    public String addMenu(@RequestParam String name, @RequestParam String discription,Model model ) {
       Menu mn =  new Menu(name, discription);
       menuRepo.save(mn);
        Iterable<Menu> message = menuRepo.findAll();        // need to reformat
        model.addAttribute("message", message);                 // need to reformat
       return "Menu";
    }
    // RequestParam забирает данные из формы при POST запросе и из URl при GET запросе
    @GetMapping("/")
    public String main(Map<String, Object> model) {
        return "Main";
    }
}