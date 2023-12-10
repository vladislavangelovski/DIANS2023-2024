package com.cooltour.cooltour.web;

import com.cooltour.cooltour.service.ObjectService;
import com.cooltour.cooltour.model.Object;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
}
