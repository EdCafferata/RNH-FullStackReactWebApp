-- DROP TABLE IF EXISTS SCHIP;  (((####!!! let op negeer de melding dat colum niet klopt...!! voor H2 is deze nu goed, een meer (eerste omdat die normaal auto gaat  !!!###)))
-- CREATE TABLE SCHIP (aisnummer INT(12), klasse VARCHAR(50) NOT NULL,  naamschip VARCHAR(50) NOT NULL, naamschipper VARCHAR(50) NOT NULL, scheepstype VARCHAR(50) NOT NULL, swrating double NOT NULL);
INSERT INTO SCHIP VALUES ('1', '244620218', 'Toerklasse', 'Piper Rising', 'Ed Cafferata',  'One Off Oyster', '85');
INSERT INTO SCHIP VALUES ('2', '244620217', 'Toerklasse', 'Van Lint', 'Marc Van Lint', 'Dehler 34 NEW', '75');
INSERT INTO SCHIP VALUES ('3', '244620215', 'Toerklasse', 'Piper 3', 'Ed',  'Swift', '85');
INSERT INTO SCHIP VALUES ('4', '244620214', 'ORC', 'Van Lint  4', 'Marc', 'is Echt', '75');
INSERT INTO SCHIP VALUES ('5', '244620213', 'Toerklasse', '44 Piper Rising', 'John',  'Veel', '95');
INSERT INTO SCHIP VALUES ('6', '244620212', 'ORC', 'Van Lint 6', 'Doe', 'Leuker', '75');
INSERT INTO SCHIP VALUES ('7', '244620211', 'Toerklasse', 'Piper 1 Rising', 'Iets',  'iOS', '85');
INSERT INTO SCHIP VALUES ('8', '244620210', 'Two handed', '9 Van Lint', 'Anders', 'ook', '75');
INSERT INTO SCHIP VALUES ('9', '244620209', 'Toerklasse', 'Piper Rising 44', 'Met Je',  'trouwens :-)', '55');
INSERT INTO SCHIP VALUES ('10', '244620208', 'Wedstrijdklasse', 'Van Lint 44', 'Tijd', 'laatste...', '35');

-- DROP TABLE IF EXISTS AISDATA;
-- CREATE TABLE AISDATA (aisnummer INT(12), course INT(4) NOT NULL, heading INT(4), invoerder VARCHAR(250) NOT NULL, lat double NOT NULL, lon double NOT NULL,  schipid VARCHAR(250) NOT NULL, speed INT(6) NOT NULL, status INT(2) NOT NULL, timestamp VARCHAR(25) NOT NULL);
INSERT INTO AISDATA VALUES ('1', '244620218', '133', '146', 'Ed', '52.458826', '4.561208', '123', '6', '0', '20200615 23:59.59', '1');
INSERT INTO AISDATA VALUES ('2', '244620217', '133', '146', 'Ed', '52.490902', '4.547640', '123', '6', '0', '20200615 23:59.59', '2');
INSERT INTO AISDATA VALUES ('3', '244620216', '133', '146', 'Ed', '52.517025', '4.559288', '123', '6', '0', '20200615 23:59.59', '3');
INSERT INTO AISDATA VALUES ('4', '244620215', '133', '146', 'Ed', '52.908654', '4.660611', '123', '6', '0', '20200615 23:59.59', '4');
INSERT INTO AISDATA VALUES ('5', '244620214', '133', '146', 'Ed', '53.045919', '5.099955', '123', '6', '0', '20200615 23:59.59', '5');
INSERT INTO AISDATA VALUES ('6', '244620213', '133', '146', 'Ed', '53.029404', '5.327883', '123', '6', '0', '20200615 23:59.59', '6');
INSERT INTO AISDATA VALUES ('7', '244620212', '133', '146', 'Ed', '52.785904', '5.154919', '123', '6', '0', '20200615 23:59.59', '7');
INSERT INTO AISDATA VALUES ('8', '244620211', '133', '146', 'Ed', '52.739368', '5.528301', '123', '6', '0', '20200615 23:59.59', '8');
INSERT INTO AISDATA VALUES ('9', '244620210', '133', '146', 'Ed', '52.564602', '5.476516', '123', '6', '0', '20200615 23:59.59', '9');
INSERT INTO AISDATA VALUES ('10', '244620209', '133', '146', 'Ed', '52.537104', '5.437029', '123', '6', '0', '20200615 23:59.59', '10');



-- Edc 20200604 invoer data voor, USER, SCHIPPER, aisdata
-- drie verschillende rollen die getest kunnen worden met Marc, Anja en Rainier. ook alle rollen aan 1 user kan getest worden met Ed !
DROP TABLE IF EXISTS USER;
-- DATA USER
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620218', 'Ed', 'Cafferata', 'cafferata@live.nl', 'rol_gebruiker');
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620218', 'Ed', 'Cafferata', 'cafferata@live.nl', 'rol_schipper');
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620218', 'Ed', 'Cafferata', 'cafferata@live.nl', 'rol_admin');
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620217', 'Marc', 'vLint', 'a@b.nl', 'rol_admin');
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620217', 'Anja', 'vLint', 'c@d.nl', 'rol_schipper');
-- INSERT INTO user (aisnummer, voornaam, achternaam, email, security_rol) VALUES ('244620216', 'Rainier', 'Groot', 'e@f.nl', 'rol_gebruiker');
