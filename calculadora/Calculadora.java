const Calculadora = (function() {

    function validarValores(a, b) {
        if (typeof a !== 'number' || typeof b !== 'number') {
            throw new Error("Ambos os valores devem ser números.");
        }
    }


    function somar(a, b) {
        validarValores(a, b);
        return a + b;
    }

    function subtrair(a, b) {
        validarValores(a, b);
        return a - b;
    }

    function multiplicar(a, b) {
        validarValores(a, b);
        return a * b;
    }

    function dividir(a, b) {
        validarValores(a, b);
        if (b === 0) {
            throw new Error("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    return {
        somar,
        subtrair,
        multiplicar,
        dividir
    };
})();

try {
    console.log(`Soma: ${Calculadora.somar(10, 5)}`);           // 15
    console.log(`Subtração: ${Calculadora.subtrair(10, 5)}`);   // 5
    console.log(`Multiplicação: ${Calculadora.multiplicar(10, 5)}`); // 50
    console.log(`Divisão: ${Calculadora.dividir(10, 5)}`);       // 2
} catch (error) {
    console.error(error.message);
}
