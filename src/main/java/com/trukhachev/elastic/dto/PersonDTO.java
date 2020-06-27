package com.trukhachev.elastic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersonDTO {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("DocId")
    private String docId;

    @JsonProperty("FIO")
    private String fio;

    @JsonProperty("Birthday")
    private String birthday;

    @JsonProperty("Salary")
    private String salary;

    @JsonProperty("Gender")
    private String gender;

}
