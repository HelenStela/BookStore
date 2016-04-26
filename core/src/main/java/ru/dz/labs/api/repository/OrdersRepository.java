package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.Order;

import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Repository
public class OrdersRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Order orders) {
        sessionFactory.getCurrentSession().save(orders);
    }

    public Order getGoodsById(Long id) {
        return (Order) sessionFactory.getCurrentSession().load(Order.class, id);
    }


    public List<Order> getAllOrders() {
        return sessionFactory.getCurrentSession().createCriteria(Order.class).list();
    }

}
