package Facade;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado = CepAPI.getInstance().recuperarEstado(cep);
        CRMService.gravarCliente(nome, cep, cidade, estado);

    }
}
