package com.spring.model.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.commonresponse.CommonAPIDataResponse;
import com.spring.model.model.ModelMaster;
import com.spring.model.model.request.DeleteModelMasterRequest;
import com.spring.model.model.request.GetAllModelMasterRequest;
import com.spring.model.model.request.GetModelMasterRequest;
import com.spring.model.model.request.SaveModelMasterRequest;
import com.spring.model.model.request.UpdateModelMasterRequest;
import com.spring.model.model.response.GetAllModelMasterResponse;
import com.spring.model.model.response.GetModelMasterResponse;
import com.spring.model.model.response.ModelMasterData;
import com.spring.model.model.response.SaveModelMasterResponse;
import com.spring.model.user.dao.ModelMasterQueryDao;
import com.spring.model.user.service.ModelMasterRepository;
import com.spring.model.valid.ValidationErrorResponse;

@Service
public class JPAModelMasterRepository implements ModelMasterRepository {

	@Autowired
	private ModelMasterQueryDao modelMasterQueryDao;
	
	@Override
	public SaveModelMasterResponse saveTxnMaster(SaveModelMasterRequest saveModelMasterRequest) 
	{
		List<String> validationErrors = saveModelMasterRequest.validate();
        if (!validationErrors.isEmpty()) {
            ValidationErrorResponse errorResponse = new ValidationErrorResponse("Validation Failed", validationErrors);
            SaveModelMasterResponse saveModelMasterResponse = new SaveModelMasterResponse();;
    		saveModelMasterResponse.setMessage(errorResponse.getDetails().get(0));
    		return saveModelMasterResponse;
        }
        
		ModelMaster modelMaster=ModelMaster.builder()
				.name(saveModelMasterRequest.getName())
				.description(saveModelMasterRequest.getDescription())
				.status(saveModelMasterRequest.getStatus())
				.dueDate(saveModelMasterRequest.getDueDate())
				.build();
				
		modelMasterQueryDao.save(modelMaster);
		
		SaveModelMasterResponse saveModelMasterResponse = new SaveModelMasterResponse();
		saveModelMasterResponse.setId(modelMaster.getId());
		saveModelMasterResponse.setMessage("MODEL_MASTER_SAVED_SUCCESSFULLY");
		return saveModelMasterResponse;
	}

	@Override
	public CommonAPIDataResponse deleteTxnMaster(DeleteModelMasterRequest deleteTXNMasterRequest) 
	{
		CommonAPIDataResponse commonAPIDataResponse = new CommonAPIDataResponse();

		if (modelMasterQueryDao.findById(deleteTXNMasterRequest.getId()).isPresent()) {
			modelMasterQueryDao.deleteById(deleteTXNMasterRequest.getId());
			commonAPIDataResponse.setMessage("MODEL_MASTER_DATA_DELETED_SUCCESSFULLY");
			commonAPIDataResponse.setCheckValidationFailed(false);
			return commonAPIDataResponse;
        }
		commonAPIDataResponse.setValidationMessage("MODEL_MASTER_DATA_NOT_FOUND");
		commonAPIDataResponse.setCheckValidationFailed(true);
		return commonAPIDataResponse;
	}
	
//
  	@Override
  	public GetModelMasterResponse getTXNMaster(GetModelMasterRequest getModelMasterRequest) 
  	 
  	{
  		GetModelMasterResponse getDataResponse=new GetModelMasterResponse();
  	  	
	    Optional<ModelMaster> modelmaster= modelMasterQueryDao.findById(getModelMasterRequest.getId());
	      
        if (modelmaster.isPresent()) 
        {
      	   
	          	getDataResponse.setMessage("MODEL_MASTER_DATA_FOUND_SUCCESSFULLY");
	          	getDataResponse.setCheckValidationFailed(false);
	            getDataResponse.setModelMasterData(new ModelMasterData(modelmaster.get()));
	            return getDataResponse;
        }
        getDataResponse.setValidationMessage("MODEL_MASTER_DATA_NOT_FOUND");
        getDataResponse.setCheckValidationFailed(true);
        return getDataResponse;
  	 }	

  	public CommonAPIDataResponse updateTXNMaster(UpdateModelMasterRequest updateModelMasterRequest) 
  	{
		CommonAPIDataResponse commonAPIDataResponse = new CommonAPIDataResponse();
		
		List<String> validationErrors = updateModelMasterRequest.validate();
        if (!validationErrors.isEmpty()) {
            ValidationErrorResponse errorResponse = new ValidationErrorResponse("Validation Failed", validationErrors);
            SaveModelMasterResponse saveModelMasterResponse = new SaveModelMasterResponse();;
    		saveModelMasterResponse.setMessage(errorResponse.getDetails().get(0));
    		return saveModelMasterResponse;
        }

		String id = updateModelMasterRequest.getId();
		Optional<ModelMaster> store = modelMasterQueryDao.findById(id);
                 
		if (store.isPresent()) 
		{
			ModelMaster modelMaster=store.get();
			modelMaster.setId(updateModelMasterRequest.getId());
			modelMaster.setName(updateModelMasterRequest.getName());
			modelMaster.setDescription(updateModelMasterRequest.getDescription());
			modelMaster.setStatus(updateModelMasterRequest.getStatus());
			modelMaster.setDueDate(updateModelMasterRequest.getDueDate());
			
	        modelMasterQueryDao.save(modelMaster);  
			commonAPIDataResponse.setCheckValidationFailed(true);
			commonAPIDataResponse.setValidationMessage("MODEL_MASTER_MASTER_DATA_UPDATED_SUCCESSFULLY");
			return commonAPIDataResponse;
		} else {
			commonAPIDataResponse.setCheckValidationFailed(false);
			commonAPIDataResponse.setMessage("MODEL_MASTER_MASTER_MASTER_DATA_NOT_FOUND");
			return commonAPIDataResponse;
		}	
    
  	}
  	
	@Override
  	public GetAllModelMasterResponse AllTXNMasterMaster(GetAllModelMasterRequest getAllModelMasterRequest) 
  	{

		GetAllModelMasterResponse getAllDataResponse = new GetAllModelMasterResponse();
  		boolean flag=false;
  		List<ModelMaster> criteriaArrayList = new ArrayList<>(100);

        if(flag==false)
        {
       	criteriaArrayList.addAll(modelMasterQueryDao.findAll());
        }
        
  		getAllDataResponse.setMessage("MODEL_MASTER_DATA_FOUND");
  		List<ModelMasterData> TXNDataList = new ArrayList<>(criteriaArrayList.size());
  		for (ModelMaster i : criteriaArrayList) 
  		{
  			TXNDataList.add(new ModelMasterData(i));	
        }
        getAllDataResponse.setModelMasterList(TXNDataList);
      
  		return getAllDataResponse;

  	}
}
