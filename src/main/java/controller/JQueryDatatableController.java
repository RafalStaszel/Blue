package controller;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;
import repository.RecordRepository;

/**
 * Holder for controller main jquery table.
 *
 * @author Rafal Staszel
 */
@Controller
public class JQueryDatatableController {


    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private ProductRepository productRepository;

    /**
     * Controller table of entity record,
     * ObjectMapper change data from DB to string.
     *
     * @return jQuery table to view "dataTableRecord".
     * @throws IOException error will only occur when the database is badly configured
     */
    @RequestMapping("/recordTable")
    public ModelAndView jTableRecord() throws IOException {
        ModelAndView model = new ModelAndView("dataTableRecord");
        ObjectMapper mapper = new ObjectMapper();
        model.addObject("recordList", mapper.writeValueAsString(recordRepository.findAll()));
        return model;
    }

    /**
     * Controller table of entity product
     * ObjectMapper change data from DB to string.
     *
     * @return jQuery table to view "dataTableProduct"
     * @throws IOException error will only occur when the database is badly configured
     */
    @RequestMapping("/productTable")
    public ModelAndView jTableProduct() throws IOException {
        ModelAndView model = new ModelAndView("dataTableProduct");
        ObjectMapper mapper = new ObjectMapper();
        model.addObject("productList", mapper.writeValueAsString(productRepository.findAll()));
        return model;
    }
}