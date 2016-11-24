package org.alexapps.catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.alexapps.catalogue.model.User;
import org.alexapps.catalogue.service.UserService;

import java.util.Map;

/**
 * Created by ladan on 11/10/16.
 */



public class UserController {
/*
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/a" })
    public String listUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", userService.listUsers());
        //map.put("user", new User());
        //map.put("userList", userService.listUsers());
        //model.addAttribute("user", new User());
        //model.addAttribute("userList", userService.listUsers());
        return "user";
    }

    @RequestMapping("/get/{userId}")
    public String getUser(@PathVariable Integer userId, Map<String, Object> map) {
        User user = userService.getUser(userId);
        map.put("user", user);
        return "/userForm";
    }
     @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user, BindingResult result) {
        userService.saveUser(user);
        return "redirect:listUsers";
    }
    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id) {

        userService.deleteUser(id);

        return "redirect:/user/listUsers";
    }
*/

}
