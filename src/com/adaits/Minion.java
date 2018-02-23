package com.adaits;

import java.util.ArrayList;

public class Minion {

    private String nombre;
    private int crimenes;
    private String palabrafavorita;
    private int ojos;
    private boolean gafas;
    private ArrayList<String> habilidades = new ArrayList<>();
    private Jefe jefe;

    //Crear propiedad para gestionar palabra favorita
    //Crear propiedad para los numeros de ojos
    //Crear propiedad de si lleva gafas o no
    //Crear propiedad de habilidades
    //Crear Clase Jefe y asociarla a un minion, tener en cuenta que un jefe puede tener varios minions
    //Pero los minions solo obedecen a un jefe


    public int getCrimenes() {
        return crimenes;
    }

    public void setCrimenes(int crimenes) {
        this.crimenes = crimenes;
    }

    public String getPalabrafavorita() {
        return palabrafavorita;
    }

    public void setPalabrafavorita(String palabrafavorita) {
        this.palabrafavorita = palabrafavorita;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public boolean isGafas() {
        return gafas;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public Minion(String nombre, int ojos, boolean gafas) {
        this.nombre = nombre;
        this.ojos = ojos;
        this.gafas = gafas;
    }

    public Minion(String nombre, int crimenes, String palabrafavorita, int ojos, boolean gafas, ArrayList<String> habilidades, Jefe jefe) {
        this.nombre = nombre;
        this.crimenes = crimenes;
        this.palabrafavorita = palabrafavorita;
        this.ojos = ojos;
        this.gafas = gafas;
        this.habilidades = habilidades;
        this.jefe = jefe;
    }

    public Minion(String nombre, int crimenes) {
        this.nombre = nombre;
        this.crimenes = crimenes;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "nombre='" + nombre + '\'' +
                ", crimenes=" + crimenes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esUnVillano(){
        boolean esMayor = false;

        if(this.crimenes >= 18){
            esMayor = true;
        }

        return esMayor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Minion minion = (Minion) o;

        if (crimenes != minion.crimenes) return false;
        return nombre != null ? nombre.equals(minion.nombre) : minion.nombre == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + crimenes;
        return result;
    }

//Crear una funcion que obtengan todos los minions con mas de un ojo y sin gafas



    //Crear una función que obtenga todos los minions con más de una habilidad


    //Crear una función que obtenga un minion con la misma palabra favorita que tu

    //Crear una función que te devuelva el primer minion que se unio a un jefe

}
