package com.workshopspringbootmongodb.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class Post {

    private String id;
    private Date date;
    private String title;
    private String body;
}
