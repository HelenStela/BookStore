package ru.dz.labs.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Goods")
public class Good implements Serializable {
    @Id
    @Column(name = "id")   // обозначает имя колонки, соответствующей данному полю
    @GeneratedValue(strategy = GenerationType.AUTO)  // определяет способ генерации
    private Long id;

    @Column(name = "name", length = 100)
    String name;

    @Column(name = "year")
    Integer year;

    @Column(name = "country", length = 100)
    String country;

    @Column(name = "price")
    Double price;

    @Column(name = "count")
    Integer count;

    @Column(name = "size")
    Integer size;

    @Column(name = "image")
    String image;

    @Column(name = "description")
    String description;

    @OneToMany
    private List<Comment> commentList;

    @ManyToOne()
    Category category;

    public Good() {
    }

    public Good(Long id) {
        this.id = id;
    }

    public Good(String name, Double price, Integer count, String description) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.description = description;
    }


    public Good(String name, Double price, Integer count, String description, Category category) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.description = description;
        this.category = category;
    }

    public Good(String name, Integer year, String country, Double price, Integer count, Integer size, String description) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.price = price;
        this.count = count;
        this.size = size;
        this.description = description;
    }

    public Good(String name, Integer year, String country, Double price, Integer count, Integer size, String description, Category category) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.price = price;
        this.count = count;
        this.size = size;
        this.description = description;
    }

    public Good(Double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Good(String name, Integer year, String country, Double price, Integer count, Integer size, String image, String description, List<Comment> commentList, Category category) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.price = price;
        this.count = count;
        this.size = size;
        this.image = image;
        this.description = description;
        this.commentList = commentList;
        this.category = category;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
