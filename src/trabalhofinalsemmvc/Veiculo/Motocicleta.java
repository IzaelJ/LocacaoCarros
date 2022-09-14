/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;

import trabalhofinalsemmvc.utils.Estado;

import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;

import utils.ModeloMotocicleta;

/**
 *
 * @author junio
 */
public class Motocicleta extends Veiculo {

    ModeloMotocicleta modelo;

    public Motocicleta(double valorDeCompra, String placa, int ano, Estado estado, Marca marca, Categoria categoria, ModeloMotocicleta modelo) {
        super(valorDeCompra, placa, ano, estado, marca, categoria);
        this.modelo = modelo;

    }

    ; 
    
    public ModeloMotocicleta getModelo() {
        return modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (super.getCategoria()) {
            case POPULAR:
                return 70.00;
            case INTERMEDIARIO:
                return 200.00;
            case LUXO:
                return 350.00;
            default:
                return 0.0;
        }
    }

}
