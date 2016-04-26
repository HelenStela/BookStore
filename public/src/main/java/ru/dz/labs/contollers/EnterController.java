package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dz.labs.api.domain.User;
import ru.dz.labs.api.repository.UsersRepository;
import ru.dz.labs.api.service.UserService;
import ru.dz.labs.aspects.annotation.IncludeMenuInfo;
import ru.dz.labs.form.RegistrationFormBean;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Elena on 25.03.2016.
 */
@Controller
public class EnterController {

    public static final String ATTR_REGISTRATION_FORM = "regForm";

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String showEnter() {

        return "enter-form/enter";
    }

    @RequestMapping(value = "/enter", method = RequestMethod.POST)
    public String submit(@RequestParam("email") String email, @RequestParam("password") String hashPassword) {
        System.out.println(email + "  " + hashPassword);
        User user = userService.checkUser(email, hashPassword);
        if (user != null) {
            request.getSession().setAttribute("currentUserId", user.getId());
            request.getSession().setAttribute("currentUser", user);
            return "redirect:/catalog";
        } else return "redirect:/enter-error";
    }


    /**
     * Отображение страницы регистрации
     */
    // @IncludeMenuInfo
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String renderRegistrationPage() {
        request.setAttribute(ATTR_REGISTRATION_FORM, new RegistrationFormBean());
        return "enter-form/registerNew";
    }


//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String showRegistration() {
//        return "enter-form/register";
//    }

/*
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submitRegistration(User user) {
//        System.out.println(surname+ " " + name+" "+ email + "  " + hashPassword);
//        User user = new User(name, hashPassword,email);
        userService.add(user);
        request.getSession().setAttribute("currentUserId", user.getId());
        request.getSession().setAttribute("currentUser", user);
        return "redirect:/";
    }

*/

    /**
     * Обработка формы Регистрации
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute(ATTR_REGISTRATION_FORM) RegistrationFormBean registrationFormBean,
//            RegistrationFormBean registrationFormBean, TODO хотя работает и без этой аннотации, обычно её используют для переименования аргумента
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "enter-form/registerNew";
        }
        String fieldsString = registrationFormBean.toResultString();
        String[] arr = fieldsString.split(",");
        //  return firstName+","+lastName+","+email+","+phone+","+signIn+","+password;
        User newUser = new User(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        // здесь должна происходить регистрация пользователя
        userService.add(newUser);
        request.getSession().setAttribute("currentUserId", newUser.getId());
        request.getSession().setAttribute("currentUser", newUser);
        return "enter-form/register-success";
    }
}
