import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;

public class Writter {

    public static void main(String... args){
        //ESCRIBIR EN ARCHIVOS
        try{
            //La ruta a donde voy a escribir el archivo
            Path path = Paths.get("hola.txt");
            //Lo escribo
            Files.write(path, "Primera cordenada 1\nline 2\n".getBytes());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        
        //LEER DE ARCHIVOS
        try {
            Path path = Paths.get("csv.txt");//La ruta de donde está mi archivo
            List<String> lines = Files.readAllLines(path);//Leo todas las lineas en una lista
            for (String string : lines) {//Itero sobre cada linea
                String row[] = string.split(",");//Lo separo por comas
                System.out.println("x: " + row[0] + " y: " + row[1]);//IMprimo lo que leí
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
