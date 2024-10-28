package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private double xpTotal = 0;
    private int nivel = 1;

    public void inscreverBootcamp(Bootcamp bootcamp){
        if (bootcamp.verificarVagas()) {
            this.conteudosInscritos.addAll(bootcamp.getConteudos());
            bootcamp.getDevsInscritos().add(this);
        } else {
            System.out.println("Não há mais vagas disponíveis neste Bootcamp.");
        }
    }

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            this.xpTotal += conteudo.get().calcularXp();
            verificarNivel();
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void verificarNivel() {
        if (xpTotal >= 100) {
            this.nivel = 2;
        }
        if (xpTotal >= 200) {
            this.nivel = 3;
        }
        // Adapte conforme o sistema de níveis desejado
    }

    public void listarConteudosInscritos() {
        if (conteudosInscritos.isEmpty()) {
            System.out.println("Nenhum conteúdo inscrito.");
        } else {
            conteudosInscritos.forEach(c -> System.out.println(c.getTitulo()));
        }
    }

    // Getters e Setters
    public double getXpTotal() {
        return xpTotal;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
