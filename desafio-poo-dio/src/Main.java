import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos com níveis de dificuldade
        Curso curso1 = new Curso("curso java", "descrição curso java", 8, "avançado");
        Curso curso2 = new Curso("curso js", "descrição curso js", 4, "intermediário");

        // Criando uma mentoria com mentor
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now(), "Professor João");

        // Criando Bootcamp com limite de vagas
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer", 2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Dev Camila se inscreve no bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:");
        devCamila.listarConteudosInscritos();

        // Camila progride em dois conteúdos
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:");
        devCamila.listarConteudosInscritos();
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        System.out.println("Nível Camila: " + devCamila.getNivel());

        System.out.println("-------");

        // Dev João tenta se inscrever no bootcamp (há vagas disponíveis)
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:");
        devJoao.listarConteudosInscritos();

        // João progride em todos os conteúdos
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:");
        devJoao.listarConteudosInscritos();
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP João: " + devJoao.calcularTotalXp());
        System.out.println("Nível João: " + devJoao.getNivel());

        System.out.println("-------");

        // Tentativa de inscrição de um terceiro dev no bootcamp sem vagas
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:");
        devMaria.listarConteudosInscritos(); // Deve exibir que não há conteúdos, já que não há mais vagas
    }
}
