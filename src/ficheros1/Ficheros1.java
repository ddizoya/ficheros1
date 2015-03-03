/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros1;

/**
 *
 * @author ddizoya
 */
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeerFichero lf = new LeerFichero();
        
        lf.leerLinea("Z:\\Programación\\Evaluación 2\\Boletín 0 (Prácticas de clase)\\Ficheros1\\texto.txt");
            System.out.println();
        lf.leerPorPartes("texto.txt");
            System.out.println();
        lf.leerNumreos("numeros.txt");
            System.out.println();
        lf.leerConDelimitadores("numeroscomas.txt");
    }
    
}
