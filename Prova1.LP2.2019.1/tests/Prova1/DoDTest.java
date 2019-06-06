package Prova1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoDTest
{
    private Cliente[] clientes;
    private DoD dods;
    private DoD dods2;
    private Delivery d1;
    private Delivery d2;
    private Delivery d3;

    @BeforeEach
    void setUp()
    {
        clientes = new Cliente[2];
        clientes[0] = new Cliente(118,"Matheus Gaudencio","SPLab(Quase nunca)");
        clientes[1] = new Cliente(119,"Lívia Sampaio","Rua dos bobos");
        dods = new DoD(clientes);
        dods2 = new DoD(clientes, 2);
        d1 = new Delivery("Shampoo","GauGau",118);
        d2 = new Delivery("PentePCachorro","LiLi",119);
        d3 = new Delivery("PentePCachorro","LiLi",120);
    }

    @Test
    void addDeliverySucesso()
    {
        assertTrue(dods.addDelivery(d1));
    }
    @Test
    void addDeliveryLimite()
    {
        dods2.addDelivery(d1);
        assertTrue(dods2.addDelivery(d2));
    }
    @Test
    void addDeliveryFalha()
    {
        dods.addDelivery(d1);
        assertFalse(dods.addDelivery(d1));
    }
    @Test
    void addDeliveryFalhaCliente()
    {
        assertFalse(dods.addDelivery(d3));
    }

    @Test
    void finishDeliveryTest()
    {
        dods.addDelivery(d1);
        assertTrue(dods.finishDelivery(0));
    }
    @Test
    void finishDeliveryFalha()
    {
        dods.addDelivery(d1);
        dods.finishDelivery(-1);
        assertFalse(dods.finishDelivery(0));
    }

}