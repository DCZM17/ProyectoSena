function validar () {
    var nombreEmpleado, apellidoEmpleado, tipoDocEmpleado, docEmpleado, celularEmpleado, direccionEmpleado, correoUsuario, fotoEmpleado, rolUsuario, estadoUsuario, expresion;

    nombreEmpleado = document.getElementById('nombreEmpleado').value;
    apellidoEmpleado = document.getElementById('apellidoEmpleado').value;
    tipoDocEmpleado = document.getElementById('tipoDocEmpleado').value;
    docEmpleado = document.getElementById('docEmpleado').value;
    celularEmpleado = document.getElementById('celularEmpleado').value;
    direccionEmpleado = document.getElementById('direccionEmpleado').value;
    correoUsuario = document.getElementById('correoUsuario').value;
    fotoEmpleado = document.getElementById('fotoEmpleado').value;
    rolUsuario = document.getElementById('rolUsuario').value;
    estadoUsuario = document.getElementById('estadoUsuario').value;

    expresion = /\w+@\w+\.+[a-z]/;

    if(nombreEmpleado === "" || apellidoEmpleado === "" || tipoDocEmpleado === "" || docEmpleado === "" || celularEmpleado === "" 
        || direccionEmpleado === "" || correoUsuario === "" || fotoEmpleado === "" || rolUsuario === "" || estadoUsuario === ""){
        alert("Debe de completar todos los campos");
        return false;
    }
    else if (nombreEmpleado.lenght>30) {
        alert("El nombre del empleado es demasiado largo");
        return false;
    }
    else if (apellidoEmpleado.lenght>50) {
        alert("Los apellidos del empleado son demasiado largos");
        return false;
    }
    else if (docEmpleado.lenght>11) {
        alert("El documento del empleado es demasiado largo");
        return false;
    }
    else if (celularEmpleado.lenght>15) {
        alert("El numero celular del empleado es demasiado largo");
        return false;
    }
    else if (isNaN(celularEmpleado)){
        alert("El numero celular no puede contener letras")
        return false;
    }
    else if (direccionEmpleado.lenght>100) {
        alert("La direccion del empleado es demasiado largo");
        return false;
    }
    else if (correoUsuario.lenght>40) {
        alert("El correo del empleado es demasiado largo");
        return false;
    }
    else if (!expresion.test(correoUsuario)){
        alert("El correo no es valido");
        return false;
    }
}