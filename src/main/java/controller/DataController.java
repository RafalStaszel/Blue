package controller;

import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.RecordRepository;
import service.RecordService;


import java.util.List;

/**
 * Created by Rafał on 2017-05-27.
 * +
 */
@Controller
public class DataController {

    @Autowired
    private RecordService recordService;

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
        Record record = new Record( "6/2044", "Ios", "00/20",
                "30/05", 31500, "month", false);
        System.out.println(record.toString());
        recordService.save(record);
        model.addObject("record", record);
        return model;
    }

    @RequestMapping("/all")
    public ModelAndView showAll() {
        System.out.println("Wszystko z bazy");
        ModelAndView model = new ModelAndView("listTest");
        List<Record> recordList = recordService.getAllRecords();
        for (Record record : recordList)
            System.out.println(record.getSystem());
        model.addObject("recordList", recordList);
        return model;
    }


}