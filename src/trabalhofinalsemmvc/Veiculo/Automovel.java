/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;




import trabalhofinalsemmvc.utils.Estado;
import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;
import utils.ModeloAutomovel;



/**
 *
 * @author junio
 */
public class Automovel extends Veiculo {
    
    ModeloAutomovel modelo;
    
    public Automovel(double valorDeCompra, String placa, int ano, Estado estado, Marca marca, Categoria categoria, ModeloAutomovel modelo) {
        super(valorDeCompra, placa, ano, estado, marca, categoria);
        this.modelo = modelo;
     
    }; 
    

    @Override
    public double getValorDiariaLocacao() {
        switch (super.getCategoria()) {
            case POPULAR:
                return 100.00;
            case INTERMEDIARIO:
                return 300.00;
            case LUXO:
                return 450.00;
            default:
                return 0.0;
        }

    }
    
    public ModeloAutomovel getModelo() {
        return modelo;
    }
    
}
