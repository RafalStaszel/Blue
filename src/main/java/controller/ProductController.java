package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;

import javax.validation.Valid;


@Controller
@RequestMapping
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/addProduct")
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("addProduct");
        model.addObject("product", new Product());
        return model;
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(@Valid Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "addProduct";

        productRepository.save(product);
        return "redirect:/productTable.html";
    }

    @RequestMapping(value = "/editProduct", method = RequestMethod.POST)
    public ModelAndView editRecord(@ModelAttribute("newProduct") Product selectedProduct) {

        ModelAndView model = new ModelAndView("addProduct");
        Product prodTemp = productRepository.findOne(selectedProduct.getNr());
        model.addObject("product", prodTemp);

        return model;
    }

    @RequestMapping("/delateProduct")
    public String remove(@RequestParam int nr) {

        Product product = productRepository.findOne(nr);
        productRepository.delete(nr);

        return "redirect:/productTable.html";
    }

}
