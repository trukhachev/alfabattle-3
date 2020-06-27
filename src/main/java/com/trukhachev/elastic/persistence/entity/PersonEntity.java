package com.trukhachev.elastic.persistence.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "persons")
@Data
@Accessors(chain = true)
public class PersonEntity {

    private String id;

    private String docId;

    private String fio;

    private double salary;

    @Field(type = FieldType.Date, store = true, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    private Date birthday;

    private String gender;

}
