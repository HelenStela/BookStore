package ru.dz.labs.api.domain;

import javax.persistence.*;

/**
 * Created by Elena on 13.04.2016.
 */
@Entity
public class Comment {

    @Id
    @Column(name = "id")   // обозначает имя колонки, соответствующей данному полю
    @GeneratedValue(strategy = GenerationType.AUTO)  // определяет способ генерации
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long goodId;

    private String text;

    public Comment(Long userId, Long goodId) {
        this.userId = userId;
        this.goodId = goodId;
    }

    public Comment(Long userId, Long goodId, String text) {
        this.userId = userId;
        this.goodId = goodId;
        this.text = text;
    }

    public Comment() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
