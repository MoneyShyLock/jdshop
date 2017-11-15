package com.jdshop.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String index() {
        System.out.println("index");
        return  "index";

    }
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String toIndex() {
        System.out.println("index"+"indexAction");
        return  "index";

    }
}
