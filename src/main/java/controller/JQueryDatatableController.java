package controller;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;
import repository.RecordRepository;


@Controller
public class JQueryDatatableController {


    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private ProductRepository productRepository;


    @RequestMapping("/recordTable")
    public ModelAndView jTableRecord() throws IOException {
        ModelAndView model = new ModelAndView("dataTableRecord");
        ObjectMapper mapper = new ObjectMapper();
        model.addObject("recordList", mapper.writeValueAsString(recordRepository.findAll()));
        return model;
    }

    @RequestMapping("/productTable")
    public ModelAndView jTableProduct() throws IOException {
        ModelAndView model = new ModelAndView("dataTableProduct");
        ObjectMapper mapper = new ObjectMapper();
        model.addObject("productList", mapper.writeValueAsString(productRepository.findAll()));
        return model;
    }
}