package strategy;

public class ComportamentoAgrassivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("movendo-se agressivamente");
    }
}
