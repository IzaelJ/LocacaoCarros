/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eduar
 */
public class TelaDevolverVeiculosTableModel extends AbstractTableModel{
    private String[] colunas = new String[]{"Nome do Cliente", "Placa", "Marca", "Modelo", "Ano", "Data Locação", "Preço Diária", "Dias locado","Valor Locação"};
    SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");

    private List<Veiculo> lista = new ArrayList();

    public TelaDevolverVeiculosTableModel(List<Veiculo> lista ) {
        this.lista=lista;
    }

    public TelaDevolverVeiculosTableModel() {
    }  
   
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
     @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = lista.get(rowIndex);
        if(veiculo.getLocacao() != null){
            switch (columnIndex) {
                case 0: return veiculo.getLocacao().getCliente().getNome();
                case 1: return veiculo.getPlaca();
                case 2: return veiculo.getMarca();
                case 3: return ((veiculo instanceof Automovel) ? ((Automovel)veiculo).getModelo() : ((veiculo instanceof Van) ? ((Van)veiculo).getModelo() : ((Motocicleta)veiculo).getModelo()));
                case 4: return veiculo.getAno();
                case 5: return formatoData.format(veiculo.getLocacao().getData().getTime() ) ;
                case 6: return veiculo.getValorDiariaLocacao();
                case 7: return veiculo.getLocacao().getDias();
                case 8: return veiculo.getLocacao().getValor();
                default : return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        int linha = this.lista.indexOf(veiculo);
        boolean result = this.lista.remove(veiculo);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaVeiculo(Veiculo veiculo) {
        this.lista.add(veiculo);
        this.fireTableDataChanged();
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }

    public void setListaVeiculos(List<Veiculo> veiculos) {

        this.lista = veiculos;
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(0,veiculos.size()-1);
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);
    }

    public Veiculo getVeiculo(int linha){
        return lista.get(linha);
    }

    void removeVeiculos(List<Veiculo> listaParaExcluir) {
        listaParaExcluir.forEach((veiculo) -> {
            removeVeiculo(veiculo);
        });
    }
    
}
