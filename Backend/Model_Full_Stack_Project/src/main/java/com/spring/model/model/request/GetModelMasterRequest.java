package com.spring.model.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.commonrequest.CommonAllAPIDataRequest;

import io.micrometer.common.util.StringUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetModelMasterRequest extends CommonAllAPIDataRequest {

	@JsonProperty("_id")
	private String id;

    public boolean checkBadRequest() {
        if (StringUtils.isEmpty(this.getId())) {
            return true;
        }
        return false;
    }
}
