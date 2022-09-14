/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;



import trabalhofinalsemmvc.utils.Estado;

import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;
import utils.ModeloVan;



/**
 *
 * @author junio
 */
public class Van extends Veiculo {
    ModeloVan modelo;
    
   public Van(double valorDeCompra, String placa, int ano, Estado estado, Marca marca, Categoria categoria, ModeloVan modelo) {
        super(valorDeCompra, placa, ano, estado, marca, categoria);
        this.modelo = modelo;
     
    }; 
    
    public ModeloVan getModelo() {
        return modelo;
    }
    
    

    @Override
    public double getValorDiariaLocacao() {
            switch (super.getCategoria()) {
            case POPULAR:
                return 200.00;    
            case INTERMEDIARIO:
                return 400.00;
            case LUXO:
                return 600.00;
            default:
                return 0.0;
        }
    }
}
