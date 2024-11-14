package com.kenobi.miniamazondb.entities;

import com.kenobi.miniamazondb.compositeKeys.CompositePrimaryKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "BoughtHistory")
@Getter
@Setter
@RequiredArgsConstructor
@IdClass(CompositePrimaryKey.class)
public class BoughtHistory implements Serializable {

    @Id
    @Column(name = "UserId", nullable = false)
    private Integer userId;

    @Id
    @Column(name = "ArticleId", nullable = false)
    private Integer articleId;

    @Column(name = "BoughtCount")
    private Integer boughtCount;


}
