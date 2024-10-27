package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Antonio", "Augusto", "José", "Cristina", "Pedro"};
        for(String candidato : candidatos) {

        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void ligarParaCandidatos(){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu) {
            System.out.println("CONTATO REALIZADO COM SUCESSO");

        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO");
        }

    }

    static void analisarCandidato(double salaraioPretendido) {
        double salarioBase = 2000.0;
        if (salaraioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salaraioPretendido == salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }

    static void selecionarCandidatos() {
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Antonio", "Augusto", "José", "Cristina", "Pedro"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " selecionou este valor");
            if (salarioPretendido < salarioBase) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void immprimirSelecionados(){
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Antonio", "Augusto", "José", "Cristina", "Pedro"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length ; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);

        }
    }
}
