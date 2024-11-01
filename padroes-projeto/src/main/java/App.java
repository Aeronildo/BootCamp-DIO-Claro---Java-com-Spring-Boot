import Facade.Facade;
import singleton.SingletonApressado;
import singleton.SingletonPreguicoso;
import singleton.SingletonPreguicosoHolder;
import strategy.ComportamentoAgrassivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class App {
    public static void main(String[] args) {
        SingletonPreguicoso singletonPreguicoso = SingletonPreguicoso.getInstance();
        System.out.println(singletonPreguicoso);
        singletonPreguicoso = SingletonPreguicoso.getInstance();
        System.out.println(singletonPreguicoso);

        SingletonPreguicosoHolder singletonPreguicosoHolder = SingletonPreguicosoHolder.getInstance();
        System.out.println(singletonPreguicosoHolder);
        singletonPreguicosoHolder = SingletonPreguicosoHolder.getInstance();
        System.out.println(singletonPreguicosoHolder);

        SingletonApressado singletonApressado = SingletonApressado.getInstance();
        System.out.println(singletonApressado);
        singletonApressado = SingletonApressado.getInstance();
        System.out.println(singletonApressado);


        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoAgrassivo comportamentoAgrassivo = new ComportamentoAgrassivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);

        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("joão", "24800-000");

    }
}
