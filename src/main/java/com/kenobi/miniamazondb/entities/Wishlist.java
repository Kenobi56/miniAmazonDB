package com.kenobi.miniamazondb.entities;

import com.kenobi.miniamazondb.compositeKeys.CompositePrimaryKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "Wishlist")
@Getter
@Setter
@RequiredArgsConstructor
@IdClass(CompositePrimaryKey.class)
public class Wishlist implements Serializable {

    @Id
    @Column(name = "UserId", nullable = false)
    private String userId;

    @Id
    @Column(name = "ArticleId", nullable = false)
    private String articleId;


}
