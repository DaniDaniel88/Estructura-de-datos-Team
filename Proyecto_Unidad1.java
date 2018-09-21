
package proyecto_unidad1;
import PalabrasArchivo.OperacionesPalabras;
import java.util.Scanner;

public class Proyecto_Unidad1 {
    public static void main(String[] args) {
        
        OperacionesPalabras objeto1 = new OperacionesPalabras();
        Scanner boton = new Scanner (System.in);
        int uno;
        System.out.println("Programa inicializado oprima 1 y enter para empezar");
        uno=boton.nextInt();
        if (uno==1){
            System.out.println("Datos correctos :)");
        }
        System.out.println("Texto extraido , ordenado alfabeticamente:");
        System.out.println("Nota los ciclos representan el numero de busquedas dentro del arreglo:");
        System.out.println("  ");
        objeto1.LeerTxt("NombresX1.txt");
       
        objeto1.OrdenarDatos(objeto1.LeerTxt("NombresX1.txt"));
        System.out.println("-----");
        objeto1.BuscarDatos(objeto1.LeerTxt("NombresX1.txt"));
    }
    
}
