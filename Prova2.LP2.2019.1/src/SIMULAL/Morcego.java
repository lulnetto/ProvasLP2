package SIMULAL;

public class Morcego extends AnimalAbstract {

    public Morcego(int id) {
        super(id);
        this.peso = 0.002;
        this.idade = 0;
        this.tamanho = "P";
    }

    @Override
    public String toString() {
        return "BAT " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;

    }

    @Override
    public void crescer() {
        this.idade += 1;
        this.peso += 0.002;
    }
}
