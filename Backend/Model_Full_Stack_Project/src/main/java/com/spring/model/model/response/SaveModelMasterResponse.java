package com.spring.model.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.commonresponse.CommonAPIDataResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SaveModelMasterResponse extends CommonAPIDataResponse {

	@JsonProperty("_id")
    private String id;
}
