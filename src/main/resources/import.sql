INSERT INTO `gym`.employee(name, last_name, email, phone_number) VALUES ( 'Jose', 'Martinex', 'josematinex@gmail.com', '8756784632');
INSERT INTO `gym`.employee(name, last_name, email, phone_number) VALUES ( 'Carlos', 'Rodriguez', 'josematinex@gmail.com', '8756784632');
INSERT INTO `gym`.employee(name, last_name, email, phone_number) VALUES ( 'Jairo', 'Narciso', 'josematinex@gmail.com', '8756784632');
INSERT INTO `gym`.employee(name, last_name, email, phone_number) VALUES ( 'Julio', 'Ogando', 'josematinex@gmail.com', '8756784632');

INSERT INTO `gym`.membership(employee_id, membership_id, nombre, tipo_membership) VALUES(1, 1, 'basic', 'BASIC');
INSERT INTO `gym`.membership(employee_id, membership_id, nombre, tipo_membership) VALUES(2, 2, 'medium', 'MEDIUM');
INSERT INTO `gym`.membership(employee_id, membership_id, nombre, tipo_membership) VALUES(3, 3, 'pro', 'PRO');
INSERT INTO `gym`.membership(employee_id, membership_id, nombre, tipo_membership) VALUES(4, 4, 'premium', 'PREMIUM');

INSERT INTO `gym`.gym(cp, phone_number,id_gym, employee_id, membership_id, address, city, email, name, web) VALUES (123, 8787382 ,1 , 1, 1, 'Calle 74','Buenos aires','gym23@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO `gym`.gym(cp, phone_number,id_gym, employee_id, membership_id, address, city, email, name, web) VALUES (321, 8787332 ,2 , 2, 2, 'Calle 89','New Jersey','gym3@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO `gym`.gym(cp, phone_number,id_gym, employee_id, membership_id, address, city, email, name, web) VALUES (213, 8787213, 3 , 3, 3, 'Calle 90','New York','gym4@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO `gym`.gym(cp, phone_number,id_gym, employee_id, membership_id, address, city, email, name, web) VALUES (133, 8787432 ,4 , 4, 4, 'Calle 74 ','Buenos aires','gym23@gmail.com', 'Smartfit', 'http://smartfit.com');

INSERT INTO `gym`.equipment(id_gym, buy_time, description, status, product_name) VALUES (1, NOW(), 'Pesas', 1, 'Pesas');
INSERT INTO `gym`.equipment(id_gym, buy_time, description, status, product_name) VALUES (2, NOW(), 'Mancuernas', 1, 'Mancuernas');
INSERT INTO `gym`.equipment(id_gym, buy_time, description, status, product_name) VALUES (3, NOW(), 'Pesas', 1, 'Pesas');
INSERT INTO `gym`.equipment(id_gym, buy_time, description, status, product_name) VALUES (4, NOW(), 'Mancuernas', 1, 'Mancuernas');

INSERT INTO gym.user(name, last_name, email, city, address, phone_number, cp , born_date,membership_id, id_gym)
VALUES ('Carlos', 'Jose', 'carlosjose@gmail.com', 'Buenos aires', 'Calle 43', '876574323', 123, NOW(), 1, 1);

INSERT INTO gym.user(name, last_name, email, city, address, phone_number, cp , born_date,membership_id, id_gym)
VALUES ('Jose', 'Rodriguez', 'joseRodriguez@gmail.com', 'Hellsinky', 'Calle 48', '875474323', 123, NOW(), 2, 2);

INSERT INTO gym.user(name, last_name, email, city, address, phone_number, cp , born_date,membership_id, id_gym)
VALUES ('Mario', 'Perez', 'marioperez@gmail.com', 'New York', 'Calle 40', '876573423', 133, NOW(), 3, 3);

INSERT INTO gym.user(name, last_name, email, city, address, phone_number, cp , born_date,membership_id, id_gym)
VALUES ('Gaston', 'Venz', 'gastonBenz@gmail.com', 'New Jersey', 'Calle 53', '832432443', 123, NOW(), 4, 4);