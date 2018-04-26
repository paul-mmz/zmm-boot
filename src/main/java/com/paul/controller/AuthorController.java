package com.paul.controller;

import com.paul.service.Author;
import com.paul.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class AuthorController {

    @Autowired
    private Author author;

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/")
    @ResponseBody
    public String author() {
        return author.getName() + author.getAge();
    }

    @ResponseBody
    @RequestMapping(value = "/service")
    public String authorService() {
        return authorService.getEnvironment().getProperty("book.author") +
                authorService.getEnvironment().getProperty("book.name");
//        return Arrays.toString(authorService.getEnvironment().getActiveProfiles());
    }
}
