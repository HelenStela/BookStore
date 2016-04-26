package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.User;


import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Repository
public class UsersRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public User getUserById(Long id) {
        return (User) sessionFactory.getCurrentSession().load(User.class, id);
    }

    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }


    public User getUserByEmailAndPass(String email, String hashPass) {
        List<User> users = sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("email", email)).list();
        if (users != null) {
            User user = users.get(0);
            if (user.getHashPassword().equals(hashPass))
                return user;
        }
        return null;

    }

    public User getUserByLogin(String login) {
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("login", login)).uniqueResult();
    }
}
