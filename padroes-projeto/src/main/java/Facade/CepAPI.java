package Facade;

import singleton.SingletonApressado;

public class CepAPI {
    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }
    public static CepAPI getInstance() {

        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Campina Grande";
    }

    public String recuperarEstado(String cep) {
        return "Paraíba";
    }
}
