package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;
import model.Product;

import javax.validation.Valid;

/**
 * Controller for product entity
 *
 * @author Rafal Staszel
 */
@Controller
@RequestMapping
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Controller with method GET
     * displays the page where we are building the object model.product
     *
     * @return view with new object
     */
    @RequestMapping("/addProduct")
    public ModelAndView addProduct() {
        ModelAndView model = new ModelAndView("addProduct");
        model.addObject("product", new Product());
        return model;
    }

    /**
     * Controller link with view "addRecord", if
     *
     * @param bindingResult and
     * @param product       validation fail return view with
     *                      appropriate info, else save entity and
     * @return view with data table.
     */
    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(@Valid Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "addProduct";

        productRepository.save(product);
        return "redirect:/productTable.html";
    }

    /**
     * Controller gets a product with an id @param selectedRecord
     * that searches in the database and @return it to the controller "addRecord",
     * where it can be edited.
     *
     * @param selectedProduct from view edit.jsp
     * @return model with attributes
     */
    @RequestMapping(value = "/editProduct", method = RequestMethod.POST)
    public ModelAndView editProduct(@ModelAttribute("newProduct") Product selectedProduct) {

        ModelAndView model = new ModelAndView("addProduct");
        Product prodTemp = productRepository.findOne(selectedProduct.getNr());
        model.addObject("product", prodTemp);
        return model;
    }

    /**
     * Controller gets a @param nr
     * that searches for the object to be deleted.
     *
     * @param nr from view edit.jsp
     * @return redirect to product data table
     */
    @RequestMapping("/delateProduct")
    public String removeProduct(@RequestParam int nr) {

        productRepository.delete(nr);
        return "redirect:/productTable.html";
    }

}
