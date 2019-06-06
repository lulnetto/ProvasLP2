package SIMULAL;

public class Facade {

    private AnimalController animalController;

    public Facade(){
        this.animalController = new AnimalController();
    }

    public int cadastrarCachorroFilhote(){
        return this.animalController.cadastrarCachorroFilhote();
    }
    public int cadastrarElefanteFilhote(){
        return this.animalController.cadastrarElefanteFilhote();
    }
    public int cadastrarMorcegoFilhote(){
        return this.animalController.cadastrarMorcegoFilhote();
    }
    public String exibirAnimal(int id){
        return this.animalController.exibirAnimal(id);
    }
    public void crescer(int id){
        this.animalController.crescer(id);
    }
    public void configurarRemocao(String estrategia){
        this.animalController.configurarRemocao(estrategia);
    }
    public int remover(){
        return this.animalController.remover();
    }
}
