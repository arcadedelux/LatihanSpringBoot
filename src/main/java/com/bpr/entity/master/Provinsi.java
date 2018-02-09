/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.entity.master;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author bubun
 */
 @Entity
 @Table(name="master_provinsi")
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 
public class Provinsi {
    @Id
    @GenericGenerator(name="uuid_provinsi",strategy="uuid2")
    @Column(name="kode_provinsi",nullable=false,unique=true)
    private String id;
    @Column(name="nama_provinsi",nullable=false,length=50)
    private String nama;
    @Column(name="create_date",nullable=false)
    private Timestamp createDate;
    @Column(name="created_by",length=20)
    private String createdBy;
    
    
    }
    

