package com.spring.model.model.request;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.commonrequest.CommonAllAPIDataRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SaveModelMasterRequest extends CommonAllAPIDataRequest {
	

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
    
    
    public List<String> validate() {
        List<String> errors = new ArrayList<>();
        
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
        
        if (dueDate != null && dueDate.before(new Date(System.currentTimeMillis()))) {
            errors.add("Due date should be a future date");
        }
        
        return errors;
    }
    
	public Boolean checkBadRequest() 
	{
//		if (StringUtils.isEmpty(this.getCompany_id())) 
//		{ 
//			return true; 
//		}
		
		return false;
	}
}
