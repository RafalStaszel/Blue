package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rafał on 2017-05-29.
 */
@Controller
public class MainController {


@RequestMapping("/")
public String home() {


    return "datatable";
}
}