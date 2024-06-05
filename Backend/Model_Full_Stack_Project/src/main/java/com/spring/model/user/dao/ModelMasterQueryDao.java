package com.spring.model.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.model.ModelMaster;

@Repository
public interface ModelMasterQueryDao extends JpaRepository<ModelMaster, String> {
	
}
