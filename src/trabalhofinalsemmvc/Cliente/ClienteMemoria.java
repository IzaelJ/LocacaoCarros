package trabalhofinalsemmvc.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteMemoria {

    public static List<Cliente> clientes;
    
    public ClienteMemoria(){
        clientes = new ArrayList();
    }
    
    public void atualizar(Cliente cliente){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getCpf() == cliente.getCpf() ){
                clientes.add(i, cliente);
                return;
            }
        }
    }

    public void excluir(Cliente cliente){
        clientes.remove(cliente);
    }
    
    public void excluirLista(List<Cliente> listaParaExcluir){
        listaParaExcluir.forEach((cliente) -> {
            excluir(cliente);
        });
    }
    
    public void inserir(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getLista() {
               
        return clientes;
    }

    public List<Cliente> encontraCliente(String text) {
        List<Cliente> resultadoPesquisa = new ArrayList();
        
        for(Cliente cliente : clientes){
            if(cliente.getNome().equals(text)){
                resultadoPesquisa.add(cliente);
            }else if(cliente.getSobrenome().equals(text)){
                resultadoPesquisa.add(cliente);
            }else if(cliente.getCpf().equals(text)){
                resultadoPesquisa.add(cliente);
            }
        }        
        return resultadoPesquisa;
    }
}
