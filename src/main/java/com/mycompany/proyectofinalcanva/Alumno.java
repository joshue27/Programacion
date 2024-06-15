/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalcanva;

import java.io.Serializable;
import java.util.HashMap;


/**
 *
 * @author joshue
 */
public class Alumno {

    public String nombre;
    public String apellido;
    public String usuario;
    public String password;
    public String carne;
    public NotasFinales notasFinales = new NotasFinales();
 
   
    
        public class NotasFinales extends HashMap<String, Double>{
  
         // Method nota final
    public void agregarNotaFinal(String codigoCurso, double notaFinal) {
        notasFinales.put(codigoCurso, notaFinal);
        }

    // Method para obtenerlo
    public double getNotaFinal(String codigoCurso) {
        return notasFinales.getOrDefault(codigoCurso, 0.0); 
        }
    }
    
}
