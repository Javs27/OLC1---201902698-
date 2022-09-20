

package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/Lexer.flex";
        String ruta2 = "C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/LexerCup.flex";
        String[] rutaS = {"-parser","Sintax","C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/Sintax.cup"};
        generate(ruta1, ruta2, rutaS);
    }
    
    public static void generate(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        //instrucciones para volver a renombrar los nombres y que los modifique
        Path rutaSym = Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        // para mover los archivos dentro de codigo tabla de simbolos y sintax
        Files.move(
                Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/sym.java"),
                Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/sym.java")
        );
        
        Path rutaSin = Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/Sintax.java"),
                Paths.get("C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/Sintax.java")
        );
        
    }
}
