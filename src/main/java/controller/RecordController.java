package controller;

import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.RecordRepository;

import javax.validation.Valid;



@Controller
@RequestMapping
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    //odpowiada na puste add.html
    @RequestMapping("/addRecord")
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("addRecord");
        model.addObject("record", new Record());
        return model;
    }

    //dostaje z add.jsp model
    @RequestMapping(value = "/saveRecord", method = RequestMethod.POST)
    public String saveRecord(@Valid Record record, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "addRecord";

        recordRepository.save(record);
        return "redirect:/recordTable.html";
    }

    @RequestMapping(value = "/editRecord", method = RequestMethod.POST)
    public ModelAndView editRecord(@ModelAttribute("newRecord") Record selectedRecord) {

       ModelAndView model = new ModelAndView("addRecord");
        Record recTemp = recordRepository.findOne(selectedRecord.getId());
       model.addObject("record", recTemp);

        return model;
   }

    //trzeba pomyslec, moze jakies dodatkowe info o tym
    @RequestMapping("/delateRecord")
    public String remove(@RequestParam int id) {

        //ModelAndView model = new ModelAndView("addRecord");
        Record record = recordRepository.findOne(id);
        recordRepository.delete(id);
        // model.addObject("record", record);

        return "redirect:/recordTable.html";
    }
}



