package controller;

import repository.RecordJpaRepository;
import repository.RecordRepository;
import model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Rafał on 2017-05-27.
 */
@Controller
public class DataController {


    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private RecordJpaRepository recordJpaRepository;


    @RequestMapping("/data")
    public ModelAndView showTable() {
        System.out.println("Tutaj cos dziala z baza");
        ModelAndView model = new ModelAndView("dataTest");
        Record record;
        record = recordRepository.findById(2);
        System.out.println(record.toString());
        model.addObject("record", record);


        return model;
    }

    @RequestMapping("/insert")
    public ModelAndView insert() {
        System.out.println("Tutaj ladujemy do bazy");
        ModelAndView model = new ModelAndView("dataTest");
        Record record = new Record(1, "5/2010", "Android", "02/2016",
                "23/2042", 300, "month", false);
        System.out.println(record.toString());
        recordRepository.save(record);

        model.addObject("record", record);

        return model;
    }

    @RequestMapping("/all")
    public ModelAndView showAll() {
        System.out.println("Wszystko z bazy");
        ModelAndView model = new ModelAndView("listTest");
        //List<Record> recordList = (List<Record>) recordRepository.findAll();
        //for (Record record : recordList)
         //   System.out.println(record.getSystem());
StringBuilder sb = new StringBuilder();
        List<Record> recordList = recordJpaRepository.findAll();
        for (Record record : recordList)
            sb.append(record.toString() + "\n");


        System.out.println(sb.toString());

        model.addObject("sb", sb.toString());
        return model;
    }
}
