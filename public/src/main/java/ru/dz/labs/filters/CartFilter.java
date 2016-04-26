package ru.dz.labs.filters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by You on 09.12.2015.
 */
public class CartFilter implements Filter {
    boolean active;
    boolean firstTime = false;

    private void initFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        if (active && firstTime) {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            Cookie[] cookies = request.getCookies();
            String cookValue = null;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("cart")) {
                    cookValue = cookie.getValue();
                }
                //  request.getSession().setAttribute();
            }
        }
    }

    @Override
    public void destroy() {

    }
}
