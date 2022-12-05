CREATE DATABASE bdacarreosgutierrez;
USE bdacarreosgutierrez;

CREATE TABLE  Usuario
(
	idUsuario INTEGER PRIMARY KEY AUTO_INCREMENT,
    correoUsuario VARCHAR(40) NOT NULL UNIQUE,
    contrasenaUsuario VARCHAR (30)NOT NULL ,
	rolUsuario VARCHAR(30) NOT NULL,
    estadoUsuario BOOLEAN NOT NULL
);


CREATE TABLE HorarioAsignado
(
	idHorarioAsignado INT PRIMARY KEY AUTO_INCREMENT,
	horaEntradaAsignada TIME NOT NULL, 
	horaSalidaAsignada TIME NOT NULL,
	estadoHorario BOOLEAN NOT NULL
);

CREATE TABLE Empleado
(
	idEmpleado INTEGER PRIMARY KEY AUTO_INCREMENT,
    tipoDocEmpleado VARCHAR(30) NOT NULL,
    docEmpleado VARCHAR(10) NOT NULL UNIQUE,
    nombreEmpleado VARCHAR(30) NOT NULL,
    apellidoEmpleado VARCHAR(50) NOT NULL,
    celularEmpleado VARCHAR (10) NOT NULL,
    direccionEmpleado VARCHAR(70) NOT NULL,
    fotoEmpleado VARCHAR (100) NOT NULL,
	idHorarioAsignado INT NOT NULL,
    FOREIGN KEY FK_idHorarioAsignado (idHorarioAsignado)
    REFERENCES HorarioAsignado (idHorarioAsignado),
	idUsuario  INT NOT NULL,
	FOREIGN KEY FK_idUsuario (idUsuario)
    REFERENCES Usuario (idUsuario)
);

CREATE TABLE Soporte 
(
	idSoporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoSoporte VARCHAR(30) NOT NULL,
    descripcionSoporte VARCHAR(1000) NOT NULL,
    fechaRegistro VARCHAR(40) NOT NULL,
    fechaSoporte TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP,
    soporte MEDIUMBLOB NOT NULL,
    estadoSoporte VARCHAR (20)  NULL,
	idEmpleado  INT  NOT NULL,
	FOREIGN KEY FK_idEmpleado (idEmpleado)
    REFERENCES Empleado (idEmpleado)
);

CREATE TABLE HorarioRegistrado
(
	idHorarioRegistrado INT PRIMARY KEY AUTO_INCREMENT,
	horaEntradaRegistrada TIME NULL,
	horaSalidaRegistrada TIME NULL,
	horaInicioAlmuerzo TIME NULL,
	horaFinAlmuerzo TIME NULL, 
	fechaRegistro TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	estadoHorarioRegistrado INT NULL,
	idEmpleadoH INT NULL,
	FOREIGN KEY FK_idEmpleadoH (idEmpleadoH)
	REFERENCES Empleado (idEmpleado)
);
