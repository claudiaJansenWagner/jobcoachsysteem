CREATE TABLE deelnemer
(
 id varchar(20) NOT NULL,
 naam varchar(50) NOT NULL ,
 geboortedatum varchar(10) DEFAULT NULL,
 adres varchar(250) DEFAULT NULL,
 telefoonnummer varchar(15) DEFAULT NULL,
 eMail varchar(100) DEFAULT NULL,
 PRIMARY KEY (id)
);

CREATE TABLE contract
(
 nummer varchar(20) NOT NULL,
 begindatum varchar(10) DEFAULT NULL,
 einddatum varchar(10) DEFAULT NULL,
 niveau varchar(30) DEFAULT NULL,
 deelnemer_id varchar(20) NOT NULL FOREIGN KEY,
 PRIMARY KEY (nummer)
);

CREATE TABLE gesprek
(
 id varchar(20) NOT NULL,
 datum varchar(10) DEFAULT NULL,
 soort varchar(50) DEFAULT NULL,
 verslag varchar(3000) DEFAULT NULL,
 deelnemer_id varchar(20) NOT NULL FOREIGN KEY,
 PRIMARY KEY (id)
);

CREATE TABLE leerdoel
(
 id varchar(20) NOT NULL,
 eerste_doel varchar(250) DEFAULT NULL,
 tweede_doel varchar(250) DEFAULT NULL,
 deelnemer_id varchar(20) NOT NULL FOREIGN KEY,
 PRIMARY KEY (id)
);

CREATE TABLE leerdoel
(
 id varchar(20) NOT NULL,
	ziektebeeld varchar(250) DEFAULT NULL,
	ambulanteBegeleider varchar(50) DEFAULT NULL,
	omschrijving varchar(250) DEFAULT NULL,
	indicatieAantalUur int(2) DEFAULT NULL,
begindatumIndicatie varchar(15) DEFAULT NULL,
	einddatumIndicatie varchar(15) DEFAULT NULL,
	 deelnemer_id varchar(20) NOT NULL FOREIGN KEY,
     PRIMARY KEY (id)
    );