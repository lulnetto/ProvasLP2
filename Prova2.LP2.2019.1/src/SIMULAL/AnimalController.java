package SIMULAL;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AnimalController {

    private Map<Integer,Animal> animalMap;
    private int id;
    private String estrategia;

    public AnimalController(){
        this.animalMap = new HashMap<>();
        this.id = 1;
        this.estrategia = "PESO";
    }


    public int cadastrarCachorroFilhote() {
        Animal cachorro = new Cachorro(this.id);
        this.animalMap.put(this.id,cachorro);
        this.id += 1;
        return (this.id - 1);
    }

    public int cadastrarElefanteFilhote() {
        Animal elefante = new Elefante(this.id);
        this.animalMap.put(this.id,elefante);
        this.id += 1;
        return (this.id - 1);
    }

    public int cadastrarMorcegoFilhote() {
        Animal morcego = new Morcego(this.id);
        this.animalMap.put(this.id,morcego);
        this.id += 1;
        return (this.id - 1);
    }

    public String exibirAnimal(int id){
        if(!this.animalMap.containsKey(id)){
            throw new NullPointerException("Erro ao exibir animal: ID invalido");
        }
        return this.animalMap.get(id).toString();
    }

    public void crescer(int id) {
        if(!this.animalMap.containsKey(id)){
            throw new NullPointerException("Erro ao crescer animal: ID invalido");
        }
        this.animalMap.get(id).crescer();
    }

    public void configurarRemocao(String estrategia) {
        if ("PESO".equals(estrategia.toUpperCase()) || "IDADE".equals(estrategia.toUpperCase())){
            this.estrategia = estrategia.toUpperCase();
        } else {
            throw new IllegalArgumentException("Erro ao configurar remocao: Estrategia invalida.");
        }
    }

    public int remover(){
        if (this.estrategia.equals("PESO")){
            int maior = maiorPeso();
            this.animalMap.remove(maior);
            return maior;
        } else if (this.estrategia.equals("IDADE")){
            int maior = maiorIdade();
            this.animalMap.remove(maior);
            return maior;
        } else {
            return 0;
        }
    }

    private int maiorPeso(){
        int maior = 1;
        for (int animalID: this.animalMap.keySet()){
            if (this.animalMap.get(animalID).getPeso() > this.animalMap.get(maior).getPeso()){
                maior = animalID;
            }
        } return maior;
    }
    private int maiorIdade(){
        int maior = 1;
        for (int animalID: this.animalMap.keySet()){
            if (this.animalMap.get(animalID).getIdade() > this.animalMap.get(maior).getIdade()){
                maior = animalID;
            }
        } return maior;
    }

}
