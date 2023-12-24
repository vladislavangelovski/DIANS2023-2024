package com.cooltour.cooltour.web;

import com.cooltour.cooltour.service.ObjectService;
import com.cooltour.cooltour.model.Object;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping("/home")
public class ObjectController {
    private final ObjectService objectService;

    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping
    public String getHomePage(Model model)
    {
        List<Object> objects = objectService.findAll();
        model.addAttribute("objects", objects);
        return "home";
    }


    @PostMapping("/search/searchByName")
    public String searchByName(@RequestParam String category, @RequestParam String query, Model model){

       model.addAttribute("objects",objectService.findObjectByTypeOrName(category, query));

       return "home";
    }
    @PostMapping("/search/searchByCategory")
    public String searchByCategory(@RequestParam String category, Model model){

        model.addAttribute("objects",objectService.findObjectByName(category));
        return "home";
    }
}
