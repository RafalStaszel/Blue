package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import repository.RecordRepository;
import model.Record;

import javax.validation.Valid;

/**
 * Controller for record entity
 *
 * @author Rafal Staszel
 */
@Controller
@RequestMapping
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    /**
     * Controller with method GET
     * displays the page where we are building the object model.record
     *
     * @return view with new object
     */
    @RequestMapping("/addRecord")
    public ModelAndView addRecord() {
        ModelAndView model = new ModelAndView("addRecord");
        model.addObject("record", new Record());
        return model;
    }

    /**
     * Controller link with view "addRecord", if
     *
     * @param bindingResult and
     * @param record        validation fail return view with
     *                      appropriate info, else save entity and
     * @return view with data table.
     */
    @RequestMapping(value = "/saveRecord", method = RequestMethod.POST)
    public String saveRecord(@Valid Record record, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "addRecord";

        recordRepository.save(record);
        return "redirect:/recordTable.html";
    }

    /**
     * Controller gets a product with an id @param selectedRecord
     * that searches in the database and @return it to the controller "addRecord",
     * where it can be edited.
     *
     * @param selectedRecord from view edit.jsp
     * @return model with attributes
     */
    @RequestMapping(value = "/editRecord", method = RequestMethod.POST)
    public ModelAndView editRecord(@ModelAttribute("newRecord") Record selectedRecord) {

        ModelAndView model = new ModelAndView("addRecord");
        Record recTemp = recordRepository.findOne(selectedRecord.getId());
        model.addObject("record", recTemp);

        return model;
    }

    /**
     * Controller gets a @param nr
     * that searches for the object to be deleted.
     *
     * @param id from view edit.jsp
     * @return redirect to product data table
     */
    @RequestMapping("/delateRecord")
    public String removeRecord(@RequestParam int id) {

        recordRepository.delete(id);
        return "redirect:/recordTable.html";
    }
}



