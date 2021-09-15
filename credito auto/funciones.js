function validarCheckbox() {
    campo_input = document.aa.chk1;
    for (let i = 0; i < campo_input.length; i++) {
        if (campo_input[i].checked) {
            alert(campo_input[i].value);

        }
    }
}
function validarRadio() {
    campo_input = document.aa.rad1;
    for (let i = 0; i < campo_input.length; i++) {
        if (campo_input[i].checked) {
            alert(campo_input[i].value);

        }
    }
}
function validarComuna() {
    alert(document.aa.nomcomuna.value)
}
function despliegaCambio() {
    alert(document.aa.nomcomuna.value)
}
function enviarSolicitud(e) {
    console.log(e);
    let tipoValor;
    campo_input = document.formu.radioValor;
    for (let i = 0; i < campo_input.length; i++) {
        if (campo_input[i].checked) {
            tipoValor = campo_input[i].value;
            break;
        }
    }
    let montoAuto = document.getElementById("txtValorCasa").value;
    let montoCredito = document.getElementById("txtCredito").value;

    if (tipoValor == "Peso") {
        let calculo = montoAuto * 0.8;
        if (montoCredito <= calculo) {
            alert("Cumple con la condicion!");

        } else {
            alert("No cumple con la condicion del credito");
            document.getElementById("txtCredito").value = "";
            document.getElementById("txtCredito").focus();
            e.preventDefault();
            return false;
        }
    } else {
        let valorEnUfDelAuto = montoAuto * 28000;
        let valorRealDeUfaPeso = montoCredito * 28000;
        let calculo = valorEnUfDelAuto * 0.8;
        if (valorRealDeUfaPeso <= calculo) {
            alert("Cumple con la condiciont")
        } else {
            alert("no cumple con la condicion :c")
            document.getElementById("txtCredito").value = "";
            document.getElementById("txtCredito").focus();
            e.preventDefault();
            return false
        }
    }
    alert("Su credito sera revisadinho")
}
document.formu.addEventListener("submit", enviarSolicitud)