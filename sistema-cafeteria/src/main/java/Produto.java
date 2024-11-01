abstract class Produto {
    String descricao;

    public String getDescricao() {
        return descricao;
    }

    public abstract double preco();  // Método abstrato para o preço
}
