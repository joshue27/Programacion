/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofinalcanva;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author joshue
 */
public class ProyectoFinalCanva {

    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Cursos> cursos = new ArrayList<>();
    public static ArrayList<CreaSemestre> semestres = new ArrayList<>();

    public static boolean validarContrasena(String contrasena) {
        // Expresión regular para validar la contraseña
        String expresionRegular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(contrasena);

        return matcher.matches();
    }

    public static Cursos buscarcurso(String nombrecurso) {
        for (Cursos curso : ProyectoFinalCanva.cursos) {
            if (curso.nombre.equals(nombrecurso)) {
                return curso;
            }
        }
        return null;
    }

    public static Alumno buscarAlu(String carne) {
        for (Alumno alumno : ProyectoFinalCanva.alumnos) {
            if (alumno.carne.equals(carne)) {
                return alumno;
            }
        }
        return null; // alumno no encontrado
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
    }
}
