package controller;

import com.sun.media.sound.PortMixerProvider;
import model.Pomocniczy;
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
import service.RecordService;

import javax.validation.Valid;



@Controller
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    //odpowiada na puste add.html
    @RequestMapping("/add")
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("addRecord");
        model.addObject("record", new Record());
        return model;
    }
    //dostaje z add.jsp model
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRecord(@Valid Record record, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "add";

        recordRepository.save(record);
        return "redirect:/recordtable.html";
    }

    ////update robi dobrze
    @RequestMapping(value = "/postEdit", method = RequestMethod.POST)
    public String postEdit(@Valid Record record, BindingResult binding) {

        if (binding.hasErrors())
            return "redirect:/editRecord.html";

        recordRepository.save(record);
        return "redirect:/recordtable.html";
    }

    //trzeba pomyslec, moze jakies dodatkowe info o tym
    @RequestMapping("/delate")
    public String remove(@RequestParam int id) {

        //ModelAndView model = new ModelAndView("addRecord");
        Record record = recordRepository.findOne(id);
        recordRepository.delete(id);
        // model.addObject("record", record);

        return "redirect:/recordtable.html";
    }




    //czy to cos dostaje? sprawdzamy
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String updateRecord(@Valid Record record, BindingResult binding) {
//
//        if (binding.hasErrors())
//            return "redirect:/addRecord.html";
//
//        System.out.println("Update = " + record);
//        recordRepository.save(record);
//        return "redirect:/recordtable.html";
//    }
    }
/// raczej tez nic nie robi
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public ModelAndView editRecord(@ModelAttribute("newRecord") Record selectedRecord) {
//
//        ModelAndView model = new ModelAndView("editRecord");
//        Record recTemp = recordRepository.findOne(selectedRecord.getId());
//        model.addObject("record", recTemp);
//
//        return model;
//    }

