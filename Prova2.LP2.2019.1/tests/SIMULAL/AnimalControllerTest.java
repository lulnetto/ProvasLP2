package SIMULAL;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalControllerTest {

    private AnimalController animalController;

    @BeforeEach
    void setUp() {
        this.animalController = new AnimalController();
        this.animalController.cadastrarCachorroFilhote();
        this.animalController.cadastrarElefanteFilhote();
        this.animalController.cadastrarMorcegoFilhote();
    }

    @Test
    void removerSucessoPeso() {
        assertEquals(2,this.animalController.remover());
    }

    @Test
    void removerSucessoPesoDois() {
        assertEquals(2,this.animalController.remover());
        assertEquals(1,this.animalController.remover());
    }

    @Test
    void removerSucessoIdade() {
        this.animalController.configurarRemocao("IDADE");
        assertEquals(1,this.animalController.remover());
    }

    @Test
    void removerSucessoIdadeVelho() {
        this.animalController.configurarRemocao("IDADE");
        this.animalController.crescer(3);
        assertEquals(3,this.animalController.remover());
    }

}