package com.kenobi.miniamazondb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class UserDto implements Serializable {

    private String firstName;


    private String lastName;


    private String email;

}
