/**** CREACION DE LA BASE DE DATOS ****/

DROP DATABASE IF EXISTS bquiet;
CREATE DATABASE IF NOT EXISTS bquiet;

USE bquiet;

/**** CREACION DE TABLAS ****/

CREATE TABLE tipousuario (
	id INT(1) AUTO_INCREMENT  NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) UNIQUE NOT NULL

)ENGINE = INNODB;

CREATE TABLE usuarios (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_tipousuario INT(1) NOT NULL,
	nombre VARCHAR(50) UNIQUE NOT NULL,
	pass VARCHAR(20) NOT NULL,
	FOREIGN KEY (id_tipousuario) REFERENCES tipousuario (id)

) ENGINE = INNODB;

CREATE TABLE centros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL

) ENGINE = INNODB;

CREATE TABLE cursos (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	id_centro INT(5) NOT NULL,
	FOREIGN KEY (id_centro) REFERENCES centros (id)

) ENGINE = INNODB;

CREATE TABLE aulas (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(50),
	id_centro INT(5) NOT NULL,
	FOREIGN KEY (id_centro) REFERENCES centros (id)

) ENGINE = INNODB;

CREATE TABLE usuarios_centros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	id_usuario INT(50) NOT NULL,
	id_centro INT(5) NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuarios (id),
	FOREIGN KEY (id_centro) REFERENCES centros (id)

) ENGINE = INNODB;

CREATE TABLE registros (
	id INT(5) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	fecha DATE NOT NULL,
	hora TIME NOT NULL,
	minima INT(5) NOT NULL,
	maxima INT(5) NOT NULL,
	media INT(5) NOT NULL,
	excesos INT(5) NOT NULL,
	id_aula INT(5) NOT NULL,
	id_curso INT(5) NOT NULL,
	id_usuario INT(5) NOT NULL,
	id_centro INT(5) NOT NULL,
	FOREIGN KEY (id_aula) REFERENCES aulas (id),
	FOREIGN KEY (id_curso) REFERENCES cursos (id),
	FOREIGN KEY (id_usuario) REFERENCES usuarios (id),
	FOREIGN KEY (id_centro) REFERENCES centros (id)

) ENGINE = INNODB;

/**** INSERCION EN TABLAS ****/

INSERT INTO tipousuario (nombre) VALUES ('administrador');
INSERT INTO tipousuario (nombre) VALUES ('superusuario');
INSERT INTO tipousuario (nombre) VALUES ('usuario');

INSERT INTO usuarios (id_tipousuario, nombre, pass) VALUES (1, 'admin', 'admin');