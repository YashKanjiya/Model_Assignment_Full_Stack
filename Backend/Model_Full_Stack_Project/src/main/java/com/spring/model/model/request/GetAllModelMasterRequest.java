package com.spring.model.model.request;

import com.spring.model.commonrequest.CommonAllAPIDataRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetAllModelMasterRequest extends CommonAllAPIDataRequest {

        // Filter
		private String name;

       //  search
		private String keyword;

		public boolean checkBadRequest() {
//	        if (StringUtils.isEmpty(this.getCompany_id())) {
//	            return true;
//	        }
			return false;
		}
}
