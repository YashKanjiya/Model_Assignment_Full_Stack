package com.spring.model.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.model.model.ModelMaster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ModelMasterData{


    @JsonProperty("_id")
    private String id;

    @JsonProperty("Name")
    private String name;
    
    @JsonProperty("Description")
    private String description;
    
    @JsonProperty("status")
    private String status ;
    
    @JsonProperty("dueDate")
    private String dueDate;
    

	public ModelMasterData(ModelMaster modelMaster) 
	{
		this.id=modelMaster.getId();
		this.name=modelMaster.getName();
		this.description=modelMaster.getDescription();
		this.status=modelMaster.getStatus();
		this.dueDate=modelMaster.getDueDate().toString();
	}
	

}
