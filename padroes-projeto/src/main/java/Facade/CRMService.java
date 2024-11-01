package Facade;

public class CRMService {
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Gravando cliente");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
