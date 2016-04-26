package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.Address;

/**
 * Created by You on 25.12.2015.
 */
@Repository
public class AddressRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Address addresses) {
        sessionFactory.getCurrentSession().save(addresses);
    }

    public Address getCartsById(Long id) {
        return (Address) sessionFactory.getCurrentSession().load(Address.class, id);
    }
}
