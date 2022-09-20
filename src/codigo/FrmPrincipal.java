/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codigo;

import java.awt.Color;
import static java.awt.Color.green;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

/**
 *
 * @author pjbco
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form FrmPrincipal
     */

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // para reporte de errores 
    public ArrayList<String> ReporteErrores = new ArrayList<String>();
    
    // para el boton analizar
    public void analizarLexico() throws IOException{
        int cont = 1;
        // para extraer lo del txt
        String expr = (String) txtResultado.getText();
        // enviamos los datos al lexer
        Lexer lexer = new Lexer(new StringReader(expr));
        // para imprimir el analisis lexico linea y simbolo
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                    
                case inicioAnalisis:
                    resultado += "  <Inicio>\t\t" + lexer.lexeme + "\n";
                    break;
                case finAnalisis:
                    resultado += "  <Fin>\t\t" + lexer.lexeme + "\n";
                    break;
                case Ingresar:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Como:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case ConValor:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Si:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Entonces:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinSi:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case DeloContrario:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Osi:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Segun:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Hacer: 
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinSegun:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Para:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinPara:
                    resultado += "  <FinPara>\t\t" + lexer.lexeme + "\n";
                    break;
                case ConIncremental:
                    resultado += "  <ConIncremental>\t\t" + lexer.lexeme + "\n";
                    break;
                case Mientras:
                    resultado += "  <Mientras>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinMientras:
                    resultado += "  <FinMientras>\t\t" + lexer.lexeme + "\n";
                    break;
                case Repetir:
                    resultado += "  <Repetir>\t\t" + lexer.lexeme + "\n";
                    break;
                case HastaQue:
                    resultado += "  <HastaQue>\t\t" + lexer.lexeme + "\n";
                    break;
                case Hasta:
                    resultado += "  <Hasta>\t\t" + lexer.lexeme + "\n";
                    break;
                case Retornar:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Metodo:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinMetodo:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case ConParametros:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Ejecutar:
                    resultado += "  <Ejecutar>\t\t" + lexer.lexeme + "\n";
                    break;
                case Imprimir:
                    resultado += "  <IMPRESION>\t\t" + lexer.lexeme + "\n";
                    break;
                case Potencia:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case Modulo:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case ImprimirSalto:
                    resultado += "  <IMPRESION>\t\t" + lexer.lexeme + "\n";
                    break;
                case Funcion:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinFuncion:
                    resultado += "  <Reservada>\t\t" + lexer.lexeme + "\n";
                    break;
                // tipos de datos 
                case Int:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case String:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Boolean:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Char: case TipoCadena: case Caracter:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Double:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Float:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numeroo:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Doble:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Flotante:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Booleano:
                    resultado += "  <Tipo de dato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Car:
                    resultado += "  <Caracter>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                // fin de los tipos de dato
                    // inician simbolos 
                case OperadorRelacional:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case InterrogacionA:
                    resultado += "  <Interrogacion Apertura>\t" + lexer.lexeme + "\n";
                    break;
                case InterrogacionC:
                    resultado += "  <Interrogacion Cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case ParentesisA:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case ParentesisC:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case LlaveA:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case LlaveC:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case PuntoComa:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case CorcheteA:
                    resultado += "  <Corchete apertura>\t" + lexer.lexeme + "\n";
                    break;
                case CorcheteC:
                    resultado += "  <Corchete cierre>\t" + lexer.lexeme + "\n";
                    break;
                case GuionLow:
                    resultado += "  <Guion bajo>\t" + lexer.lexeme + "\n";
                    break;
                case Asignar:
                    resultado += "  <Asignar>\t" + lexer.lexeme + "\n";
                    break;
                case Comilla:
                    resultado += "  <Comillas>\t" + lexer.lexeme + "\n";
                    break;
                case Mod:
                    resultado += "  <Mod>\t" + lexer.lexeme + "\n";
                    break;
                case Mayor:
                    resultado += "  <Mayor>\t" + lexer.lexeme + "\n";
                    break;
                case Menor:
                    resultado += "  <Menor>\t" + lexer.lexeme + "\n";
                    break;
                case MayorIgual:
                    resultado += "  <MayorIgual>\t" + lexer.lexeme + "\n";
                    break;
                case MenorIgual:
                    resultado += "  <MenorIgual>\t" + lexer.lexeme + "\n";
                    break;
                case IgualIgual:
                    resultado += "  <IgualIgual>\t" + lexer.lexeme + "\n";
                    break;
                case Diferente:
                    resultado += "  <Diferente>\t" + lexer.lexeme + "\n";
                    break;
                case OperadorOr:
                    resultado += "  <OperadorOr>\t" + lexer.lexeme + "\n";
                    break;
                case OperadorAnd:
                    resultado += "  <OperadorAnd>\t" + lexer.lexeme + "\n";
                    break;
                case OperadorNot:
                    resultado += "  <Asignar>\t" + lexer.lexeme + "\n";
                    break;
                case Verdadero:
                    resultado += "  <Verdadero>\t" + lexer.lexeme + "\n";
                    break;
                case Falso:
                    resultado += "  <Falso>\t" + lexer.lexeme + "\n";
                    break;
                case DosPuntos:
                    resultado += "  <Falso>\t" + lexer.lexeme + "\n";
                    break;
                
                case OperadorLogico:
                    resultado += "  <OperadorLogico>\t\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    ReporteErrores.add(lexer.lexeme);
                    
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    public void ReportErrores(){
        // string para guardar el codigo generado en html
        String reporte = "<h2 style=\"text-align: center;\"><span style=\"color: #0000ff;\">Pablo Javier Batz Contreras,201902698</span></h2>\n" +
    "<h2 style=\"text-align: center;\"><span style=\"color: #0000ff;\">Reporte Errores</span></h2>\n" +
    "<p>&nbsp;</p>"
  
    +"<table style=\"width:100%\">\n"
    +"  <tr>\n"
    +      "<th>No.</th>\n"
    +"    <th>TIPO DE ERROR</th>\n"
    +"    <th>LEXEMA</th>\n"
    +"    <th>DESCRIPCION</th>\n"
    +"  </tr>\n"; 
        int contador = 0;
    for (Object Error : ReporteErrores) {
              contador+=1;
        reporte+=("<tr><td>"+contador+"</td><td>ErrorLexico</td><td>"+ Error+"</td><td>"+ "Lexema incorrecto"+"</td></tr> \n");
    }
    reporte += "</table> \n" + "</body>"+"</html>";
           
    try{
        //String ruta ="C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores";
        File file = new File("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/reporte.html");
        // si el archivo no existe lo creamos 
        if (!file.exists()) {
            file.createNewFile();
        }
           FileWriter fw = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(reporte);
           bw.close();
        } catch (IOException e){
            e.printStackTrace();
    }
    }
Sintax s;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnAnalizarSin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AreaErrores = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setText("Open File");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnAnalizarSin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAnalizarSin.setText("Generate AST");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("OLC_2S_2022<201902698>");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("View Code Python");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Error Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Clean");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        AreaErrores.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AreaErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaErroresActionPerformed(evt);
            }
        });

        jMenu1.setText("Manuales");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem1.setText("Manual Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem2.setText("Manual tecnico ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnalizarSin, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                                .addComponent(AreaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnAnalizarSin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaErrores, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        
        try {
            // para traer todo lo del archivo txt
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex){
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed
    
    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        s.InicioEstado = 2;
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis Sintactico correcto :)");
            txtAnalizarSin.setForeground(new Color(25, 111,61));
        } catch (Exception ex){
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea:  " + (sym.right + 1 ) + " Columna: "+ (sym.left+1)+", Texto: \""+ sym.value +"\"");
            txtAnalizarSin.setForeground(Color.red);
        }
        // inicializando el nodo
        Nodo raiz = null;
        raiz = s.getRaiz();
        if(raiz!=null){
            Arbol arbol = new Arbol(raiz);
            arbol.GraficarSintactico();
            
        }
    }//GEN-LAST:event_btnAnalizarSinActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        s.InicioEstado = 1 ;
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis Sintactico correcto :)");
            txtAnalizarSin.setForeground(new Color(25, 111,61));
        } catch (Exception ex){
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea:  " + (sym.right + 1 ) + " Columna: "+ (sym.left+1)+", Texto: \""+ sym.value +"\"");
            txtAnalizarSin.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        
    }//GEN-LAST:event_jButton2ActionPerformed
    ReportErrores();
    int NumeroDeErrores = ReporteErrores.size();
    AreaErrores.setText("Errores: "+String.valueOf(NumeroDeErrores));
    ReporteErrores.clear();
    
    
        try
        {
            File file = new File("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/reporte.html");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add youtxtResultador handling code here:
        txtResultado.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AreaErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaErroresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaErroresActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        // TODO add your handling code here:
        try
        {
            File file = new File("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/ManualDeUsuarioProyecto1.pdf");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        try
        {
            File file = new File("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/reporte.html");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        try
        {
            File file = new File("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/ManualTecnicoProyecto1.pdf");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AreaErrores;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
