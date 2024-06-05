package com.spring.model.user.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.spring.model.commonresponse.CommonAPIDataResponse;
import com.spring.model.helper.HeaderProcessingHelper;
import com.spring.model.model.request.DeleteModelMasterRequest;
import com.spring.model.model.request.GetAllModelMasterRequest;
import com.spring.model.model.request.GetModelMasterRequest;
import com.spring.model.model.request.SaveModelMasterRequest;
import com.spring.model.model.request.UpdateModelMasterRequest;
import com.spring.model.model.response.GetAllModelMasterResponse;
import com.spring.model.model.response.GetModelMasterResponse;
import com.spring.model.model.response.SaveModelMasterResponse;
import com.spring.model.user.service.ModelMasterRepository;
import com.spring.model.utils.Utils;

@Component
public class ModelMasterResourceHandler {

	@Autowired
    private ModelMasterRepository txnMasterRepository;

    public ResponseEntity<JsonNode>SaveTXNMazster(HttpHeaders headers, SaveModelMasterRequest saveTXNMasterRequest) 
    {
        HeaderProcessingHelper.setRequestHeaders(saveTXNMasterRequest, headers);

        if (saveTXNMasterRequest.checkBadRequest()) 
        {
            return new ResponseEntity<>(Utils.generateErrorResponse("BAD_REQUEST"), HttpStatus.OK);
        }
        SaveModelMasterResponse saveTXNMasterResponse = txnMasterRepository.saveTxnMaster(saveTXNMasterRequest);
        return Utils.getJsonNodeResponseEntity(saveTXNMasterResponse);
    }

    public ResponseEntity<JsonNode> UpdateTxnMaster(HttpHeaders headers, UpdateModelMasterRequest updateTXNMasterRequest) 
    {
        HeaderProcessingHelper.setRequestHeaders(updateTXNMasterRequest, headers);

        if (updateTXNMasterRequest.checkBadRequest()) {
            return new ResponseEntity<>(Utils.generateErrorResponse("BAD_REQUEST"), HttpStatus.OK);
        }
        CommonAPIDataResponse commonAPIDataResponse = txnMasterRepository.updateTXNMaster(updateTXNMasterRequest);
        return Utils.getJsonNodeResponseEntity(commonAPIDataResponse);
    }

    public ResponseEntity<JsonNode> DeleteTXNMasterMaster(HttpHeaders headers, DeleteModelMasterRequest deleteTXNMasterRequest) 
    {
        HeaderProcessingHelper.setRequestHeaders(deleteTXNMasterRequest, headers);

        if (deleteTXNMasterRequest.checkBadRequest()) 
        {
            return new ResponseEntity<>(Utils.generateErrorResponse("BAD_REQUEST"), HttpStatus.OK);
        }
        CommonAPIDataResponse commonAPIDataResponse = txnMasterRepository.deleteTxnMaster(deleteTXNMasterRequest);
        return Utils.getJsonNodeResponseEntity(commonAPIDataResponse);
    }
//
//
    public ResponseEntity<JsonNode> GetTXNMaster(HttpHeaders headers, GetModelMasterRequest getTXNMasterRequest) 
    {
        HeaderProcessingHelper.setRequestHeaders(getTXNMasterRequest, headers);

        if (getTXNMasterRequest.checkBadRequest()) 
        {
            return new ResponseEntity<>(Utils.generateErrorResponse("BAD_REQUEST"), HttpStatus.OK);

        }
        GetModelMasterResponse getTXNMasterResponse = txnMasterRepository.getTXNMaster(getTXNMasterRequest);
        return Utils.getJsonNodeResponseEntity(getTXNMasterResponse);
    }

    public ResponseEntity<JsonNode> GetAllTXNMaster(HttpHeaders headers, GetAllModelMasterRequest getAllTXNMasterRequest) 
    {
        HeaderProcessingHelper.setRequestHeaders(getAllTXNMasterRequest, headers);

        if (getAllTXNMasterRequest.checkBadRequest()) {
            return new ResponseEntity<>(Utils.generateErrorResponse("BAD_REQUEST"), HttpStatus.OK);
        }
        GetAllModelMasterResponse getAllTXNMasterResponse = txnMasterRepository.AllTXNMasterMaster(getAllTXNMasterRequest);
        return Utils.getJsonNodeResponseEntity(getAllTXNMasterResponse);
    }

}
