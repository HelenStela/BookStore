package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.Good;


import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Repository
public class GoodsRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Good good) {
        sessionFactory.getCurrentSession().save(good);
    }

    public Good getGoodsById(Long id) {
        return (Good) sessionFactory.getCurrentSession().load(Good.class, id);
    }

    public List<Good> getAllGoods() {
        return (List<Good>) sessionFactory.getCurrentSession().createCriteria(Good.class).list();
    }

}
