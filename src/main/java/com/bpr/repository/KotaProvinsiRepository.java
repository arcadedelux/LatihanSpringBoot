/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.repository;

import com.bpr.entity.master.KotaKabupaten;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bubun
 */
public interface KotaProvinsiRepository extends CrudRepository <KotaKabupaten,String>{
    List<KotaKabupaten>findAll();
}
