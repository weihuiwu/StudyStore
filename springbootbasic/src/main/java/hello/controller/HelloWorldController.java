package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this a msg from HelloWorldController");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping({"/","/index.html"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}