/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.repository;

import com.bpr.entity.master.Pendidikan;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bubun
 */
public interface PendidikanRepository extends CrudRepository<Pendidikan, String> {
    public List<Pendidikan> findAll();
}
