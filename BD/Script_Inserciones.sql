/* Inserciones empleado y usuario*/
CALL add_Empleado('pnlopez5@gmail.com','Supervisor',TRUE,'CE','1031803155','Paula','Lopez','3228410325','calle 125 c bis 94 31','2');
CALL add_Empleado('vcastro619@gmail.com','Montacarga',TRUE,'CC','1054258985','Valentina','Castro','3165903247','avenida suba # 15 b','3');
CALL add_Empleado('dfpiamonte@gmail.com','Conductor',FALSE,'CC','1042930471','David','Piamonte','3287459632','avenida caracas 65 15','4');
CALL add_Empleado('ducadianis@hotmail.com','Conductor',TRUE,'CE','1019038541','Diana','Reyes','3134470215','carrera 82 # 39a 14','5');

/* Creacion de usuario para acceder al sistema*/
INSERT INTO Usuario VALUES (NULL,'pnlopez55@gmail.com','12345','Jefe',TRUE);
INSERT INTO Usuario VALUES (NULL,'dczapata55@gmail.com','23456','Conductor',TRUE);
INSERT INTO Usuario VALUES (NULL,'plopez55@gmail.com','12345','Supervisor',TRUE);
INSERT INTO Usuario VALUES (NULL,'dzapata55@gmail.com','23456','Montacarga',TRUE);

/*Inserciones Horario Asignado*/
INSERT INTO HorarioAsignado VALUES (NULL,'07:30 A.M','16:30 P.M',TRUE);
INSERT INTO HorarioAsignado VALUES (NULL,'08:00 A.M','17:00 P.M',TRUE);
INSERT INTO HorarioAsignado VALUES (NULL,'08:30 A.M','17:30 P.M',TRUE);
SELECT * FROM HorarioAsignado;

/*Inserciones Soportes*/
INSERT INTO Soporte VALUES(NULL,'Inasistencia','Soporte medico','2022-05-15 07:40:00','2022-07-14 08:00:00','Medicina',null,null);
INSERT INTO Soporte VALUES(NULL,'Permiso','Calamidad domestica','2022-06-10 08:20:00','2022-07-14 08:30:00','Acta_de_defuncion',null,null);
INSERT INTO Soporte VALUES(NULL,'Retardo','Reunion academica','2022-04-21 10:40:00','2022-04-21 11:30:00','Circular',null,null);
select * from Soporte;