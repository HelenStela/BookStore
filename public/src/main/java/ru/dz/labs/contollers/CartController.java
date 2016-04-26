package ru.dz.labs.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dz.labs.api.domain.Cart;
import ru.dz.labs.api.domain.Good;
import ru.dz.labs.api.domain.User;
import ru.dz.labs.api.service.CartService;
import ru.dz.labs.api.service.GoodService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by You on 14.01.2016.
 */
@Controller
public class CartController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    private CartService cartService;

    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String showCatalog() {
        List<Cart> carts = cartService.getCartsForUser(null);
        request.getSession().setAttribute("sessionCart", carts);
        return "cart/cart";
    }

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    public String addGoogToCart(@RequestParam("goodId") Long goodId) {
        User currentUser = (User) request.getSession().getAttribute("currentUser"); // (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();  //  получаем текущего пользователя
        Cart newCart = new Cart(1, currentUser, goodService.getGoodsById(goodId));
        if (currentUser != null) {
            cartService.addCarts(newCart);
        }

        List<Cart> sessionCart = (List<Cart>) request.getSession().getAttribute("sessionCart");
        if (sessionCart == null) {
            sessionCart = new ArrayList<>();
        }
        sessionCart.add(newCart);
        request.getSession().setAttribute("sessionCart", sessionCart);
        return "cart/cart";
    }

}
