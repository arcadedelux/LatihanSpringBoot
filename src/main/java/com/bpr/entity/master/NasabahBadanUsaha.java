/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author bubun
 */
@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class NasabahBadanUsaha {
    @Column(name="nomer_npwp",length=62)
    private String nomerNpwp;
}
