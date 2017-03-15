/**** CREACION DE LA BASE DE DATOS ****/

DROP DATABASE IF EXISTS bquiet;
CREATE DATABASE IF NOT EXISTS bquiet CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE bquiet;

/**** CREACION DE TABLAS ****/

CREATE TABLE tipousuario (
	id INT(2) AUTO_INCREMENT  NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) UNIQUE NOT NULL

)ENGINE = INNODB;

CREATE TABLE usuarios (
	id INT(6) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_tipousuario INT(1) NOT NULL,
	nombre VARCHAR(50) UNIQUE NOT NULL,
	pass VARCHAR(20) NOT NULL,
	FOREIGN KEY (id_tipousuario) REFERENCES tipousuario (id) ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = INNODB;

CREATE TABLE centros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	provincia VARCHAR(50) NOT NULL default '',
	direccion VARCHAR(150) UNIQUE NOT NULL default ''

) ENGINE = INNODB;


CREATE TABLE usuarios_centros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_usuario INT(50) NOT NULL,
	id_centro INT(5) NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuarios (id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (id_centro) REFERENCES centros (id) ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE = INNODB;

CREATE TABLE registros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	lmax INT(5) NOT NULL,
	lmin INT(5) NOT NULL,
	id_usuario INT(5) NOT NULL,
	fecha DATE UNIQUE NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuarios (id) ON DELETE CASCADE ON UPDATE CASCADE
	
) ENGINE = INNODB;

CREATE TABLE lista_registros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_registro INT(5) NOT NULL,
	valor INT(5) NOT NULL,
	fecha TIME NOT NULL,
	FOREIGN KEY (id_registro) REFERENCES registros (id) ON DELETE CASCADE ON UPDATE CASCADE
	
) ENGINE = INNODB;

CREATE TABLE tokens (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_usuario INT(5) UNIQUE NOT NULL,
	token VARCHAR(36) UNIQUE NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuarios (id) ON DELETE CASCADE ON UPDATE CASCADE
	
) ENGINE = INNODB;


/**** INSERCION EN TABLAS ****/

INSERT INTO tipousuario (nombre) VALUES ('administrador');
INSERT INTO tipousuario (nombre) VALUES ('superusuario');
INSERT INTO tipousuario (nombre) VALUES ('usuario');

INSERT INTO usuarios (id, id_tipousuario, nombre, pass) VALUES (1, 1, 'admin', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (2, 'super', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (2, 'ivan', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (2, 'cris', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (2, 'sergio', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristian', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiann', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannn', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannnn', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannnnn', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannnnnn', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannnnnnnn', 'admin');
INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (3, 'cristiannnnnnnnn', 'admin');

INSERT INTO centros(nombre,provincia,direccion) VALUES ("los llanos","malaga españa","calle llanos");
INSERT INTO centros(nombre,provincia,direccion) VALUES ("los flores","malaga","calle flores");
INSERT INTO centros(nombre,provincia,direccion) VALUES ("los valle","malaga","calle valle");
INSERT INTO centros(nombre,provincia,direccion) VALUES ("los jazmin","malaga","calle jazmin");



INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (2,1);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (3,2);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (4,3);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (5,4);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (6,1);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (7,1);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (8,1);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (9,2);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (10,2);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (11,2);
INSERT INTO usuarios_centros(id_usuario,id_centro) VALUES (12,2);

INSERT INTO registros (id, lmax, lmin, id_usuario, fecha) VALUES (1, 80, 40, 6, "2017/03/15");

INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 85, "09:01:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 81, "09:02:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 80, "09:03:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 77, "09:04:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 73, "09:05:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 81, "09:06:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 71, "09:07:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 68, "09:08:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 50, "09:09:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 20, "09:10:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 30, "09:11:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 45, "09:12:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 66, "09:13:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 33, "09:14:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 28, "09:15:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 55, "09:16:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 81, "09:17:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 67, "09:18:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 34, "09:19:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 76, "09:20:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 55, "09:21:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 53, "09:22:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 75, "09:23:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 66, "09:24:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 80, "09:25:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 83, "09:26:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 81, "09:27:00");
INSERT INTO lista_registros (id_registro, valor, fecha) VALUES (1, 79, "09:28:00");



