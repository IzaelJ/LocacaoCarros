package trabalhofinalsemmvc.Veiculo;


import java.util.Calendar;
import trabalhofinalsemmvc.Cliente.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author junio
 */
public class Locacao {
    private int dias;
    private Calendar data; 
    private Cliente cliente;
    private double valor;
    
    public Locacao (int dias, Calendar data, Cliente cliente, double valor) {
        this.dias = dias;
        this.data = data;
        this.cliente  = cliente;
        this.valor = valor;
    }

    public int getDias() {
        return dias;
    }

    public Calendar getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public double getValor() {
        return this.valor;
    }
    
    
}
