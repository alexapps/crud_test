package org.alexapps.catalogue.controller;

import org.alexapps.catalogue.model.User;
import org.alexapps.catalogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
@RequestMapping("/user")
public class ControllerUser {
    @Autowired
    private UserService userService;

    private Logger logger = Logger.getLogger("Controller");

    @RequestMapping("/get/{userId}")
    public String getUser(@PathVariable Integer userId, Map<String, Object> map) {
        User user = userService.getUser(userId);
        map.put("user", user);
        return "/user/userForm";
    }

    @RequestMapping(value = { "/", "/listUsers" })
    public String listUsers(@RequestParam(required = false) Integer page, Model model) {


        model.addAttribute("user", new User());
        model.addAttribute("userList", userService.listUsers());
/*
        PagedListHolder<User> pagedListHolder = new PagedListHolder<User>(this.userService.listUsers());
        pagedListHolder.setPageSize(5);
        model.addAttribute("maxPages", pagedListHolder.getPageCount());

        if (page==null || page < 1 || page > pagedListHolder.getPageCount())
            page=1;
        model.addAttribute("page", page);

        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(0);
            model.addAttribute("userList", pagedListHolder.getPageList());
        }
        else if(page <= pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(page - 1);
            model.addAttribute("userList", pagedListHolder.getPageList());
        }

*/
        //map.put("user", new User());

        //map.put("userList", userService.listUsers());
        //logger.info("list size " + userService.listUsers().size());


        //map.put("age", age);


        return "/user/listUsers";
    }
    /*public String listUsers(Map<String, Object> map) {

        map.put("user", new User());

        map.put("userList", userService.listUsers());
        logger.info("list size " + userService.listUsers().size());

        List<User> list = userService.listUsers();
        int age = list.get(0).getAge();
        map.put("age", age);


        return "/user/listUsers";
    }*/



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user,
                           BindingResult result) {

        userService.saveUser(user);


        return "redirect:listUsers";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {

        userService.deleteUser(userId);


        return "redirect:/user/listUsers";
    }




}
