package com.workshopspringbootmongodb.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class Comment {

    private String id;
    private String text;
    private Date date;

}
