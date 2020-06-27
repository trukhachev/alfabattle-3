package com.trukhachev.elastic.persistence.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "loans")
@Data
@Accessors(chain = true)
public class LoanEntity {

    private String id;

    private String document;

    private double amount;

    @Field(type = FieldType.Date, store = true, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    private Date StartDate;

}
