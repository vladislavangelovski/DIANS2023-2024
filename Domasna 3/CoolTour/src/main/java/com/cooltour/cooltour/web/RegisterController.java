package com.cooltour.cooltour.web;

import com.cooltour.cooltour.model.exceptions.InvalidArgumentsException;
import com.cooltour.cooltour.model.exceptions.PasswordsDoNotMatchException;
import com.cooltour.cooltour.model.exceptions.UsernameAlreadyExistsException;
import com.cooltour.cooltour.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final AuthService authService;

    public RegisterController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public String getRegisterPage(@RequestParam(required = false) String error, Model model) {
        if(error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        return "register";
    }

    @PostMapping
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String repeatedPassword,
                           @RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam String email,
                           Model model) {
        try{
            this.authService.register(username, password, repeatedPassword, name, surname, email);

        } catch (InvalidArgumentsException | PasswordsDoNotMatchException | UsernameAlreadyExistsException exception) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", exception.getMessage());
            return "register";
        }
        return "redirect:/login";
    }
}
