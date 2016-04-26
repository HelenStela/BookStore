package ru.dz.labs.api.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @Column(name = "id")   //
    @GeneratedValue(strategy = GenerationType.AUTO)  //
    private Long id;

    @Column(name = "name", length = 100)
    String name;

    @Column(name = "alias", length = 20)
    String alias;

    @ManyToOne
    Category parent;

    @OneToMany
    List<Category> categories;


    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    List<Good> goods;

    public Category() {
    }

    public Category(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }


    public void addGood(Good good) {
        if (goods != null) {
            goods.add(good);
        } else {
            goods = new ArrayList<>();
            goods.add(good);
        }
    }

    public boolean remove(Good good) {
        if (goods == null) return false;
        else return goods.remove(good);
    }
}
