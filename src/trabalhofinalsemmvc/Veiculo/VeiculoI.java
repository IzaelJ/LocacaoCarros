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
public interface VeiculoI {

    public void locar(int dias, Calendar data, Cliente cliente);

    public void vender();

    public void devolver();
    
    public Estado getEstado();
    
    public Marca getMarca();
    
    public Categoria getCategoria();
    
    public Locacao getLocacao();
    
    public String getPlaca();
    
    public int getAno();

    public double getValorParaVenda();

    public double getValorDiariaLocacao();
}
