package SIMULAL;

public class Cachorro extends AnimalAbstract {


    public Cachorro(int id) {
        super(id);
        this.peso = 0.4;
        this.idade = 0;
        this.tamanho = "P";
    }

    @Override
    public String toString() {
        return "CAO " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;
    }

    @Override
    public void crescer() {
        this.idade += 1;
        this.peso += 0.7;
        verificaTamanho();
    }

    private void verificaTamanho() {
        if (this.peso <= 10){
            this.tamanho = "P";
        } else if (this.peso > 10){
            this.tamanho = "M";
        }
    }

}
