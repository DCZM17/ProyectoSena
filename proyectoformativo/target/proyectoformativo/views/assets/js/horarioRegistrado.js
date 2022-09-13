var today = new Date();

var fecha_actual = today.getHours() + ':' + today.getMinutes() + ':' + today.getSeconds();
console.log(fecha_actual);

listarHorario();

function recargar(){
    setTimeout(function(){
        location.reload();
    },2000)
}

function listarHorario(){
    let accion = 'listar';
    $.ajax({
        url: 'horarioRegistrado',
        type: 'POST',
        data: {accion},
        success:function(resultado){
            console.log(resultado)
        }
    })
}

$("#iniciar_hora").click(function(){
    let accion = 'add'; 
    $.ajax({
        url: 'horarioRegistrado',
        type: 'POST',
        data: {accion,fecha_actual},
        success:function(resultado){
            console.log(resultado)
            Swal.fire({
                title:'Mensaje',
                text:'Ha ingresado a la operación correctamente',
                icon:'success',
                timer:2000
            });

            recargar();
        }
    })
})

$(document).on('click', '#salida_almuerzo',function(){
    let id = $(this).attr('data-id');
    let accion = 'add_almuerzo'; 
    $.ajax({
        url: 'horarioRegistrado',
        type: 'POST',
        data: {accion,id,fecha_actual},
        success:function(resultado){
            console.log(resultado)
            Swal.fire({
                title:'Mensaje',
                text:'Ha marcado la salida para almorzar',
                icon:'success',
                timer:2000
            });
            recargar();
        }
    })
})

$(document).on('click', '#entrada_almuerzo',function(){
    let id = $(this).attr('data-id');
    let accion = 'add_almuerzo_entrada'; 
    $.ajax({
        url: 'horarioRegistrado',
        type: 'POST',
        data: {accion,id,fecha_actual},
        success:function(resultado){
            console.log(resultado)
            Swal.fire({
                title:'Mensaje',
                text:'Ha marcado la entrada despues de almorzar',
                icon:'success',
                timer:2000
            });
            recargar();
        }
    })
})

$(document).on('click', '#salida',function(){
    let id = $(this).attr('data-id');
    let accion = 'add_salida'; 
    $.ajax({
        url: 'horarioRegistrado',
        type: 'POST',
        data: {accion,id,fecha_actual},
        success:function(resultado){
            console.log(resultado)
            Swal.fire({
                title:'Mensaje',
                text:'Ha marcado la hora de salida',
                icon:'success',
                timer:2000
            });
            recargar();
        }
    })
})