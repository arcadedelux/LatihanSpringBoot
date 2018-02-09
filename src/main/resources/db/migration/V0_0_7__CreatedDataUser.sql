/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bubun
 * Created: Feb 9, 2018
 */
INSERT INTO security.roles (role_name, created_by, created_date) VALUES
  ('Administrator', 'migration', now()),
  ('Operator', 'migration', now());

INSERT INTO security.users (user_id, username, password, is_active, created_by, created_date) VALUES
  ('0001', 'admin', 'admin', TRUE, 'migration', now()),
  ('0002', 'Arief', 'Arief', FALSE, 'migration', now());

INSERT INTO security.user_roles (user_id, role_id) VALUES
  ('0001', (SELECT role_id
            FROM security.roles
            WHERE role_name = 'Administrator')),
  ('0001', (SELECT role_id
            FROM security.roles
            WHERE role_name = 'Operator')),
  ('0002', (SELECT role_id
            FROM security.roles
WHERE role_name = 'Operator'));