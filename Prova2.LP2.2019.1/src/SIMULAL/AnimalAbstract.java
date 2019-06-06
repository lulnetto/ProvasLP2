package SIMULAL;

import java.util.Comparator;

public abstract class AnimalAbstract implements Animal{

    protected int id;
    protected double peso;
    protected int idade;
    protected String tamanho;

    public AnimalAbstract(int id){
        this.id = id;
    }

    public abstract String toString();

    public abstract void crescer();

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }
}
