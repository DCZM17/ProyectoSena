CREATE DATABASE bdacarreosgutierrez;
USE bdacarreosgutierrez;

CREATE TABLE  Usuario
(
	idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    correoUsuario VARCHAR(40) NOT NULL UNIQUE,
    contrasenaUsuario VARCHAR(30)NULL ,
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
    docEmpleado VARCHAR(11) NOT NULL UNIQUE,
    nombreEmpleado VARCHAR(30) NOT NULL,
    apellidoEmpleado VARCHAR(50) NOT NULL,
    celularEmpleado VARCHAR (15) NOT NULL,
    direccionEmpleado VARCHAR(100) NOT NULL,
    fotoEmpleado VARCHAR (100) NOT NULL,
	estadoEmpleado BOOLEAN NULL,
	idHorarioAsignado INT NULL,
    FOREIGN KEY FK_idHorarioAsignado (idHorarioAsignado)
    REFERENCES HorarioAsignado (idHorarioAsignado),
	idUsuario  INT NULL,
	FOREIGN KEY FK_idUsuario (idUsuario)
    REFERENCES Usuario (idUsuario)
);

CREATE TABLE Soporte 
(
	idSoporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoSoporte VARCHAR(30) NOT NULL,
    descripcionSoporte VARCHAR(1000) NOT NULL,
    fechaRegistro DATETIME NOT NULL,
    fechaSoporte TIMESTAMP NOT NULL  DEFAULT CURRENT_TIMESTAMP,
    soporte VARCHAR (100) NOT NULL,
    estadoSoporte VARCHAR (20)  NULL,
    idEmpleado INT NULL,
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
