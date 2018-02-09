/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.repository;

import com.bpr.entity.master.Agama;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bubun
 */
public interface AgamaRepository extends CrudRepository<Agama,String>{
   public List <Agama> findAll();
    
   public Agama findByNama(String namaAgama);
   
   public List<Agama> findByNamaOrDeskripsi(String nama,String deskripsi);
   
   @Modifying
   @Query("update Agama set nama = ?2, deskripsi = ?3 where id = ?1")
   public int updateNamaAndDescription(String id, String nama, String description);
   
   @Modifying
   @Query("delete from Agama where lower(nama) like%1%")
   public int deleteYangSama(String name);
}
