/*Proceimiento Insertar*/
DELIMITER //
CREATE PROCEDURE add_Empleado(
IN _correoUsuario VARCHAR(30),
IN _rolUsuario VARCHAR(30),
IN _estadoUsuario BOOLEAN,
IN _tipoDocEmpleado VARCHAR(30),
IN _docEmpleado VARCHAR(30),
IN _nombreEmpleado VARCHAR(30),
IN _apellidoEmpleado VARCHAR(30),
IN _celularEmpleado VARCHAR (15),
IN _direccionEmpleado VARCHAR(100),
IN _fotoEmpleado VARCHAR(100)
)
BEGIN
    INSERT INTO Usuario (correoUsuario,  rolUsuario, estadoUsuario) VALUES(_correoUsuario,  _rolUsuario, _estadoUsuario);
    INSERT INTO Empleado (tipoDocEmpleado,docEmpleado, nombreEmpleado, apellidoEmpleado, celularEmpleado, direccionEmpleado,fotoEmpleado,idUsuario) VALUES(_tipoDocEmpleado, _docEmpleado, _nombreEmpleado, _apellidoEmpleado, _celularEmpleado, _direccionEmpleado,_fotoEmpleado,  (SELECT idUsuario FROM usuario ORDER BY idUsuario DESC LIMIT 1));
END//

CALL add_Empleado('ducadianis1@hotmail.com','Conductor',TRUE,'ce','101903851','Diana','Reyes','3134470215','carrera 82 # 39a 14','5');

/*Proceimiento Actualizar*/
DELIMITER //
CREATE PROCEDURE edit_Empleado(
IN _idUsuario INT,
IN _correoUsuario VARCHAR(30),
IN _rolUsuario VARCHAR(30),
IN _estadoUsuario BOOLEAN,
IN _tipoDocEmpleado VARCHAR(30),
IN _docEmpleado VARCHAR(30),
IN _nombreEmpleado VARCHAR(30),
IN _apellidoEmpleado VARCHAR(30),
IN _celularEmpleado VARCHAR (15),
IN _direccionEmpleado VARCHAR(100),
IN _idEmpleado INTEGER 
)
BEGIN
    UPDATE Usuario SET 
    correoUsuario = _correoUsuario,
    rolUsuario = _rolUsuario,
    estadoUsuario = _estadoUsuario
    WHERE idUsuario = _idUsuario;
    UPDATE Empleado set 
    tipoDocEmpleado = _tipoDocEmpleado,
    docEmpleado = _docEmpleado,
    nombreEmpleado = _nombreEmpleado,
    apellidoEmpleado = _apellidoEmpleado,
    celularEmpleado =  _celularEmpleado,
    direccionEmpleado = _direccionEmpleado
    WHERE idEmpleado = _idEmpleado;
END//

/*Procedimiento eliminar*/ 
DELIMITER //
CREATE PROCEDURE delete_Empleado(
IN _idEmpleado INT,
IN _idUsuario INT
)BEGIN
DELETE FROM Empleado WHERE idEmpleado = _idEmpleado;
DELETE FROM Usuario WHERE idUsuario = _idUsuario;
END//

CALL delete_Empleado ('1','1');

/*Consulta multitabla*/
SELECT Usuario.idUsuario, Empleado.nombreEmpleado, Empleado.apellidoEmpleado,Empleado.docEmpleado, Usuario.correoUsuario, Usuario.estadoUsuario 
FROM Usuario
INNER JOIN Empleado ON Usuario.idUsuario=Empleado.idUsuario;
SELECT * FROM USUARIO;
SELECT * FROM EMPLEADO;
