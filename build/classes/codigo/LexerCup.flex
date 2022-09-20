package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
%ignorecase
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* comentarios */
{espacio} {/*Ignore*/}

\/\/[^\n]* {/*Ignore*/}
\/\*[^/]*\*\/ {/*Ignore*/}

/* EL INICIO DEL ARCHIVO */
inicio {return new Symbol(sym.inicioAnalisis, yychar, yyline, yytext());}
fin {return new Symbol(sym.finAnalisis, yychar, yyline, yytext());}


/* TIPOS DE DATOS*/
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
if  {return new Symbol(sym.If, yychar, yyline, yytext());}
else  {return new Symbol(sym.Else, yychar, yyline, yytext());}
while {return new Symbol(sym.While, yychar, yyline, yytext());}
string {return new Symbol(sym.String, yychar, yyline, yytext());}
boolean {return new Symbol(sym.Boolean, yychar, yyline, yytext());}
char    {return new Symbol(sym.Char, yychar, yyline, yytext());}
double  {return new Symbol(sym.Double, yychar, yyline, yytext());}
float   {return new Symbol(sym.Float, yychar, yyline, yytext());}
numero  {return new Symbol(sym.Numeroo, yychar, yyline, yytext());}

doble   {return new Symbol(sym.Doble, yychar, yyline, yytext());}
flotante {return new Symbol(sym.Flotante, yychar, yyline, yytext());}
booleano {return new Symbol(sym.Booleano, yychar, yyline, yytext());}
caracter {return new Symbol(sym.Car, yychar, yyline, yytext());}
cadena   {return new Symbol(sym.TipoCadena, yychar, yyline, yytext());}

\"(.+)*\" {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
\'([a-zA-Z])*\' {return new Symbol(sym.Caracter, yychar, yyline, yytext());}







/* palabras reservadas*/
ingresar     {return new Symbol(sym.Ingresar, yychar, yyline, yytext());}
como         {return new Symbol(sym.Como, yychar, yyline, yytext());} 
con_valor    {return new Symbol(sym.ConValor, yychar, yyline, yytext());}
si           {return new Symbol(sym.Si, yychar, yyline, yytext());}
entonces     {return new Symbol(sym.Entonces, yychar, yyline, yytext());}
fin_si       {return new Symbol(sym.FinSi, yychar, yyline, yytext());}
de_lo_contrario {return new Symbol(sym.DeloContrario, yychar, yyline, yytext());}
o_si            {return new Symbol(sym.Osi, yychar, yyline, yytext());}    
segun           {return new Symbol(sym.Segun, yychar, yyline, yytext());}
hacer           {return new Symbol(sym.Hacer, yychar, yyline, yytext());} 
fin_segun       {return new Symbol(sym.FinSegun, yychar, yyline, yytext());}
para            {return new Symbol(sym.Para, yychar, yyline, yytext());}
fin_para        {return new Symbol(sym.FinPara, yychar, yyline, yytext());}
con_incremental {return new Symbol(sym.ConIncremental, yychar, yyline, yytext());}
mientras        {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
fin_mientras    {return new Symbol(sym.FinMientras, yychar, yyline, yytext());}
repetir         {return new Symbol(sym.Repetir, yychar, yyline, yytext());}
hasta_que       {return new Symbol(sym.HastaQue, yychar, yyline, yytext());}
retornar        {return new Symbol(sym.Retornar, yychar, yyline, yytext());}
metodo          {return new Symbol(sym.Metodo, yychar, yyline, yytext());}
fin_metodo      {return new Symbol(sym.FinMetodo, yychar, yyline, yytext());}
con_parametros  {return new Symbol(sym.ConParametros, yychar, yyline, yytext());}
ejecutar        {return new Symbol(sym.Ejecutar, yychar, yyline, yytext());} 
imprimir        {return new Symbol(sym.Imprimir, yychar, yyline, yytext());}
potencia        {return new Symbol(sym.Potencia, yychar, yyline, yytext());}
modulo          {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
imprimir_nl     {return new Symbol(sym.ImprimirSalto, yychar, yyline, yytext());}
hasta           {return new Symbol(sym.Hasta, yychar, yyline, yytext());}
funcion         {return new Symbol(sym.Funcion, yychar, yyline, yytext());}
fin_funcion     {return new Symbol(sym.FinFuncion, yychar, yyline, yytext());} 



/* SIMBOLOS*/
"="  {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"+"  {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-"  {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*"  {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/"  {return new Symbol(sym.Division, yychar, yyline, yytext());}
"("  {return new Symbol(sym.ParentesisA, yychar, yyline, yytext());}
")"  {return new Symbol(sym.ParentesisC, yychar, yyline, yytext());}
"{"  {return new Symbol(sym.LlaveA, yychar, yyline, yytext());}
"}"  {return new Symbol(sym.LlaveC, yychar, yyline, yytext());}
"main" {return new Symbol(sym.Main, yychar, yyline, yytext());}
";" {return new Symbol(sym.PuntoComa, yychar, yyline, yytext());}
"," {return new Symbol(sym.Coma, yychar, yyline, yytext());} 
"[" {return new Symbol(sym.CorcheteA, yychar, yyline, yytext());}
"]"  {return new Symbol(sym.CorcheteC, yychar, yyline, yytext());}
"_"  {return new Symbol(sym.GuionLow, yychar, yyline, yytext());}
"->" {return new Symbol(sym.Asignar, yychar, yyline, yytext());}
\"  {return new Symbol(sym.Comilla, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Mod, yychar, yyline, yytext());}
":" {return new Symbol(sym.DosPuntos, yychar, yyline, yytext());}

"¿" {return new Symbol(sym.InterrogacionA, yychar, yyline, yytext());} 
"?" {return new Symbol(sym.InterrogacionC, yychar, yyline, yytext());}

"mayor"   {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}
"menor"   {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}  
"menor_o_igual"  {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}
"mayor_o_igual"  {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}
"es_diferente"  {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}
"es_igual"  {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}

"verdadero"   {return new Symbol(sym.Verdadero, yychar, yyline, yytext());}
"falso"       {return new Symbol(sym.Falso, yychar, yyline, yytext());}



/* operadores*/
//(<|>|<=|>=|==|!=) {return new Symbol(sym.OperadorRelacional, yychar, yyline, yytext());}

"or"    {return new Symbol(sym.OperadorLogico, yychar, yyline, yytext());}
"and"   {return new Symbol(sym.OperadorLogico, yychar, yyline, yytext());}
"not"   {return new Symbol(sym.OperadorLogico, yychar, yyline, yytext());}

/* identificador o variable*/
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
_[a-zA-Z0-9_]+_      {return new Symbol(sym.Identificador, yychar, yyline, yytext());}



 . {/*Ignore*/}