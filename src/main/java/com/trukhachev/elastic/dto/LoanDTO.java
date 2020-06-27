package com.trukhachev.elastic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoanDTO {

    @JsonProperty("Loan")
    private String loan;

    @JsonProperty("PersonId")
    private String personId;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("Period")
    private String period;

}
