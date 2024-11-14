package com.kenobi.miniamazondb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Article")
@Getter
@Setter
@RequiredArgsConstructor
public class Article implements Serializable {

    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Price", nullable = false)
    private String price;

    @Column(name = "Stock", nullable = false)
    private Date stock;

    @Column(name = "SoldCount", nullable = false)
    private long soldCount;

    @Column(name = "LastTimeBought", nullable = false)
    private long lastTimeBought;

    public Article(String name, String price, Date stock, long soldCount, long lastTimeBought) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.soldCount = soldCount;
        this.lastTimeBought = lastTimeBought;
    }
}
