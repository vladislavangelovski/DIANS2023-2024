package com.cooltour.cooltourprototype.web;

import com.cooltour.cooltourprototype.model.Object;
import com.cooltour.cooltourprototype.service.ObjectService;
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
