package com.spring.model.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.spring.model.constant.APIRequestURL;
import com.spring.model.model.request.DeleteModelMasterRequest;
import com.spring.model.model.request.GetAllModelMasterRequest;
import com.spring.model.model.request.GetModelMasterRequest;
import com.spring.model.model.request.SaveModelMasterRequest;
import com.spring.model.model.request.UpdateModelMasterRequest;
import com.spring.model.user.handler.ModelMasterResourceHandler;

import jakarta.validation.Valid;

@RestController
@RequestMapping(APIRequestURL.BASE_URL)
public class ModelMasterController {

    @Autowired
    private  ModelMasterResourceHandler txnMasterResourceHandler;
    
    
    @PostMapping(APIRequestURL.MODEL_MASTER_POST_API_URL)
    public ResponseEntity<JsonNode> SaveTXNMaster(@RequestHeader HttpHeaders headers,@Valid @RequestBody SaveModelMasterRequest saveTXNMasterRequest) 
    {
        return txnMasterResourceHandler.SaveTXNMazster(headers,saveTXNMasterRequest);
    }

    @PutMapping(APIRequestURL.MODEL_MASTER_PUT_API_URL)
    public ResponseEntity<JsonNode> UpdateTxnMaster(@RequestHeader HttpHeaders headers,@Valid @RequestBody UpdateModelMasterRequest updateTXNMasterRequest) 
    {   	
        return txnMasterResourceHandler.UpdateTxnMaster(headers,updateTXNMasterRequest); 
    }


    @DeleteMapping(APIRequestURL.MODEL_MASTER_DELETE_API_URL)
    public ResponseEntity<JsonNode> DeleteTXNMaster(@RequestHeader HttpHeaders headers, @PathVariable String id, @ModelAttribute DeleteModelMasterRequest deleteTXNMasterRequest) 
    {
    	deleteTXNMasterRequest.setId(id);
        return txnMasterResourceHandler.DeleteTXNMasterMaster(headers, deleteTXNMasterRequest);
    }

    @GetMapping(APIRequestURL.MODEL_MASTER_GET_API_URL)
    public ResponseEntity<JsonNode> GetTXNMaster(@RequestHeader HttpHeaders headers, @PathVariable String id, @ModelAttribute GetModelMasterRequest getTXNMasterRequest) 
    {
    	getTXNMasterRequest.setId(id);
        return txnMasterResourceHandler.GetTXNMaster(headers, getTXNMasterRequest);
    }
     
    @GetMapping(APIRequestURL.MODEL_MASTER_GET_ALL_API_URL)
    public ResponseEntity<JsonNode> GetAllTXNMaster(@RequestHeader HttpHeaders headers, @ModelAttribute GetAllModelMasterRequest getAllTXNMasterRequest) 
    {
    	return txnMasterResourceHandler.GetAllTXNMaster(headers,getAllTXNMasterRequest);
    }
}
