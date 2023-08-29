INSERT INTO gyms(cp, phone_number,  address, city, email, name, web) VALUES ('123', '8787382',  'Calle 74','Buenos aires','gym23@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO gyms(cp, phone_number,  address, city, email, name, web) VALUES('321', '8787332',  'Calle 89','New Jersey','gym3@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO gyms(cp, phone_number,  address, city, email, name, web) VALUES('213', '8787213',  'Calle 90','New York','gym4@gmail.com', 'Smartfit', 'http://smartfit.com');
INSERT INTO gyms(cp, phone_number,  address, city, email, name, web) VALUES('133', '8787432' ,  'Calle 74 ','Buenos aires','gym32@gmail.com', 'Smartfit', 'http://smartfit.com');

INSERT INTO memberships(nombre, tipo_membership) VALUES ( 'basic', 'BASIC');
INSERT INTO memberships(nombre, tipo_membership) VALUES( 'medium', 'MEDIUM');
INSERT INTO memberships(nombre, tipo_membership) VALUES( 'pro', 'PRO');
INSERT INTO memberships(nombre, tipo_membership) VALUES( 'premium', 'PREMIUM');

INSERT INTO employees(name, last_name, email, phone_number, membership_id,gym_id) VALUES ( 'Jose', 'Martinez', 'josematinex@gmail.com', '8756784632', 1,1);
INSERT INTO employees(name, last_name, email, phone_number, membership_id,gym_id) VALUES ( 'Carlos', 'Rodriguez', 'carlosrodriguez@gmail.com', '8756784632', 1,1);
INSERT INTO employees(name, last_name, email, phone_number, membership_id,gym_id) VALUES( 'Jairo', 'Narciso', 'jaironarciso@gmail.com', '8756784632', 1,2);
INSERT INTO employees(name, last_name, email, phone_number, membership_id,gym_id) VALUES ( 'Julio', 'Ogando', 'julioogando@gmail.com', '8756784632', 1,2);

INSERT INTO equipments(gym_id, buy_time, description, status, product_name) VALUES(1, NOW(), 'Pesas', 1, 'Pesas');
INSERT INTO equipments(gym_id, buy_time, description, status, product_name) VALUES (1, NOW(), 'Mancuernas', 1, 'Mancuernas');
INSERT INTO equipments(gym_id, buy_time, description, status, product_name) VALUES(2, NOW(), 'Pesas', 1, 'Pesas');
INSERT INTO equipments(gym_id, buy_time, description, status, product_name) VALUES(2, NOW(), 'Mancuernas', 1, 'Mancuernas');

INSERT INTO users(name, last_name, phone_number, born_date, email, address, cp, city, gym_id, membership_id) VALUES('Carlos', 'Perez', '8094345493', '2020-05-02 08:05:00', 'carlosjose@mail.com', 'Calle santiago', '3212', 'Buenos aires', 1, 1);
INSERT INTO users(name, last_name, phone_number, born_date, email, address, cp, city, gym_id, membership_id) VALUES('Mario', 'Bros', '8093245493', '2020-05-02 08:05:00', 'MarioBros@mail.com', 'Calle monopoly', '4312', 'Buenos aires', 1, 1);
INSERT INTO users(name, last_name, phone_number, born_date, email, address, cp, city, gym_id, membership_id) VALUES('Julio', 'Rodriguez', '8434345493', '2020-05-02 08:05:00', 'juliorodriguez@mail.com', 'Calle esquina', '3232', 'Buenos aires', 1, 1);
INSERT INTO users(name, last_name, phone_number, born_date, email, address, cp, city, gym_id, membership_id) VALUES('Jeison', 'Nacho', '8093245493', '2020-05-02 08:05:00', 'jeisonnacho@mail.com', 'Calle mexico', '3212', 'Buenos aires', 1, 1);