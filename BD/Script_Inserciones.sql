/*Inserciones Horario Asignado*/
INSERT INTO HorarioAsignado VALUES (NULL,'07:30 A.M','16:30 P.M',TRUE);
SELECT * FROM HorarioAsignado;

/* Inserciones empleado y usuario*/
CALL add_Empleado('vcastro619@gmail.com','Montacarga',TRUE,'CC','1054258985','Valentina','Castro','3165903247','avenida suba # 15 b','3',2);
CALL add_Empleado('dfpiamonte@gmail.com','Conductor',FALSE,'CC','1042930471','David','Piamonte','3287459632','avenida caracas 65 15','4','3');
CALL add_Empleado('duvanzapata0617@gmail.com','Jefe',TRUE,'CC','1031804155','Duvan','Zapata','3117034623','carrera 82 # 39a 14','5',"1");


select * from Soporte ;
SELECT * FROM HorarioAsignado;
SELECT * FROM USUARIO;
SELECT * FROM EMPLEADO;
SELECT * FROM HorarioRegistrado;