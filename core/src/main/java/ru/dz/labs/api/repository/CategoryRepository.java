package ru.dz.labs.api.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dz.labs.api.domain.Category;


import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Repository
public class CategoryRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Category categories) {
        sessionFactory.getCurrentSession().save(categories);
    }

    public Category getCategoryById(Long id) {
        return (Category) sessionFactory.getCurrentSession().load(Category.class, id);
    }

    public List<Category> getAllCategories() {
        return sessionFactory.getCurrentSession().createCriteria(Category.class).list();
    }

}
