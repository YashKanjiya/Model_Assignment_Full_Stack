package com.spring.model.model.request;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.commonrequest.CommonAllAPIDataRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateModelMasterRequest extends CommonAllAPIDataRequest {

	
	@JsonProperty("_id")
    private String id;

    @JsonProperty("Name")
    private String name;
    
    @JsonProperty("Description")
    private String description;
    
    @JsonProperty("PublicUrl")
    private String publicUrl;
    
    @JsonProperty("status")
    private String status ;
    
    @JsonProperty("dueDate")
    private Date dueDate;
    
    public boolean checkBadRequest() 
    {
//        if (Objects.isNull(this.getUpdateTXNMASTER())
//                || this.getUpdateTXNMASTER().isEmpty()) {
//            return true;
//        }
//        if (!this.getUpdateTXNMASTER().containsKey("_id")
//                || Objects.isNull(this.getUpdateTXNMASTER().get("_id"))) {
//            return true;
//        }
        return false;
    }
    
}
