package com.spring.model.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name="Model")
public class ModelMaster {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="_id")
    private String id;

    @NotEmpty(message = "Name cannot be empty")
    @Column(name="Name")
    private String name;
    
    @Column(name="Description")
    private String description;
    
    @Column(name="PublicUrl")
    private String publicUrl;
    
    @Column(name="status")
    private String status ;
    
    @Future(message = "Due date should be a future date")
    @Column(name="dueDate")
    private Date dueDate;
    
}
