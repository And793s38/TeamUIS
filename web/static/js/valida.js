function compruebaD() {
    var desc = document.getElementById('descripcion').value;
    var nombre = document.getElementById('nombre').value;
    if (desc == '' || nombre == '') {
        document.getElementById('Rgrupo').disabled = true;
    } else {
        document.getElementById('Rgrupo').disabled = false;
    }

}

function activa() {
    var desc = document.getElementById('grupo').value;
    if (desc == '') {
        document.getElementById('Rgrupo').disabled = true;
    } else {
        document.getElementById('Rgrupo').disabled = false;
    }
}

function telefono(evento) {
    var key = window.Event ? evento.which : evento.keyCode;
    if (key >= 48 && key <= 57 && key != 255 && key != 32) {
        return true;
    } else {
        return false;
    }
}

function activaRe() {
    var nombre = document.getElementById('nombre').value;
    var carrera = document.getElementById('carrera').value;
    var tel = document.getElementById('telefono').value;
    if (nombre == '' || carrera == '' || tel == '') {
        document.getElementById('entrar').disabled = true;
    } else {
        document.getElementById('entrar').disabled = false;
    }
}