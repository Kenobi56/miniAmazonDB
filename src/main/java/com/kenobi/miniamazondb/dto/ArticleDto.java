package com.kenobi.miniamazondb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ArticleDto implements Serializable {

    private String name;


    private String price;


    private Date stock;


    private long soldCount;


    private long lastTimeBought;

}
