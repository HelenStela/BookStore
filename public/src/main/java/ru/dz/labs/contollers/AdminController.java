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
public class AdminController {

    @Autowired
    protected HttpServletRequest request;

    @RequestMapping(value = "/admin/add-book", method = RequestMethod.GET)
    public String showCatalog() {
        return "cart/cart";
    }
}
