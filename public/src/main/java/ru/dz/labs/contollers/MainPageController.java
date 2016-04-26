package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dz.labs.api.domain.Good;
import ru.dz.labs.api.service.GoodService;

import java.util.List;

/**
 * @author Gataullin Kamil
 *         12.10.2014 22:34
 */
@Controller
public class MainPageController extends BaseController {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String renderMainPage() {
        request.setAttribute("studentName", "Студент");
        return "mainpage";
    }


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String showCatalog() {
        return "mainTemplate";
    }

}