package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dz.labs.api.domain.Good;
import ru.dz.labs.api.service.GoodService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Controller
public class CatalogController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    private GoodService goodService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showCatalogAsMain() {
        List<Good> goods = goodService.getAllGoods();
        request.getSession().setAttribute("allGoods", goods);
        return "store/Catalog";
    }

    @RequestMapping(value = "/Catalog", method = RequestMethod.GET)
    public String showCatalog() {
        List<Good> goods = goodService.getAllGoods();
        request.getSession().setAttribute("allGoods", goods);
        return "store/Catalog";
    }
}
