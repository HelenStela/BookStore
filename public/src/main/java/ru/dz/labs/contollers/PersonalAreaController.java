package ru.dz.labs.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Elena on 14.04.2016.
 */
@Controller
public class PersonalAreaController {

    @RequestMapping(value = "/personalArea", method = RequestMethod.GET)
    public String showSliderPage() {
        return "personal/account";
    }

    @RequestMapping(value = "/personalArea", method = RequestMethod.POST)
    public String showPersonal(@RequestParam Long userId) {
        return "slider-s-fade/sliderPage";
    }

}
