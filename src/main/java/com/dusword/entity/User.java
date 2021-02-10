package com.dusword.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
@Data
public class User {
    @Id
    private Integer ID;
    private String username;

}
