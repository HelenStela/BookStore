package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Elena on 25.04.2016.
 */
@Controller
public class DemoController {

    @Autowired
    protected HttpServletRequest request;

    @RequestMapping(value = "/just", method = RequestMethod.GET)
    public String showPicture() {
        return "demo/just";
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String showNews() {
        return "demo/news";
    }

    @RequestMapping(value = "/sales", method = RequestMethod.GET)
    public String showSales() {
        return "demo/sales";
    }

    @RequestMapping(value = "/how-to", method = RequestMethod.GET)
    public String showHowToOrder() {
        return "demo/howToOrder";
    }

}
