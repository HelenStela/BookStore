package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.Cart;
import ru.dz.labs.api.domain.User;

import java.util.List;


/**
 * Created by You on 25.12.2015.
 */
@Repository
public class CartRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Cart carts) {
        sessionFactory.getCurrentSession().save(carts);
    }

    public Cart getCartsById(Long id) {
        return (Cart) sessionFactory.getCurrentSession().load(Cart.class, id);
    }

    public List<Cart> getCarts(Long userId) {
        return sessionFactory.getCurrentSession().createCriteria(Cart.class)
                .add(Restrictions.eq("user.id", userId)).list();
    }

    public List<Cart> getCartsForUser(User user) {
        return sessionFactory.getCurrentSession().createCriteria(Cart.class)
                .add(Restrictions.eq("user", user)).list();
    }
}
