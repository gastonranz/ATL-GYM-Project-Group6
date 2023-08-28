INSERT INTO `gym`.gym(cp, phone_number, gym_id,  address, city, email, name, web) VALUES
(123, '8787382' ,1 ,  'Calle 74','Buenos aires','gym23@gmail.com', 'Smartfit', 'http://smartfit.com'),
(321, '8787332' ,2 ,  'Calle 89','New Jersey','gym3@gmail.com', 'Smartfit', 'http://smartfit.com'),
(213, '8787213', 3 ,  'Calle 90','New York','gym4@gmail.com', 'Smartfit', 'http://smartfit.com'),
(133, '8787432' ,4 ,  'Calle 74 ','Buenos aires','gym23@gmail.com', 'Smartfit', 'http://smartfit.com');

INSERT INTO `gym`.membership(membership_id, nombre, tipo_membership) VALUES
( 1, 'basic', 'BASIC'),
( 2, 'medium', 'MEDIUM'),
( 3, 'pro', 'PRO'),
( 4, 'premium', 'PREMIUM');

INSERT INTO `gym`.employee(name, last_name, email, phone_number, gym_id) VALUES
( 'Jose', 'Martinex', 'josematinex@gmail.com', '8756784632', 1),
( 'Carlos', 'Rodriguez', 'josematinex@gmail.com', '8756784632', 2),
( 'Jairo', 'Narciso', 'josematinex@gmail.com', '8756784632', 3),
( 'Julio', 'Ogando', 'josematinex@gmail.com', '8756784632', 4);

INSERT INTO `gym`.equipment(gym_id, buy_time, description, status, product_name) VALUES
(1, NOW(), 'Pesas', 1, 'Pesas'),
(2, NOW(), 'Mancuernas', 1, 'Mancuernas'),
(3, NOW(), 'Pesas', 1, 'Pesas'),
(4, NOW(), 'Mancuernas', 1, 'Mancuernas');

INSERT INTO `gym`.user(name, last_name, email, city, address, phone_number, cp , born_date, membership_id, gym_id) VALUES
('Carlos', 'Jose', 'carlosjose@gmail.com', 'Buenos aires', 'Calle 43', '876574323', 123, NOW(), 1, 1),
('Jose', 'Rodriguez', 'joseRodriguez@gmail.com', 'Hellsinky', 'Calle 48', '875474323', 123, NOW(), 2, 2),
('Mario', 'Perez', 'marioperez@gmail.com', 'New York', 'Calle 40', '876573423', 133, NOW(), 3, 3),
('Gaston', 'Venz', 'gastonBenz@gmail.com', 'New Jersey', 'Calle 53', '832432443', 123, NOW(), 4, 4);