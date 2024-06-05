package com.spring.model.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.commonresponse.CommonAPIDataResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetAllModelMasterResponse extends CommonAPIDataResponse {

	@JsonProperty("Model")
    private List<ModelMasterData> modelMasterList;
}
