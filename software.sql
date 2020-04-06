
CREATE TABLE Materia(
codigoM VARCHAR(50) NOT NULL PRIMARY KEY,
nombre VARCHAR(50)
);
CREATE TABLE Tutor(
codigoT VARCHAR(50) NOT NULL PRIMARY KEY,
nombre VARCHAR(50),
carrera VARCHAR(50),
telefono VARCHAR(50)  
);
CREATE TABLE Estudiante(
codigoE VARCHAR(50) NOT NULL  PRIMARY KEY,
nombre VARCHAR(50),
carrera VARCHAR(50),
telefono VARCHAR(50)  
);

CREATE TABLE Grupo(
codigoG VARCHAR(50)  NOT NULL  PRIMARY KEY,
codigoT VARCHAR(50),
codigoM VARCHAR(50) NOT NULL,
descripcion VARCHAR(250) NOT NULL,
nombre VARCHAR(50),
CONSTRAINT codigoT FOREIGN KEY (codigoT) REFERENCES Tutor (codigoT),
CONSTRAINT codigoM FOREIGN KEY (codigoM) REFERENCES Materia (codigoM)
);

CREATE TABLE Grupos_Estudiantes(
codigo VARCHAR(50)  NOT NULL  PRIMARY KEY,
codigoE VARCHAR(50),
codigoG VARCHAR(50),
CONSTRAINT codigoE FOREIGN KEY (codigoE) REFERENCES Estudiante (codigoE),
CONSTRAINT codigoG FOREIGN KEY (codigoG) REFERENCES Grupo (codigoG)
);

insert into Materia values
( "1013","Bases 2"),
( "1012","Fundamentos de programacion"),
( "1011","Redes 1"),
( "9999","Redes 2"),
( "8888","Automatas"),
( "7777","Imgles 2"),
( "6666","Ingles 3"),
( "5555","Software 2"),
( "4444","Ingles 1"),
("3333", "Software 1" ),
("2222","Bases 1"),
("1111","Calculo 1");

insert into Tutor values( "1001", "Jair Panqueva","Ing. Sistemas", "304312121"),
("1002", "Edinson Jose", "Ing. Electrica", "304312121"),
("1003","Cristiano Ronaldo",  "Ing. Metalurgica", "304312143"),
("1004","Leonel Messi",  "Ing. Quimica", "304321776"),
("1005","Angel Di Maria",  "Ing. Industrial", "3654612121"),
("1006","Tyler joseph",  "Ing. Sistemas", "3048766121"),
("1007","Jhos Duan",  "Ing. Sistemas", "3042122321"),
("1008","Gerard Guey",  "Ing. Metalurgica", "3043179801"),
("1009","Diomedes Dias",  "Ing. Mecanica", "3043188978"),
("1010","Alex Tuerner",  "Ing. Mecanica", "3044534521"),
("1012","Axel Rose",  "Ing. Mecanica", "3044534521"),
("1011","Juliana Mantilla",  "Ing. Sistemas", "304312121");

insert into Estudiante values("216001", "Brain Jose", "ing. Sistemas", "312212121"),
("216002", "Jose Arturo", "ing. Electrica", "312212120"),
("216003","Juan Jose",  "ing. Petroleos", "312212122"),
("216004","Alessia Cara",  "ing. Mecanica", "312212123"),
("216005","ALex Ferreira",  "ing. Industrial", "312212234"),
("216006","Ariana Grande",  "ing. Quimica", "312212457"),
("216007","Dua Lipa",  "ing. Sistemas", "312212675"),
("216008","Julian Casblanca",  "ing. Mecanica", "312872122"),
("216009","Billie Eilish",  "ing. Metalurgica", "327867122"),
("216010","Camilo sexto",  "ing. Industrial", "226786722"),
("216011","Carla Morrison",  "ing. Mecanica", "312154675"),
("216012","Childish Gambino",  "ing. Sistemas", "312212543"),
("216013", "Sebastian Tami", "ing. Industrial", "312212123");

insert into Grupo values("1", "1010","1013","centro de estudios de sistemas","J1"),
("2", "1006","5555","centro de estudios de Quimica","H2"),
("3", "1007","1012","centro de estudios de Mecanica","H3"),
("4", "1004","3333","centro de estudios de Petroleos","T3"),
("5", "1010","1011","centro de estudios de Metalurgica","AD4"),
("6", "1009","6666","centro de estudios de Electrica","DE2"),
("7", "1003","9999","centro de estudios de sistemas","TE4");

insert into Grupos_Estudiantes values("1","216001","1"),
("2","216002","1"),
("3","216003","1"),
("21","216004","1"),
("4","216005","2"),
("5","216007","2"),
("6","216008","2"),
("7","216009","3"),
("8","216012","3"),
("9","216013","3"),
("10","216004","4"),
("11","216008","4"),
("13","216011","4"),
("14","216005","5"),
("12","216002","5"),
("15","216011","5"),
("16","216009","6"),
("17","216012","6"),
("18","216007","6"),
("20","216003","7"),
("19","216001","7");
