package controller;

import model.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafał on 2017-05-27.
 * class only for test
 */
@Controller
public class DataList {

    public List<Record> recordList;

    public List<Record> makeRecord() {

        List<Record> recordList = new ArrayList<>();
        Record r1 = new Record(1, "122/2016", "Ios", "02/2016",
                "23/2042", 5800, "year", true);
        Record r2 = new Record(2, "1122/2006", "Android", "05/2006",
                "21/2022", 9900, "year", false);
        Record r3 = new Record(3, "32/2016", "Windows", "03/2016",
                "11/2082", 15800, "month", true);
        recordList.add(r1);
        recordList.add(r2);
        recordList.add(r3);

        return recordList;
    }

    @RequestMapping("/main")
    public ModelAndView showTable() {
        System.out.println("Tutaj cos dziala");
        ModelAndView model = new ModelAndView("main");
        List<Record> recordList = makeRecord();
        System.out.println(recordList.get(1).toString());
        model.addObject("recordList", recordList);

        return model;
    }

}
