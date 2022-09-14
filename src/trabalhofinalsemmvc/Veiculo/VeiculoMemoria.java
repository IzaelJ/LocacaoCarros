package trabalhofinalsemmvc.Veiculo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import trabalhofinalsemmvc.Cliente.Cliente;

import trabalhofinalsemmvc.utils.Estado;
import trabalhofinalsemmvc.utils.Marca;
import utils.Categoria;
import utils.ModeloAutomovel;
import utils.ModeloMotocicleta;
import utils.ModeloVan;

public class VeiculoMemoria {

    public static List<Veiculo> veiculos = new ArrayList();

    public VeiculoMemoria() {

    }

    public void atualizar(Veiculo veiculo) {

    }

    public void excluir(Veiculo Veiculo) {
        veiculos.remove(Veiculo);
    }

    public void excluirLista(List<Veiculo> listaParaExcluir) {
        listaParaExcluir.forEach((Veiculo) -> {
            excluir(Veiculo);
        });
    }

    public void inserir(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> getLista() {
        return veiculos;
    }

    public List<Veiculo> getListaAlugaveis() {
        List<Veiculo> alugaveis = new ArrayList();
        for (Veiculo veiculo : veiculos) {
            if (Estado.DISPONIVEL.equals(veiculo.getEstado())) {
                alugaveis.add(veiculo);
            }
        }
        return alugaveis;
    }

    public List<Veiculo> getListaLocados() {

        List<Veiculo> locados = new ArrayList();
        for (Veiculo veiculo : veiculos) {
            if (Estado.LOCADO.equals(veiculo.getEstado())) {
                locados.add(veiculo);
            }
        }
        return locados;
    }

    public List<Veiculo> getListaAutomovel() {
        List<Veiculo> veiculosFiltrados = new ArrayList();
        
        for (Veiculo veiculo : getListaAlugaveis()) {
            if (veiculo instanceof Automovel) {
                veiculosFiltrados.add(veiculo);
            }
        }
        
        return veiculosFiltrados;
    }

    public List<Veiculo> getListaMotocicleta() {
        List<Veiculo> veiculosFiltrados = new ArrayList();
        for (Veiculo veiculo : getListaAlugaveis()) {
            if (veiculo instanceof Motocicleta) {
                veiculosFiltrados.add(veiculo);
            }
        }
        return veiculosFiltrados;
    }

    public List<Veiculo> getListaVan() {
        List<Veiculo> veiculosFiltrados = new ArrayList();
        for (Veiculo veiculo : getListaAlugaveis()) {
            if (veiculo instanceof Van) {
                veiculosFiltrados.add(veiculo);
            }
        }
        return veiculosFiltrados;
    }


    public List<Veiculo> getListaMarca(Marca marca) {

        List<Veiculo> veiculosFiltrados = new ArrayList();
        for (Veiculo veiculo : getListaAlugaveis()) {
            if (marca.equals(veiculo.getMarca())) {
                veiculosFiltrados.add(veiculo);
            }
        }
        return veiculosFiltrados;
    }

    public List<Veiculo> getListaCategoria(Categoria categoria) {

        List<Veiculo> veiculosFiltrados = new ArrayList();
        for (Veiculo veiculo : getListaAlugaveis()) {
            if (categoria.equals(veiculo.getCategoria())) {
                veiculosFiltrados.add(veiculo);
            }
        }
        return veiculosFiltrados;
    }

    public void devolverVeiculo(Veiculo veiculo) {
        veiculos.get(veiculos.indexOf(veiculo)).devolver();
    }

    public void devolverLista(List<Veiculo> listaParaDevolver) {
        listaParaDevolver.forEach((veiculo) -> {
            devolverVeiculo(veiculo);
        });
    }

    public void vender(Veiculo veiculo) {
        veiculos.get(veiculos.indexOf(veiculo)).vender();
    }

    void venderLista(List<Veiculo> veiculosSelecionados) {
        veiculosSelecionados.forEach((veiculo) -> {
            vender(veiculo);
        });
    }

    void locar(Cliente cliente, Veiculo veiculo, int dias, Calendar data) {
        veiculos.get(veiculos.indexOf(veiculo)).locar(dias, data, cliente);

    }
}
