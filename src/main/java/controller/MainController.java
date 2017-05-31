package controller;

import model.Product;
import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;
import repository.RecordRepository;

@Controller
public class MainController {

    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private ProductRepository productRepository;


    @RequestMapping("/edit")
    public ModelAndView edit() {

        ModelAndView model = new ModelAndView("edit");
        model.addObject("records", recordRepository.findAll());
        model.addObject("products", productRepository.findAll());
        model.addObject("newProduct", new Product());
        model.addObject("newRecord", new Record());

        return model;
    }

    @RequestMapping("/404.html")
    public ModelAndView errorNull(){
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", new String("Nie znaleziono strony"));
        // i need implement logger
        return model;
    }
    @RequestMapping("/error.html")
    public ModelAndView errorThrowable() {
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", new String("Wyjątek java"));
        // i need implement logger
        return model;
    }
}