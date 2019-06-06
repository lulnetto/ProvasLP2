package SIMULAL;

public class Elefante extends AnimalAbstract {

    public Elefante(int id) {
        super(id);
        this.peso = 120;
        this.idade = 0;
        this.tamanho = "G";
    }

    @Override
    public String toString() {
        return "FANTE " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;

    }

    @Override
    public void crescer() {
        this.idade += 1;
        if (this.idade <= 20){
            this.peso += 250;
        }
    }
}
