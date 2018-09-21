
package PalabrasArchivo;

//import java.io.BufferedReader;//Libreria para hacer operaciones con archivos
//import java.io.FileReader;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class OperacionesPalabras {
    
    public String[] LeerTxt(String direccion){//direccion del archivo
        
        String texto= "";
        String arreglo[] = new String [11];
        
        try{
            BufferedReader bf = new BufferedReader (new FileReader(direccion));
            String temporal = "";
            String bfRead;
             
            while( (bfRead = bf.readLine()) != null){//haz el ciclo, mientras tiene datos
                temporal = temporal + bfRead;//guarda el texto del archivo, concatenando
                
            }
            
            
            texto = temporal;
            
            
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
        
            String pCadena = texto;
            String primeraCadena = pCadena.substring(0,5);
            
            String sCadena = texto;
            String segundaCadena = sCadena.substring(6,13);
            
            String tCadena = texto;
            String terceraCadena = tCadena.substring(14,20);
            
            String cCadena = texto;
            String cuartaCadena = cCadena.substring(21,25);
            
            String qCadena = texto;
            String quintoCadena = qCadena.substring(26,32);
            
            String seCadena = texto;
            String sextaCadena = seCadena.substring(32,39);
            
            String sepCadena = texto;
            String septimoCadena = sepCadena.substring(40,49);
            
            String ocCadena = texto;
            String octavoCadena = ocCadena.substring(50,55);
            
            String noCadena = texto;
            String novenoCadena = noCadena.substring(56,61);
            
            String deCadena = texto;
            String decimoCadena = deCadena.substring(62,69);
            
            
            String[] NombresRevueltos = {primeraCadena,segundaCadena,terceraCadena,cuartaCadena,quintoCadena,sextaCadena,septimoCadena,octavoCadena,novenoCadena,decimoCadena};
            
            return NombresRevueltos;
    }
    
    public void OrdenarDatos(String[] NombresRevueltos){
        
        
        Arrays.sort(NombresRevueltos);
        
        for (String i : NombresRevueltos) {
            System.out.print(i + ", ");
        }
    }
    
    public void BuscarDatos(String[] NombresRevueltos){
        Scanner boton = new Scanner (System.in);
        String BuscarCadena;
        System.out.println("Digite una palabra para buscar en el arreglo");
        BuscarCadena = boton.nextLine();
        
        for (int x=0; x<10; x++){
            
        if (BuscarCadena.equals(NombresRevueltos[x])){
            System.out.println("Palabra encontrada");
            x=10;
        }else if (BuscarCadena.equals(NombresRevueltos[x]) || x==9){
            
            System.out.println("Palabra no encontrada ");
        }
        }
        
    }
    
}
