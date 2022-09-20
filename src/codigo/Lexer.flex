package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
%ignorecase
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r]+
%{
    public String lexeme;
%}
%%
/* comentarios */
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

/* EL INICIO DEL ARCHIVO */
inicio {lexeme=yytext(); return inicioAnalisis;}
fin {lexeme=yytext(); return finAnalisis;}

\/\/[^\n]* {/*Ignore*/}
\/\*[^/]*\*\/ {/*Ignore*/}
     
/* TIPOS DE DATOS*/
numero      {lexeme=yytext(); return Numeroo;}
\"(.+)*\" {lexeme=yytext(); return Cadena;}
boolean     {lexeme=yytext(); return Boolean;}
caracter    {lexeme=yytext(); return Car;}
cadena {lexeme=yytext(); return TipoCadena;}

int         {lexeme=yytext(); return Int;}
string      {lexeme=yytext(); return String;}   
boolean     {lexeme=yytext(); return Boolean;}
char        {lexeme=yytext(); return Char;}
double      {lexeme=yytext(); return Double;}
float       {lexeme=yytext(); return Float;}
numero      {lexeme=yytext(); return Numeroo;}
doble       {lexeme=yytext(); return Doble;}
flotante    {lexeme=yytext(); return Flotante;}
booleano    {lexeme=yytext(); return Booleano;}
caracter    {lexeme=yytext(); return Car;}
"verdadero"   {lexeme=yytext(); return Verdadero;}
"falso"       {lexeme=yytext(); return Falso;}
\"(.+)*\" {lexeme=yytext(); return Cadena;}
\'([a-zA-Z])*\' {lexeme=yytext(); return Caracter;}

cadena {lexeme=yytext(); return TipoCadena;}


int {lexeme=yytext(); return Int;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
while {lexeme=yytext(); return While;}

/* palabras reservadas*/
ingresar    {lexeme=yytext(); return Ingresar;}
como        {lexeme=yytext(); return Como;} 
con_valor   {lexeme=yytext(); return ConValor;}
si          {lexeme=yytext(); return Si;}
entonces    {lexeme=yytext(); return Entonces;}
fin_si      {lexeme=yytext(); return FinSi;}
de_lo_contrario {lexeme=yytext(); return DeloContrario;}
o_si            {lexeme=yytext(); return Osi;}
segun           {lexeme=yytext(); return Segun;}
hacer           {lexeme=yytext(); return Hacer;}
fin_segun       {lexeme=yytext(); return FinSegun;}
para            {lexeme=yytext(); return Para;}
fin_para        {lexeme=yytext(); return FinPara;}
con_incremental {lexeme=yytext(); return ConIncremental;}
mientras        {lexeme=yytext(); return Mientras;}
fin_mientras    {lexeme=yytext(); return FinMientras;}
repetir         {lexeme=yytext(); return Repetir;}
hasta_que       {lexeme=yytext(); return HastaQue;}
hasta           {lexeme=yytext(); return Hasta;}
retornar        {lexeme=yytext(); return Retornar;}
metodo          {lexeme=yytext(); return Metodo;}
fin_metodo      {lexeme=yytext(); return FinMetodo;}
con_parametros  {lexeme=yytext(); return ConParametros;} 
ejecutar        {lexeme=yytext(); return Ejecutar;}
imprimir        {lexeme=yytext(); return Imprimir;}
potencia        {lexeme=yytext(); return Potencia;}
modulo          {lexeme=yytext(); return Modulo;}
imprimir_nl     {lexeme=yytext(); return ImprimirSalto;}
funcion         {lexeme=yytext(); return Funcion;}
fin_funcion     {lexeme=yytext(); return FinFuncion;}


// simbolos 
"\n" {return Linea;}
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
"(" {lexeme=yytext(); return ParentesisA;}
")" {lexeme=yytext(); return ParentesisC;}
"{" {lexeme=yytext(); return LlaveA;}
"}" {lexeme=yytext(); return LlaveC;}
";" {lexeme=yytext(); return PuntoComa;}
":" {lexeme=yytext(); return DosPuntos;}
"," {lexeme=yytext(); return Coma;}
"[" {lexeme=yytext(); return CorcheteA;}
"]"  {lexeme=yytext(); return CorcheteC;}
"_"  {lexeme=yytext(); return GuionLow;}
"->" {lexeme=yytext(); return Asignar;}
\"   {lexeme=yytext(); return Comilla;}
"%"  {lexeme=yytext(); return Mod;}
"main" {lexeme=yytext(); return Main;}
"¿" {lexeme=yytext(); return InterrogacionA;}
"?" {lexeme=yytext(); return InterrogacionC;}
"mayor"   {lexeme=yytext(); return OperadorRelacional;}
"menor"   {lexeme=yytext(); return OperadorRelacional;}  
"menor_o_igual"  {lexeme=yytext(); return OperadorRelacional;}
"mayor_o_igual"  {lexeme=yytext(); return OperadorRelacional;}
"es_diferente"  {lexeme=yytext(); return OperadorRelacional;}
"es_igual"  {lexeme=yytext(); return OperadorRelacional;}

/* operadores */
"or"    {lexeme=yytext(); return OperadorLogico;}
"and"   {lexeme=yytext(); return OperadorLogico;}
"not"   {lexeme=yytext(); return OperadorLogico;}

//(<|>|<=|>=|==|!=) {lexeme=yytext(); return OperadorRelacional;}



// numeros 
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
// identificador o variable 
_[a-zA-Z0-9_]+_ {lexeme=yytext(); return Identificador;}


// Para los errores
 . {lexeme=yytext(); return ERROR;}