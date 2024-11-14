package com.kenobi.miniamazondb.compositeKeys;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CompositePrimaryKey implements Serializable {

    private Integer userId;

    private Integer articleId;


}