package com.example.demo;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override //sobreescribiendo
    public String toString() {
        return "Numero Lados=" + numeroLados +
                '}';
    }
    //declaramos el metodo area como abstracto
    public abstract double area();
}
