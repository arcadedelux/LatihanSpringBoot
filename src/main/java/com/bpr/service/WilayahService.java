/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.service;

import com.bpr.entity.master.KotaKabupaten;
import com.bpr.entity.master.Provinsi;
import com.bpr.repository.KotaProvinsiRepository;
import com.bpr.repository.ProvinsiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bubun
 */
@Service
@Transactional(readOnly=true)
public class WilayahService {
    @Autowired
    private KotaProvinsiRepository kotaProvRepository;
   
    @Autowired
    private ProvinsiRepository provRepository;
    
    public List<Provinsi> findAllProvinsi(){
        return this.provRepository.findAll();
    }
    
    public List<KotaKabupaten> findAllKotaKabupaten(){
        return this.kotaProvRepository.findAll();
    }
}
