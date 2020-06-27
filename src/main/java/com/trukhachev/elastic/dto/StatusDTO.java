package com.trukhachev.elastic.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StatusDTO {

    private String status;

}
