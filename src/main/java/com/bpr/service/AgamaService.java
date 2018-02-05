/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.service;

import com.bpr.entity.master.Agama;
import com.bpr.repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class AgamaService {

    @Autowired
    private AgamaRepository repo ;

    @Transactional(readOnly = false)
    public Agama save(Agama x){
        return repo.save(x);
    }

    public Agama findById(String kode){
        return repo.findOne(kode);
    }

    public List<Agama> findAll(){
        return repo.findAll();
    }

    @Transactional(readOnly = false)
    public void delete(Agama x){
        this.repo.delete(x);
    }

    @Transactional(readOnly = false)
    public void delete(String x){
        this.repo.delete(x);
    }

    @Transactional(readOnly = false)
    public void delete(List<Agama> list){
        this.repo.delete(list);
    }
}