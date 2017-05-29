package controller;

import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.RecordService;

import javax.validation.Valid;

/**
 * Created by Rafał on 2017-05-29.
 */

@Controller
@RequestMapping
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping ("/add")
    public ModelAndView add(){
        ModelAndView model = new ModelAndView( "add");
        model.addObject("record", new Record());
        return model;
    }

    @RequestMapping (value = "/save", method = RequestMethod.POST)
    public String saveRecord(@Valid Record record, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "add";
        }

        System.out.println(record.getSystem());
        recordService.save(record);
        return "redirect:/index.jsp";
    }
    @RequestMapping("/edit")
    public ModelAndView edit(@RequestParam int id) {
        ModelAndView model = new ModelAndView("add");
        Record record = recordService.findOne(id);
        model.addObject(record);
        return model;
    }
}
