package com.Zoo;

abstract public class Felines extends mamifero{

    protected float tamanoGarras;
    protected int velocidad;

    public Felines(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(habitat, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
