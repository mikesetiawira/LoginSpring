package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.user.UserService;

@Controller
public class UserWebController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String home(Model model){

        return "/home";
    }
}
