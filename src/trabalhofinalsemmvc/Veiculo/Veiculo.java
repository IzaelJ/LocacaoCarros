/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;

import java.util.Calendar;
import trabalhofinalsemmvc.Cliente.Cliente;
import trabalhofinalsemmvc.utils.Estado;
import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;

/**
 *
 * @author junio
 */
public abstract class Veiculo implements VeiculoI  {
    private double valorDeCompra;
    private String placa;
    private int ano;
    private Estado estado;
    private Locacao locacao;
    private Marca marca;
    Categoria categoria;
    
    public Veiculo(double valorDeCompra, String placa, int ano, Estado estado, Marca marca, Categoria categoria) {
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
        this.estado = estado;
        this.marca = marca;
        this.categoria = categoria;
     
    }; 
    
    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        this.locacao = new Locacao(dias, data, cliente, getValorDiariaLocacao());
        this.estado = Estado.LOCADO;
        
    }

    @Override
    public void vender() {
        estado = Estado.VENDIDO;
    }

    @Override
    public void devolver() {
        estado = Estado.DISPONIVEL;
    }
    
    @Override
    public Estado getEstado() {
        return this.estado;
    }
    
    @Override
    public Marca getMarca() {
        return this.marca;
    }
    
    @Override
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    @Override
    public Locacao getLocacao() {
        return this.locacao;
    }
    
    @Override
    public String getPlaca() {
        return this.placa;
    }
    
    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public double getValorParaVenda() {
        double valorParaVenda = valorDeCompra - ((ano - 2022) * 0.15 * valorDeCompra);
        if (valorParaVenda < (valorDeCompra / 0.1)  || valorParaVenda < 0 ) {
            return valorParaVenda = valorDeCompra * 0.1;
        }
        else {
            return valorParaVenda;
        }
    }

    @Override
    public abstract double getValorDiariaLocacao();
    
       
}
