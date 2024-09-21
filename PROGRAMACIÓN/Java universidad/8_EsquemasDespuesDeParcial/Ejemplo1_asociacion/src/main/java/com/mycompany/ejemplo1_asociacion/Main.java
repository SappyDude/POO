package com.mycompany.ejemplo1_asociacion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//Estudiantes
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Juan", 20, 'H');
        e1.setNombre("Maria");
        e1.setEdad(22);
        e1.setGenero('F');
        Estudiante e3 = new Estudiante("Pedro Escamoso", 19 ,'H');
        Estudiante e4 = new Estudiante("Antonieta London", 17 ,'M');
        Estudiante e5 = new Estudiante("Armando casas",18,'H');
        Estudiante e6 = new Estudiante("Juanito Alimaña",20 ,'H');
        Estudiante e7 = new Estudiante("Hugo Lormbardi", 22,'H');
        Estudiante e8 = new Estudiante("Gauss Jordan",19 ,'H');
        Estudiante e9 = new Estudiante("Pablo Escobar", 20,'H');
        Estudiante e10 = new Estudiante("Omaira Sanchez", 23,'M');
        Estudiante e11 = new Estudiante("Julio Cesar", 34,'H');
        Estudiante e12 = new Estudiante("Gabriel Cramer",25,'H');
//Profesores
        Profesor p1 = new Profesor("Juan carlos", "colombiano", 33, 'H');
        Profesor p2 = new Profesor("Catalina Collazos", "colombiana", 36, 'M');
        Profesor p3 = new Profesor("Niccolo Donatello", "Italiano", 33, 'H');

//Cursos
        ArrayList<Curso> cursos = new ArrayList<Curso>();

//crear los cursos
        Curso curso1 = new Curso("POO", 3, p1);
        Curso curso2 = new Curso();
        curso2.setNombre("fish");
        curso2.setCreditos(3);
        curso2.setProfesor(p2);
        Curso curso3 = new Curso ("Inteligencia artificial", 7, p3);

//curso 1 
        curso1.agregarEstudiante(e1);
        curso1.agregarEstudiante(e2);
        curso1.agregarEstudiante(e3);
        curso1.agregarEstudiante(e4);
       
        curso2.agregarEstudiante(e5);
        curso2.agregarEstudiante(e6);
        curso2.agregarEstudiante(e7);
        curso2.agregarEstudiante(e8);
        
        curso3.agregarEstudiante(e9);
        curso3.agregarEstudiante(e10);
        curso3.agregarEstudiante(e11);
        curso3.agregarEstudiante(e12);
     

//mostrar
        curso1.mostrarEstudiantes();
        curso1.mostrarProfesor();
        curso2.mostrarEstudiantes();
        curso2.mostrarProfesor();
        curso3.mostrarEstudiantes();
        curso3.mostrarProfesor();

//cursos
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
    
    }
    
}
