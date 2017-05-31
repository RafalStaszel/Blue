package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.ProductRepository;

import javax.validation.Valid;


@Controller
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/add")
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("addProduct");
        model.addObject("product", new Product());
        return model;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@Valid Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "add";

        productRepository.save(product);
        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "/postEdit", method = RequestMethod.POST)
    public String postEdit(@Valid Product product, BindingResult binding) {

        if (binding.hasErrors())
            return "redirect:/editProduct.html";

        productRepository.save(product);
        return "redirect:/producttable.html";
    }

    @RequestMapping("/delate")
    public String remove(@RequestParam int nr) {

        Product product = productRepository.findOne(nr);
        productRepository.delete(nr);

        return "redirect:/producttable.html";
    }


    ////////////////

//    @RequestMapping("/edit")
//    public ModelAndView edit(@RequestParam int nr) {
//        ModelAndView model = new ModelAndView("addProduct");
//        Product product = productRepository.findOne(nr);
//        model.addObject(product);
//        return model;
//    }
//    @RequestMapping(value = "/remove" , method = RequestMethod.POST)
//    public String remove(@RequestParam int nr) {
//        ModelAndView model = new ModelAndView("edit");
//        System.out.println("Kasujemy " + productRepository.findOne(nr).getSystem());
//        productRepository.delete(nr);
//        //model.addObject(product);
//        return "redirect:/recordtable.html";
//    }
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String updateRecord(@Valid Product product, BindingResult binding) {
//
//        if(binding.hasErrors())
//            return "addRecord";
//
//        System.out.println("Update = " +product);
//        productRepository.save(product);
//        return "redirect:/recordtable.html";
//    }

}
