package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dz.labs.api.domain.Good;
import ru.dz.labs.api.service.GoodService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by You on 25.12.2015.
 */
@Controller
public class GoodController {

    @Autowired
    private GoodService goodService;

    @Autowired
    protected HttpServletRequest request;

    @RequestMapping(value = "/good", method = RequestMethod.GET)
    public String showGood(@RequestParam Long goodId) {
        request.getSession().setAttribute("good", new Good(goodId));
        return "store/goodAbout";
    }

    @RequestMapping(value = "/good", method = RequestMethod.POST)
    public String showGoodInfo(@RequestParam Long goodId) {
        request.getSession().setAttribute("good", goodService.getGoodsById(goodId));
        return "store/goodAbout";
    }

}
