package controller;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.RecordService;


@Controller
public class JQueryDatatableController {


    @Autowired
    private RecordService recordService;


    @RequestMapping("/datatable")
    public ModelAndView tabliOstaniaT() throws IOException {
        ModelAndView model = new ModelAndView("dataTable");
        ObjectMapper mapper = new ObjectMapper();
        model.addObject("recordList", mapper.writeValueAsString(recordService.getAllRecords()));
        return model;
    }
}