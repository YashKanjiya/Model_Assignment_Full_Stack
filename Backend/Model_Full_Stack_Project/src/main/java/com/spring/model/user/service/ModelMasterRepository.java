package com.spring.model.user.service;

import com.spring.model.commonresponse.CommonAPIDataResponse;
import com.spring.model.model.request.DeleteModelMasterRequest;
import com.spring.model.model.request.GetAllModelMasterRequest;
import com.spring.model.model.request.GetModelMasterRequest;
import com.spring.model.model.request.SaveModelMasterRequest;
import com.spring.model.model.request.UpdateModelMasterRequest;
import com.spring.model.model.response.GetAllModelMasterResponse;
import com.spring.model.model.response.GetModelMasterResponse;
import com.spring.model.model.response.SaveModelMasterResponse;


public interface ModelMasterRepository {

    SaveModelMasterResponse saveTxnMaster(SaveModelMasterRequest saveTXNMasterRequest);

    CommonAPIDataResponse updateTXNMaster(UpdateModelMasterRequest updateTXNMasterRequest);

    CommonAPIDataResponse deleteTxnMaster(DeleteModelMasterRequest deleteTXNMasterRequest);

    GetModelMasterResponse getTXNMaster(GetModelMasterRequest getTXNMasterRequest);
    
    GetAllModelMasterResponse AllTXNMasterMaster(GetAllModelMasterRequest getAllTXNMasterRequest);

}
