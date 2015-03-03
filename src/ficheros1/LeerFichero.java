/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ddizoya
 */
public class LeerFichero {

    Scanner sc;

    public void leerLinea(String nombreFichero) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombreFichero));
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.toString());
        } finally {
            sc.close();
        }

    }

    public void leerPorPartes(String nombreFichero) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombreFichero));
            while (sc.hasNext()) {
                respuesta = sc.next();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerNumreos(String nombreFichero) {
        int respuesta;
        try {
            sc = new Scanner(new File(nombreFichero));
            while (sc.hasNextInt()) {
                respuesta = sc.nextInt();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.toString());
        } finally {
            sc.close();
        }
    }
    
    public void leerConDelimitadores(String nombreFichero){
           int respuesta;
        try {
            sc = new Scanner(new File(nombreFichero)).useDelimiter(",");
            while (sc.hasNextInt()) {
                respuesta = sc.nextInt();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.toString());
        } finally {
            sc.close();
        }
    }
    
    public void leerLineasComoObjetos(String nombreFichero){
        ArrayList respuesta = new ArrayList();
               try {
            sc = new Scanner(new File(nombreFichero)).useDelimiter(",");
            while (sc.hasNext()) {
                respuesta = sc.next();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de lectura " + ex.toString());
        } finally {
            sc.close();
        }
    }
}
