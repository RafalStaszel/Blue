package controller;

import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.RecordRepository;


import java.util.List;

/**
 * Created by Rafał on 2017-05-27.
 * +
 */
@Controller
public class DataController {

    @Autowired
    private RecordRepository recordRepository;

    //    @RequestMapping("/data")
    //    public ModelAndView showTable() {
    //        System.out.println("Tutaj cos dziala z baza");
    //        ModelAndView model = new ModelAndView("dataTest");
    //        Record record;
    //        record = recordReopsitory.findById(2);
    //        System.out.println(record.toString());
    //        model.addObject("record", record);
    //
    //
    //        return model;
    //    }

    @RequestMapping("/insert")
    public ModelAndView insert() {
        System.out.println("Tutaj ladujemy do bazy");
        ModelAndView model = new ModelAndView("dataTest");
        Record record = new Record( "6/2044", "Windows", "15/50",
                "30/05", 31500, "zInsert", false);
        System.out.println(record.toString());
        recordRepository.save(record);
        model.addObject("record", record);
        return model;
    }

    @RequestMapping("/all")
    public ModelAndView showAll() {
        System.out.println("Wszystko z bazy");
        ModelAndView model = new ModelAndView("listTest");
        Iterable<Record> recordList = recordRepository.findAll();
        for (Record record : recordList)
            System.out.println(record.getSystem());
        model.addObject("recordList", recordList);
        return model;
    }


}