package com.amarance10.customMkone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index(){
        System.out.println("##################");
        return "=============== customMkone index ===============";
    }

}
