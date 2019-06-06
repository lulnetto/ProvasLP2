package Prova1;

import java.util.Arrays;

public class DoD
{
    private Cliente[] clientes;
    private Delivery[] deliverys;
    private int maxEntregas;
    private int contDeliverys;

    public DoD(Cliente[] clientes)
    {
        this.clientes = clientes;
        this.deliverys = new Delivery[5];
        this.maxEntregas = 6;
        this.contDeliverys = 0;
    }
    public DoD(Cliente[] clientes,int maxEntregas)
    {
        this.clientes = clientes;
        this.deliverys = new Delivery[maxEntregas];
        this.maxEntregas = maxEntregas;
        this.contDeliverys = 0;
    }
    public boolean addDelivery(Delivery d)
    {
        boolean flag = false;
        for (int i = 0; i < clientes.length; i++)
        {
            if (d.getIdCliente() == clientes[i].getId())
            {
                flag = true;
            }
        }
        for (Delivery entrega: deliverys)
        {
            if (entrega != null && entrega.equals(d))
            {
                flag = false;
            }
        }
        if (contDeliverys > maxEntregas || !flag)
        {
            return false;
        } else
        {
            deliverys[contDeliverys] = d;
            deliverys[contDeliverys].setStatus("ongoing");
            contDeliverys += 1;
            return true;
        }
    }
    public String listDoD()
    {
        String nova = "";
        for (int i = 0; i < maxEntregas; i++)
        {
            if (deliverys[i] != null)
            {
                nova += deliverys[i].toString() + System.lineSeparator();
            }
        }
        if (nova.equals(""))
        {
            return "Nenhuma entrega cadastrada!";
        } else
        {
            return nova.substring(0, nova.length()-1);
        }
    }
    public boolean finishDelivery(int pos)
    {
        String status = deliverys[pos].getStatus();
        if (pos < 0 || pos >= maxEntregas)
        {
            throw new IllegalArgumentException("Posição Invalida!");
        } else if(status.equals("finished"))
        {
            return false;
        } else
        {
            deliverys[pos].setStatus("finished");
            return true;
        }

    }
    public String listFinished()
    {
        String nova = "";
        for (Delivery d: deliverys)
        {
            if (d.getStatus().equals("finished"))
            {
                nova += d.toString() + System.lineSeparator();
            }
        }
        if (nova.equals(""))
        {
            return "Nenhuma entrega finalizada!";
        } else
        {
            return nova.substring(0, nova.length()-1);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoD doD = (DoD) o;
        return Arrays.equals(clientes, doD.clientes) &&
                Arrays.equals(deliverys, doD.deliverys);
    }

    @Override
    public int hashCode()
    {
        int result = Arrays.hashCode(clientes);
        result = 31 * result + Arrays.hashCode(deliverys);
        return result;
    }
}
