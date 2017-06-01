package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;
import repository.RecordRepository;
import model.Product;
import model.Record;

/**
 * Main app controller
 * for common task.
 *
 * @author Rafal Staszel
 */
@Controller
public class MainController {

    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private ProductRepository productRepository;

    /**
     * Controller method Get
     * creates new upload entities that will
     * be used for editing or deletion.
     *
     * @return full object and two new model.product and record.model
     */
    @RequestMapping("/edit")
    public ModelAndView edit() {

        ModelAndView model = new ModelAndView("edit");
        model.addObject("records", recordRepository.findAll());
        model.addObject("products", productRepository.findAll());
        model.addObject("newProduct", new Product());
        model.addObject("newRecord", new Record());
        return model;
    }

    /**
     * The controller receives the error
     * code and the message
     *
     * @return view with message
     */
    //  need implement logger
    @RequestMapping("/404")
    public ModelAndView errorNull() {
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", new String("Nie znaleziono strony"));
        return model;
    }

    /**
     * The controller receives the error
     * code and the message
     *
     * @return view with message
     */
    //  need implement logger
    @RequestMapping("/error")
    public ModelAndView errorThrowable() {
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", new String("Wyjątek java"));
        return model;
    }

    /**
     * Controller for jsp with credits
     *
     * @return view credits
     */
    @RequestMapping("/credits")
    public ModelAndView credits() {
        ModelAndView model = new ModelAndView("credits");
        return model;
    }
}