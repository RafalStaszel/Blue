package controller;


import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
public class HomeController {


    @RequestMapping("/home")
    public ModelAndView home() {

        ModelAndView model = new ModelAndView("home");
        Person person = new Person();
        person.setName("rafal");
        person.setLastName("Kunagunda");
        model.addObject("person", person);
        //return new ModelAndView("home");
        return model;
    }

}


