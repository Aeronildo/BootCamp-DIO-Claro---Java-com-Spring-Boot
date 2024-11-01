import java.util.ArrayList;
import java.util.List;

public class SistemaNotificacao {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(Pedido pedido) {
        for (Observador observador : observadores) {
            observador.atualizar(pedido);
        }
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }
}
