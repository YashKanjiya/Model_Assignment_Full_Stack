package com.spring.model.model.request;


import com.spring.model.commonrequest.CommonAllAPIDataRequest;

import io.micrometer.common.util.StringUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeleteModelMasterRequest extends CommonAllAPIDataRequest {

	private String id;

    public boolean checkBadRequest() 
    {
        if (StringUtils.isEmpty(this.getId())) {
            return true;
        }
        return false;
    }
}