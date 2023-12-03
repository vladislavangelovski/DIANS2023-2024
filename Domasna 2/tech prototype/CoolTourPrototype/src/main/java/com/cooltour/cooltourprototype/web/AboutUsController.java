package com.cooltour.cooltourprototype.web;

import com.cooltour.cooltourprototype.model.Object;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/about-us")
public class AboutUsController {
    @GetMapping
    public String getAboutUsPage(Model model)
    {
        return "about-us";
    }
}
