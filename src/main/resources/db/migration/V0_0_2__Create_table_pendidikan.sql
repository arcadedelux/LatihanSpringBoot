/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bubun
 * Created: Feb 5, 2018
 */

CREATE TABLE master_pendidikan (
  kode_pendidikan CHARACTER VARYING(5)  NOT NULL UNIQUE PRIMARY KEY,
  nama_pendidikan CHARACTER VARYING(50) NOT NULL,
  created_date    TIMESTAMP             NOT NULL,
  created_by      CHARACTER VARYING(255)
);

insert into master_pendidikan (kode_pendidikan, nama_pendidikan, created_date, created_by) VALUES ('sd', 'Sekolah dasar', now(), 'migration'),
  ('smp', 'Sekolah menengah pertama', now(), 'migration'),
('s1', 'Sarjana Strata 1', now(), 'migration');
