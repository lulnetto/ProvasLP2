package Prova1;

import java.util.Objects;

public class Delivery
{
    private String produto;
    private String fornecedor;
    private int idCliente;
    private String status;

    public Delivery(String produto, String fornecedor, int idCliente)
    {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.idCliente = idCliente;
        this.status = "ready";
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public int getIdCliente()
    {
        return this.idCliente;
    }

    @Override
    public String toString()
    {
        return "Delivery [idCliente=" + this.idCliente + ", pedido=" + this.produto + ", fornecedor=" + this.fornecedor + ", status=" + this.status + "]\n";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return idCliente == delivery.idCliente &&
                Objects.equals(produto, delivery.produto) &&
                Objects.equals(fornecedor, delivery.fornecedor);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(produto, fornecedor, idCliente);
    }
}
