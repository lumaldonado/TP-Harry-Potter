package app.personajes;
import app.poderes.hechizos.*;
import java.util.*;

public abstract class Personaje {
    
    private String nombre;
    private int salud;
    private int edad;
    private int numeroDePersonaje;


    public Personaje elegirAvatar(Personaje wizard){
        return wizard;
    }

    public boolean estaVivo(){
        if (salud > 0){
            return true;
       }
       return false;
    }

    public String getNombre() {
        return this.nombre;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    public int getSalud(){
        return this.salud;
    } 
    public void setSalud(int salud) {
        this.salud = salud;
    } 
    public int getEdad(){
        return this.edad;
    } 
    public void setEdad(int edad) {
        this.edad = edad;
    } 
    public void setNumeroDePersonaje(int numeroDePersonaje){
        this.numeroDePersonaje = numeroDePersonaje;
    }

} 


