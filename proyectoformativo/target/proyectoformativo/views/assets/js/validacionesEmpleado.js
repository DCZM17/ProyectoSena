function validar() {

    var nombreEmpleado;
    var apellidoEmpleado;
    var tipoDocEmpleado;
    var docEmpleado;
    var celularEmpleado;
    var direccionEmpleado;
    var correoUsuario;
    var fotoEmpleado;
    var rolUsuario;
    var estadoUsuario;

    //RECOLECCION DE DATOS EN VARIABLES
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

    //VARIABLES VALIDACION DE LONGITUD DE CARACTERES 
    var numeroCaracteresNombre = nombreEmpleado.length;
    var numeroCaracteresApellido = apellidoEmpleado.length;
    var numeroCaracteresDocumento = docEmpleado.length;
    var numeroCaracteresCelular = celularEmpleado.length;
    var numeroCaracteresDireccion = direccionEmpleado.length;
    var numeroCaracteresCorreo = correoUsuario.length;

    //VALIDACION DE CAMPOS VACIOS
    if (nombreEmpleado === "" || apellidoEmpleado === "" || tipoDocEmpleado === "" || docEmpleado === "" || celularEmpleado === "" ||
        direccionEmpleado === "" || correoUsuario === "" || fotoEmpleado === "" || rolUsuario === "" || estadoUsuario === "") {
        alert("Debe de completar todos los campos");
        return false;
    }

    //VALIDACION DE LONGITUD DE CARACTERES 
    else if (numeroCaracteresNombre > 20) {
        alert("El nombre del empleado es demasiado largo");
        return false;
    }
    else if (numeroCaracteresApellido > 50) {
        alert("Los apellidos del empleado son demasiado largos");
        return false;
    }
    else if (numeroCaracteresDocumento > 10) {
        alert("El documento del empleado es demasiado largo");
        return false;
    }
    else if (numeroCaracteresCelular > 10) {
        alert("El numero celular del empleado es demasiado largo");
        return false;
    }
    else if (numeroCaracteresDireccion > 70) {
        alert("La direccion del empleado es demasiado largo");
        return false;
    }
    else if (numeroCaracteresCorreo > 40) {
        alert("El correo del empleado es demasiado largo");
        return false;
    }

    // VALIDAR CAMPOS ALFABETICOS
    if (!isNaN(nombreEmpleado)) {
        alert("El nombre no puede ser un numero");
        return false;
    }

    var exp = /[0-9]/g;
    if (exp.test(nombreEmpleado)) {
        alert("El nombre no puede contener numeros");
        return false;
    }

    if (!isNaN(apellidoEmpleado)) {
        alert("El apellido no puede ser un numero");
        return false;
    }

    var exp = /[0-9]/g;
    if (exp.test(apellidoEmpleado)) {
        alert("El apellido no puede contener numeros");
        return false;
    }

    // VALIDAR CAMPOS NUMERICOS 
    if (IsNaN(docEmpleado)) {
        alert("El documento del operario solo puede contener numeros");
        return false;
    }
    if (IsNaN(celularEmpleado)) {
        alert("El celular del operario solo puede contener numeros");
        return false;
    }

    // VALIDAR CORREOS ELECTRONICOS
    expresion = /\w+@+\w+\.+\w/;
    if (!expresion.test(correoUsuario)) {
        alert("El correo electronico no es valido");
        return false;
    }

}