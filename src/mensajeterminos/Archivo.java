/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeterminos.recursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Wilver
 */
public  class Archivo {
    /**
    private String nombreArchivo;
    private int tamañoKb;
    private String tipo;
    private String rutaArchivo;

    public String getNombreArchivo() {   return nombreArchivo;   }
    public String getRutaArchivo() {  return rutaArchivo;    }
    public int getTamañoKb() {    return tamañoKb;    }
    public String getTipo() {   return tipo;    }
    public void setTipo(String tipo) { this.tipo = tipo;    }
    
    public void setTamañoKb(int tamañoKb) {  this.tamañoKb = tamañoKb;    }
    public void setRutaArchivo(String rutaArchivo) {   this.rutaArchivo = rutaArchivo;    }
    public void setNombre(String nombre) {  this.nombreArchivo = nombre;    }
    */
    
    //Metodo que devuelve el contenido de un archivo apartir de su ruta
    public static String leerArchivo(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            // Leer línea por línea del archivo y agregar al contenido
            while ((linea = bufferedReader.readLine()) != null) {
                contenido.append(linea);
                contenido.append("\n"); // Agregar un salto de línea después de cada línea
            }
        } catch (IOException e) {
            // Manejar cualquier excepción de E/S que pueda ocurrir
            e.printStackTrace();
        }

        // Devolver el contenido del archivo como una cadena de caracteres
        return contenido.toString();
    }
    
   

    //metodo principal de prueba
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\Wilver\\OneDrive\\Documentos\\NetBeansProjects\\MiBiblioteca\\src\\multimedia\\terminos_y_condiciones.txt"; // Reemplazar con la ruta real del archivo
        String contenidoArchivo = leerArchivo(nombreArchivo);
        System.out.println("Contenido del archivo:");
        System.out.println(contenidoArchivo);
    }
    
}
