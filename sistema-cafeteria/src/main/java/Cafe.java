public class Cafe extends Produto {
    public Cafe() {
        descricao = "Café";
    }

    @Override
    public double preco() {
        return 5.00;
    }
}