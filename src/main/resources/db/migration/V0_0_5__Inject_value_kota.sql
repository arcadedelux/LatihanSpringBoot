/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bubun
 * Created: Feb 7, 2018
 */

INSERT INTO master_provinsi
(kode_provinsi, nama_provinsi, created_date, created_by)
VALUES
  ('001', 'Jawa Barat', now(), 'migration'),
  ('002', 'Jawa Timur', now(), 'migration');

INSERT INTO master_kota_kabupaten (kode_kota, nama_kota, created_date, created_by, provinsi_id)
VALUES
  ('001', 'Bandung', now(), 'migration', '001'),
  ('002', 'Jakarta', now(), 'migration', '002'),
('003', 'Banten', now(), 'migration', '001');