

package codigo;

/**
 *
 * @author pjbco
 */
public enum Tokens {
    // Acá van todos mis return de la clase lexer
    // inicio y fin 
    inicioAnalisis,
    finAnalisis,
    
    // PALABRAS RESERVADAS
    Ingresar,
    Como,
    ConValor,
    Si,
    Entonces,
    FinSi,
    DeloContrario,
    Osi,
    Segun,
    Hacer,
    FinSegun,
    Para,
    FinPara,
    ConIncremental,
    Mientras,
    FinMientras,
    Repetir,
    HastaQue,
    Hasta,
    Retornar,
    Metodo,
    FinMetodo,
    ConParametros,
    Ejecutar,
    Imprimir,
    Potencia,
    Modulo,
    ImprimirSalto,
    // fin palabras reservadas 
  
    // TIPOS DE DATOS
    Int,
    If,
    Else,
    While,
    String,
    Boolean,
    Char,
    Double,
    Float,
    Numeroo,
    Doble,
    Flotante,
    Booleano,
    Car, 
    Cadena,
    TipoCadena,
    Caracter,
    DosPuntos,
    
    // simbolos
    Igual,
    Suma,
    Resta,
    Multiplicacion,
    Division,
    ParentesisA,
    ParentesisC,
    LlaveA,
    LlaveC,
    Main,
    PuntoComa,
    CorcheteA,
    CorcheteC,
    GuionLow,
    Asignar,
    Comilla,
    Mod,
    Mayor,
    Menor,
    MayorIgual,
    MenorIgual,
    IgualIgual,
    Diferente,
    OperadorOr,
    OperadorAnd,
    OperadorNot,
    InterrogacionA,
    InterrogacionC,
    Funcion,
    FinFuncion,
    Coma,
    
    
    
    // operadores
    OperadorLogico,
    Verdadero,
    Falso,
    OperadorRelacional,
    
    
    
    

    // extras
    Identificador,
    Numero,
    Linea,
    ERROR
    
}
