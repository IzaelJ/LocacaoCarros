/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package trabalhofinalsemmvc.Veiculo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import trabalhofinalsemmvc.Cliente.Cliente;
import trabalhofinalsemmvc.Cliente.ClienteMemoria;
import trabalhofinalsemmvc.Cliente.ClienteTableModel;
import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;
import utils.ModeloAutomovel;
import utils.ModeloMotocicleta;
import utils.ModeloVan;

/**
 *
 * @author junio
 */
public class TelaLocarVeiculo extends javax.swing.JPanel {

    private final TelaLocarVeiculoTableModel locarVeiculoTableModel = new TelaLocarVeiculoTableModel();
    private ClienteTableModel clienteTableModel = new ClienteTableModel();
    private ClienteMemoria clienteMemoria = new ClienteMemoria();
    private VeiculoMemoria veiculoMemoria = new VeiculoMemoria();

    /**
     * Creates new form TelaLocarVeiculo
     */
    public TelaLocarVeiculo() {
        initComponents();
        grupoFiltroVeiculo.add(radioMarca);
        grupoFiltroVeiculo.add(radioTipo);
        grupoFiltroVeiculo.add(radioCategoria);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoFiltroVeiculo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoLocar = new javax.swing.JButton();
        campoDiasLocacao = new javax.swing.JFormattedTextField();
        campoDataLocacao = new javax.swing.JFormattedTextField();
        valorTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        radioTipo = new javax.swing.JRadioButton();
        radioMarca = new javax.swing.JRadioButton();
        radioCategoria = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVeiculos = new javax.swing.JTable();
        comboFiltro = new javax.swing.JComboBox<>();
        botaofiltrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        textoPesquisarCliente = new javax.swing.JTextField();
        pesquisarCliente = new javax.swing.JButton();

        jLabel4.setText("Dias de loca????o");

        jLabel3.setText("Data de Locacao");

        botaoLocar.setText("Locar");
        botaoLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocarActionPerformed(evt);
            }
        });

        campoDiasLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoDiasLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDiasLocacaoActionPerformed(evt);
            }
        });

        campoDataLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDiasLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoLocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(campoDiasLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(valorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLocar)
                .addGap(17, 17, 17))
        );

        radioTipo.setText("Tipo");
        radioTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoActionPerformed(evt);
            }
        });

        radioMarca.setText("Marca");
        radioMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarcaActionPerformed(evt);
            }
        });

        radioCategoria.setText("Categoria");
        radioCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(radioTipo)
                .addGap(50, 50, 50)
                .addComponent(radioMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioCategoria)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTipo)
                    .addComponent(radioMarca)
                    .addComponent(radioCategoria))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tabelaVeiculos.setModel(locarVeiculoTableModel);
        tabelaVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaVeiculos);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>());
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        botaofiltrar.setText("Filtrar");
        botaofiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaofiltrar))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaofiltrar))
                .addGap(237, 237, 237))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        jLabel1.setText("Pesquisar cliente");

        clienteTable.setModel(clienteTableModel);
        clienteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clienteTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(clienteTable);

        pesquisarCliente.setText("Pesquisar");
        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoPesquisarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisarCliente)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
        // TODO add your handling code here:
        try {
            clienteTableModel.setListaClientes(clienteMemoria.encontraCliente(textoPesquisarCliente.getText()));
        } catch (NullPointerException e) {
            this.apresentaInfo("?? necess??rio informar um cliente");
        }


    }//GEN-LAST:event_pesquisarClienteActionPerformed

    private void radioTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoActionPerformed

        comboFiltro.removeAllItems();
        comboFiltro.addItem("Autom??vel");
        comboFiltro.addItem("Motocicleta");
        comboFiltro.addItem("Van");
    }//GEN-LAST:event_radioTipoActionPerformed

    private void radioMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarcaActionPerformed
        comboFiltro.removeAllItems();
        for (Marca a : Marca.values()) {
            comboFiltro.addItem(a.toString());
        }

    }//GEN-LAST:event_radioMarcaActionPerformed

    private void radioCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCategoriaActionPerformed
        comboFiltro.removeAllItems();
        for (Categoria a : Categoria.values()) {
            comboFiltro.addItem(a.toString());
        }
    }//GEN-LAST:event_radioCategoriaActionPerformed

    private void botaofiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofiltrarActionPerformed
        try {
            executaFiltroTabela();
        } catch (Exception ex) {
            this.apresentaInfo("?? necess??rio escolher um filtro!");
        }

    }//GEN-LAST:event_botaofiltrarActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void botaoLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocarActionPerformed
        try {
            String x = campoDiasLocacao.getText();
            double a = Double.parseDouble(x);
            Veiculo veiculoParaLocar = locarVeiculoTableModel.getVeiculo(tabelaVeiculos.getSelectedRow());
            double preco = veiculoMemoria.valorDiaria(veiculoParaLocar);
            double ax = a * preco;
            x = String.valueOf(ax);
            valorTotal.setText("Valor: " + x + " total");
            realizarLocacao();
        } catch (java.lang.NumberFormatException e) {
            this.apresentaErro("Nao deixe campos vazios! ");
        }


    }//GEN-LAST:event_botaoLocarActionPerformed

    private void campoDiasLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDiasLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDiasLocacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLocar;
    private javax.swing.JButton botaofiltrar;
    private javax.swing.JFormattedTextField campoDataLocacao;
    private javax.swing.JFormattedTextField campoDiasLocacao;
    private javax.swing.JTable clienteTable;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.ButtonGroup grupoFiltroVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisarCliente;
    private javax.swing.JRadioButton radioCategoria;
    private javax.swing.JRadioButton radioMarca;
    private javax.swing.JRadioButton radioTipo;
    private javax.swing.JTable tabelaVeiculos;
    private javax.swing.JTextField textoPesquisarCliente;
    private javax.swing.JLabel valorTotal;
    // End of variables declaration//GEN-END:variables
    private void executaFiltroTabela() {

        if (radioCategoria.isSelected()) {

            List<Veiculo> veiculosFiltrados = veiculoMemoria.getListaCategoria(Categoria.valueOf(comboFiltro.getSelectedItem().toString()));
            locarVeiculoTableModel.setListaVeiculos(veiculosFiltrados);
        } else if (radioMarca.isSelected()) {
            List<Veiculo> veiculosFiltrados = veiculoMemoria.getListaMarca(Marca.valueOf(comboFiltro.getSelectedItem().toString()));
            locarVeiculoTableModel.setListaVeiculos(veiculosFiltrados);
        } else if (radioTipo.isSelected()) {
            List<Veiculo> veiculosFiltrados;
            switch (comboFiltro.getSelectedItem().toString()) {
                case "Autom??vel":
                    veiculosFiltrados = veiculoMemoria.getListaAutomovel();
                    locarVeiculoTableModel.setListaVeiculos(veiculosFiltrados);
                    break;
                case "Motocicleta":
                    veiculosFiltrados = veiculoMemoria.getListaMotocicleta();
                    locarVeiculoTableModel.setListaVeiculos(veiculosFiltrados);
                    break;
                case "Van":
                    veiculosFiltrados = veiculoMemoria.getListaVan();
                    locarVeiculoTableModel.setListaVeiculos(veiculosFiltrados);
                default:

            }
        }
    }

    private void realizarLocacao() {
        Cliente clienteParaLocar = null;
        Veiculo veiculoParaLocar = null;
        
        try {
            clienteParaLocar = clienteTableModel.getCliente(clienteTable.getSelectedRow());
            

        } catch (IndexOutOfBoundsException ex) {
            this.apresentaInfo("Selecione todos os campos antes de prosseguir");
        }
        
        try {
            veiculoParaLocar = locarVeiculoTableModel.getVeiculo(tabelaVeiculos.getSelectedRow());

        } catch (IndexOutOfBoundsException ex) {
            this.apresentaInfo("Selecione todos os campos antes de prosseguir");
        }

        int diasLocacao = Integer.parseInt(campoDiasLocacao.getText());
        Calendar dataLocacao = Calendar.getInstance();
        dataLocacao.setTime((Date) campoDataLocacao.getValue());
        veiculoMemoria.locar(clienteParaLocar, veiculoParaLocar, diasLocacao, dataLocacao);

    }

    //M??todos de mensagem
    public void apresentaErro(String erro) {
        JOptionPane.showMessageDialog(null, erro + "\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void apresentaInfo(String info) {
        JOptionPane.showMessageDialog(null, info + "\n", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
    }

}
