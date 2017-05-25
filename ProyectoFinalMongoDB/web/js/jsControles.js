/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validar(form) {

    var nombreProducto = document.getElementById("textNombreProducto").value;
    var precioVenta = document.getElementById("textPrecioVenta").value;
    var fechaVencimiento = document.getElementById("textFechaVencimiento").value;

    if (nombreProducto == null || nombreProducto.length == 0 || /^\s+$/.test(nombreProducto)) {
        alert("El campo nombre producto esta vacio.");
        nombreProducto.focus();
        return false;
    }
    if (isNaN(precioVenta) || precioVenta.value == null || /^\s+$/.test(precioVenta)) {
        alert("El campo precio venta esta vacio y debe ser numerico.");
        precioVenta.focus();
        return false;
    }
    if (fechaVencimiento == null || fechaVencimiento.length == 0 || /^\s+$/.test(fechaVencimiento)) {
        alert("El campo fecha de vencimiento esta vacio.");
        fechaVencimiento.focus();
        return false;
    }

    return true;
}

function editar(idProducto) {
    window.location.href = "./update?idProducto=" + idProducto;
}

function borrar(idProducto) {
    if (!confirm("¿Esta seguro que desea eliminar este producto?")) {
        return false;
    } else {
        window.location.href = "./delete?idProducto=" + idProducto;
        document.location = url;
        return true;
    }
}

