package com.Zoo;

abstract public class mamifero {

    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public mamifero(String habitat, float altura, float largo, float peso) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public mamifero() {
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getPeso() {
        return peso;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
